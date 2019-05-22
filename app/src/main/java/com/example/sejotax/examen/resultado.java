package com.example.sejotax.examen;

import android.app.Activity;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class resultado extends AppCompatActivity {
EditText et1;
TextView tv1;


    public String nombre="";
    String aux = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        et1 = findViewById(R.id.et1);
        String[] archivos = fileList();
        tv1 = findViewById(R.id.tv1);
        nombre = getIntent().getStringExtra("val");
        this.setTitle(nombre);
        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("num");
        if(dato.equals("1")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("primero.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea+"";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);

        } catch (Exception e) {

        }
        }
        if(dato.equals("2")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("segundo.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea + "";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);

        } catch (Exception e) {
        }
        }
        if(dato.equals("3")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("tercero.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea + "";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);
        } catch (Exception e) {
        }
        }
        if(dato.equals("4")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("cuarto.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea + "";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);
        } catch (Exception e) {
        }}
        if(dato.equals("5")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("quinto.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea+"";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);
        } catch (Exception e)
        {
    }
        }
        if(dato.equals("6")){try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("sexto.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea+"";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);
        } catch (Exception e)
        {}}
        if(dato.equals("7")) {
            try {
                InputStreamReader archivo = new InputStreamReader(
                        openFileInput("septimo.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String todo = "";
                while (linea != null) {
                    todo = linea + "";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(todo);
            } catch (Exception e) {
            }
        }if(dato.equals("8")){
        try {
            InputStreamReader archivo = new InputStreamReader(
                    openFileInput("octavo.txt"));
            BufferedReader br = new BufferedReader(archivo);
            String linea = br.readLine();
            String todo = "";
            while (linea != null) {
                todo = linea+"";
                linea = br.readLine();
            }
            br.close();
            archivo.close();
            et1.setText(todo);
        } catch (Exception e)
        {}
        }
    }
        public void calcular (View view){

            try{
                Bundle bundle = getIntent().getExtras();
                String dato = bundle.getString("num");
        if (dato.equals("1")) {
            String valor1 = et1.getText().toString();
            double nro1 = Integer.parseInt(valor1);
            double suma = nro1 - 237.15;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  C°");

            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "primero.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }


        }
        if (dato.equals("2")) {
            String valor1 = et1.getText().toString();
            double nro1 = Integer.parseInt(valor1);
            double suma = nro1 + 237.15;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  K°");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "segundo.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
        }
        if (dato.equals("3")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = (nro1*9/5)+32;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  F°");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "tercero.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
        }
        if (dato.equals("4")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = (nro1 -32)*5/9;;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  C°");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "cuarto.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
        }
        if (dato.equals("5")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 * 100;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  cm");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "quinto.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
        }
        if (dato.equals("6")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 / 100;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  m");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "sexto.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
        }
        if (dato.equals("7")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 * 2.54;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  plg");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "septimo.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }

        }
        if (dato.equals("8")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 / 2.54;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  cm");
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(
                        "octavo.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }

        }
            }catch (Exception e)
            {
                Toast.makeText(getApplicationContext(), "pon un número", Toast.LENGTH_SHORT).show();
            }
    }
}
