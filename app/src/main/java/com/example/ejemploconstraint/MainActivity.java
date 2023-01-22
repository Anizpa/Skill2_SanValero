package com.example.ejemploconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hola este es un Toast", Toast.LENGTH_SHORT).show();

        btn1 = (Button) findViewById(R.id.btnClaseAnonima);
        btn2 = (Button) findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la clase Anonima", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

        /*if (view.getId()==btn2.getId(){
            Toast.makeText(getApplicationContext(), "Desde el onclick implements", Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==R.id.btnonclick){
            Toast.makeText(getApplicationContext(), "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
        }*/

        switch (view.getId()){
            case R.id.btnonclick:
                Toast.makeText(getApplicationContext(), "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnImplements:
                Toast.makeText(getApplicationContext(), "Desde el onclick implements", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void eventoBoton(View view){
        Toast.makeText(getApplicationContext(), "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();

    }
}