package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class web extends AppCompatActivity {

    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        et1= (EditText)findViewById(R.id.txt_url);
    }
    public void ir(View view){
        if (et1.getText().toString().isEmpty()){
            Toast.makeText(this,"Favor escribir la dirección web",Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this,navegacion.class);
            i.putExtra("sitioweb", et1.getText().toString());
            startActivity(i);
        }
    }
}