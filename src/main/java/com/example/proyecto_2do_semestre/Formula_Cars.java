package com.example.proyecto_2do_semestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Formula_Cars extends AppCompatActivity {
    private Button btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_cars);
        btn11 = (Button)findViewById(R.id.btn11);
        volverAtras();
    }
    public void volverAtras(){
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant = new Intent(Formula_Cars.this,MainActivity2.class);
                startActivity(ant);
            }
        });


    }
}