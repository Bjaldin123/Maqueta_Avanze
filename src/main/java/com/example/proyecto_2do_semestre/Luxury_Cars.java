package com.example.proyecto_2do_semestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Luxury_Cars extends AppCompatActivity {
    private Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxury_cars);
        btn9 = (Button)findViewById(R.id.btn9);
        volverAtras();
    }
    public void volverAtras(){
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant = new Intent(Luxury_Cars.this,MainActivity2.class);
                startActivity(ant);
            }
        });


    }
}