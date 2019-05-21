package com.example.sejotax.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class resultado extends AppCompatActivity {
EditText et1;
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        et1 =findViewById(R.id.et1);
        tv1 =findViewById(R.id.tv1);
    }

        public void calcular (View view){

            try{
        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("num");
        if (dato.equals("1")) {
            String valor1 = et1.getText().toString();
            double nro1 = Integer.parseInt(valor1);
            double suma = nro1 - 237;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  celcius");


        }
        if (dato.equals("2")) {
            String valor1 = et1.getText().toString();
            double nro1 = Integer.parseInt(valor1);
            double suma = nro1 + 237;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  kelvin");
        }
        if (dato.equals("3")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 / 33.8;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  farenheit");

        }
        if (dato.equals("4")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 * 33.8;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  celcius");
        }
        if (dato.equals("5")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 * 100;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  centimetros");
        }
        if (dato.equals("6")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 / 100;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  metros");
        }
        if (dato.equals("7")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 * 2.54;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  pulgada");

        }
        if (dato.equals("8")) {
            String valor1 = et1.getText().toString();
            int nro1 = Integer.parseInt(valor1);
            double suma = nro1 / 2.54;
            String resu = String.valueOf(suma);
            tv1.setText(resu + "  centimetro");
        }
            }catch (Exception e)
            {
                Toast.makeText(getApplicationContext(), "pon un número!!", Toast.LENGTH_SHORT).show();
            }
    }
}
