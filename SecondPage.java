package com.example.projectigor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.database.Cursor;


public class SecondForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_form);
    }
    SQLiteDatabase db;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        SubMenu subBadBoys=menu.addSubMenu(0,1,0,"Bad Boys");
        subBadBoys.add(0,11,0,"Bad Boys");


        SubMenu subBlackWidow=menu.addSubMenu(1,2,0,"Black Widow");
        subBlackWidow.add(1,21,0,"Black Widow");


        SubMenu subCrank=menu.addSubMenu(2,3,0,"Crank");
        subCrank.add(2,31,0,"Crank");


        SubMenu subFastAndFourius=menu.addSubMenu(3,4,0,"Fast And Fourius");
        subFastAndFourius.add(3,41,0,"Fast And Fourius");

        SubMenu subGhostbuster=menu.addSubMenu(4,5,0,"Ghostbuster");
        subGhostbuster.add(4,51,0,"Ghostbuster");

        SubMenu subIlPadrino=menu.addSubMenu(5,6,0,"Il Padrino");
        subIlPadrino.add(5,61,0,"Il Padrino");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ImageView myImage = (ImageView) findViewById(R.id.imageView);
        TextView mytext= (TextView) findViewById(R.id.txtResult2);
        int id = item.getItemId();
        int groupid = item.getGroupId();
        TextView result = (TextView) findViewById(R.id.txtResult);
        //if (groupid == 0) {
           // Toast.makeText(getApplicationContext(), "21:00-23:00", Toast.LENGTH_LONG).show();
       // }
        //if (groupid==1){
            //Toast.makeText(getApplicationContext(), "20:00-21:30", Toast.LENGTH_LONG).show();
        //}
        //if (groupid==2) {
            //Toast.makeText(getApplicationContext(), "22:30-23:59", Toast.LENGTH_LONG).show();
        //}
        switch (id) {
            case 11:
                myImage.setImageResource(R.drawable.badboys);
                result.setText("Bad Boys a 2020 American action comedy film that is the sequel to Bad Boys II (2003) and the third installment in the Bad Boys franchise\nIn Bad Boys for Life, Miami detectives Mike Lowrey and Marcus Burnett investigate a string of murders tied to Lowrey's troubled past.\nBad Boys is produced on Sunday at 21:00-23:00");
                return true;
            case 21:
                myImage.setImageResource(R.drawable.blackwidow);
                result.setText("Black Widow In Marvel Studios' action-packed spy thriller â€œBlack Widow,â€ Natasha Romanoff aka Black Widow confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises\nBlack Widow is produced on Monday at 20:00-21:30");
                return true;
            case 31:
                myImage.setImageResource(R.drawable.crank1);
                result.setText("The plot centres on a British hitman based in Los Angeles named Chev Chelios who is poisoned and must keep his adrenaline flowing constantly in order to keep himself alive.\nHe does so by various methods including taking drugs and getting into fights, while he tries to track down the man who poisoned him.\nCrank is produced on Tuesday at 22:30-23:59");
                return true;
            case 41:
                myImage.setImageResource(R.drawable.fast_furious);
                result.setText("Fast & Furious is a media franchise centered on a series of action films that are largely concerned with illegal street racing, heists, and spies.\nThe franchise also includes short films, a television series, live shows, video games, and theme park attractions.\nFast & Fourius is produced on Wednesday at 21:00-23:30");
                return true;
            case 51:
                myImage.setImageResource(R.drawable.ghostubster1);
                result.setText("They develop high-tech nuclear-powered equipment to capture and contain ghosts, although business is initially slow.\nAfter a paranormal encounter in her apartment, cellist Dana Barrett calls the Ghostbusters.\nGhostbuster is produced on Thursday at 20:00-21:30");
                return true;
            case 61:
                myImage.setImageResource(R.drawable.il_padrino);
                result.setText("Vito Corleone, godfather(Il Padrino) of the Corleone family, is a Sicilian immigrant.\nHe has become, after years of crime, mainly in the organization of illegal gambling, prostitution and union racketeering, the most powerful of the five Italian-American mafia leaders in the city.\nIl Padrino is produced on Saturday at 22:30-23:59");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
        public  void Look_seat_Cinema(View view)
    {
        Intent intent = new Intent(this,ThreeForm.class);
        startActivity(intent);
    }
    public  void CreateSql(View view)
        {
            try {
                db = getBaseContext().openOrCreateDatabase("DetailsClient.db", MODE_PRIVATE, null);
                db.execSQL("create table Details (name text,id integer,visa integer)");//×©×•×ž×¨ ×©× ×ª×¥×– ×•×ž×•×©×‘ ×‘×“×˜×‘××–×”
                Toast.makeText(this, "Database was created ...", Toast.LENGTH_LONG).show();
            }
            catch(Exception err)
            {
                Toast.makeText(this,err.getMessage(),Toast.LENGTH_LONG).show();
            }
        }
        public  void Click_Here_To_Order(View view)
        {
            Intent intent = new Intent(this, QuartoForm.class);
            startActivity(intent);

        }

}
