package com.example.projectigor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuintoForm extends AppCompatActivity
{
    private  static final String FILE_NAME="comment.txt";
    EditText inputcomment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_form);
        inputcomment = findViewById(R.id.inputComment);
       // EditText comment = (EditText) findViewById(R.id.inputComment);
       // String str=comment.getText().toString();
       // Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }
    public  void Save(View view){
        String text= inputcomment.getText().toString();
        FileOutputStream fos= null;
        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            inputcomment.getText().clear();
            Toast.makeText(this,"Your comment is save to"+getFilesDir()+"/"+FILE_NAME,Toast.LENGTH_SHORT).show();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
                if(fos!=null){
                    try{
                    fos.close();
                }catch (IOException e){
                        e.printStackTrace();
                    }
            }
        }
    }
    public  void GetComment(View view)
    {
        FileInputStream fis = null;
        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }
            inputcomment.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
