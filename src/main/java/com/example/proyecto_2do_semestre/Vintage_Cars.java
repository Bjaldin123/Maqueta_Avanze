package com.example.proyecto_2do_semestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vintage_Cars extends AppCompatActivity {
    private Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vintage_cars);
        btn12 = (Button)findViewById(R.id.btn12);
        volverAtras();
    }
    public void volverAtras(){
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant = new Intent(Vintage_Cars.this,MainActivity2.class);
                startActivity(ant);
            }
        });


    }
}