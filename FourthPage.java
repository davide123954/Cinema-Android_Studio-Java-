package com.example.projectigor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuartoForm extends AppCompatActivity {
    ArrayList<String> places= new ArrayList<String>();
    String [] seat=new String[]{"2A","1C","2C","3C"};
   public ListView listView;
   public ArrayList<String> arrayList;
   public ArrayAdapter adapter;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_form);
        button1=(Button) findViewById(R.id.button);
        }
        public void Start(View view)
        {
            places.clear();
            places.add("2A");
            places.add("1C");
            places.add("2C");
            places.add("3C");
            button1.setVisibility(view.INVISIBLE);
            ListView countriesList=(ListView) findViewById(R.id.selection);
            ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,places);
            countriesList.setAdapter(adapter);
            countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    TextView mytext=(TextView) findViewById(R.id.txtResult3);
                    String selectedItem =places.get(position);
                    mytext.setText("Your Seat is : " + selectedItem);//+ seat[position]);
                    button1.setVisibility(view.VISIBLE);
                }
            });
        }

    SQLiteDatabase db;
    public void Add_Order(View view)
    {
        String Name, Id, Visa;
        try {
            EditText name = (EditText) findViewById(R.id.inputName);
            EditText id = (EditText) findViewById(R.id.inputId);
            EditText visa = (EditText) findViewById(R.id.inputVisa);
            Name = name.getText().toString();
            Id = id.getText().toString();
            Visa = visa.getText().toString();
            //Test = .getText().toString();

            if (TextUtils.isEmpty(Name) || TextUtils.isEmpty(Id) || TextUtils.isEmpty(Visa))
                Toast.makeText(this, "All fields are required...", Toast.LENGTH_LONG).show();
            else {
                db = getBaseContext().openOrCreateDatabase("DetailsClient.db", MODE_PRIVATE, null);
                db.execSQL("insert into Details values('" + Name + "'," + Id + "," + Visa +")");
                //db.execSQL("insert into Products values('" + n + "'," + p + "," + s + ")");
                Toast.makeText(this, "Your order is successfull ...", Toast.LENGTH_LONG).show();
                name.setText("");
                id.setText("");
                visa.setText("");
            }
        }
        catch(Exception err)
        {
            Toast.makeText(this,err.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
    public  void Show_Details(View view)
    {
        db = getBaseContext().openOrCreateDatabase("DetailsClient.db", MODE_PRIVATE, null);
        TextView Result=(TextView) findViewById(R.id.txtResult);
        EditText name = (EditText) findViewById(R.id.inputName);
        EditText id = (EditText) findViewById(R.id.inputId);
        EditText visa = (EditText) findViewById(R.id.inputVisa);
        String strname="",strid="",strvisa="";
        String namemovie;
        int id1,visa1;
        Cursor query=db.rawQuery("select * from Details ",null);
        while(query.moveToNext())
        {
           namemovie=query.getString(0);
          id1=query.getInt(1);
          visa1=query.getInt(2);
          strname+=namemovie +"\t";
          strid+= id1 + "\t";
          strvisa+= visa1 + "\t";
       }
        query.close();
        db.close();
        Result.setText("Client Name:"+strname+"\n"+"Id client: "+strid+"\n"+"Card visa:"+strvisa);
    }
    public  void Thank(View view)
    {
        Intent intent = new Intent(this,QuintoForm.class);
        startActivity(intent);
    }
}
