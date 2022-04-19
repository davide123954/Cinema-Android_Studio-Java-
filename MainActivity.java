package com.example.projectigor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Press_Here_To_Order_Movie(View view)
    {
        Intent intent = new Intent(this,SecondForm.class);
        startActivity(intent);
    }
    public  void Watch_Trailer(View view)
    {
        Intent intent = new Intent(this,VideoForm.class);
        startActivity(intent);
    }
}
