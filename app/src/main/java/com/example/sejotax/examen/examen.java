package com.example.sejotax.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class examen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_examen);
    }

    public void uno(View view) {
        String a = "1";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "kelvin a celcius";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void dos(View view) {
        String a = "2";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "celsius a kelvin";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void tres(View view) {
        String a = "3";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "celcius a farenheit";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void cuatro(View view) {
        String a = "4";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "farenheit a celcius";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void cinco(View view) {
        String a = "5";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "metros a centimetros";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void seis(View view) {
        String a = "6";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "centimetros a metros";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void siete(View view) {
        String a = "7";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "centimetros a pulgadas";
        i.putExtra("val",b);
        startActivity(i);
    }
    public void ocho(View view) {
        String a = "8";
        Intent i=new Intent(this,resultado.class);
        i.putExtra("num",a);
        String b = "pulgadas a centimetros";
        i.putExtra("val",b);
        startActivity(i);
    }

}
