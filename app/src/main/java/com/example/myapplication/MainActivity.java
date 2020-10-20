package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb_sumar, rb_restar,rb_multi,rb_div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//R = comunicacion con el layout

        et1 = (EditText)findViewById(R.id.txt_num1);//Casting
        et2 = (EditText)findViewById(R.id.txt_num2);
        rb_sumar = (RadioButton)findViewById(R.id.rb_sumar);
        rb_restar = (RadioButton)findViewById(R.id.rb_restar);
        rb_multi = (RadioButton)findViewById(R.id.rb_multi);
        rb_div = (RadioButton)findViewById(R.id.rb_div);
        tv1 = (TextView)findViewById(R.id.lb_resultado);

    }
    //Suma
    public void Calcular(View view){ //View
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        if(et1.getText().toString().isEmpty()||et2.getText().toString().isEmpty()){
            Toast.makeText(this, "Debe introducir un valor en ambas casillas",Toast.LENGTH_LONG).show();
        }else {

            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);

            if (rb_sumar.isChecked()==true){
                int suma= num1+num2;
                String result= String.valueOf(suma);
                tv1.setText(result);
            } else if(rb_restar.isChecked()==true){
                int resta= num1-num2;
                String result= String.valueOf(resta);
                tv1.setText(result);
            }else if(rb_multi.isChecked()==true){
                int multi= num1*num2;
                String result= String.valueOf(multi);
                tv1.setText(result);
            }else if(rb_div.isChecked()==true){
                if (num2 !=0){
                    float div= num1/num2;
                    String result= String.valueOf(div);
                    tv1.setText(result);
                }else{
                    Toast.makeText(this, "El segundo Valor debe ser diferente de 0", Toast.LENGTH_LONG).show();
                }
            }

        }
    }
    public void Siguiente(View view){
        Intent i = new Intent(this,web.class);
        startActivity(i);
    }
}