package com.example.proyecto_2do_semestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Japanese_Cars extends AppCompatActivity {
    private Button btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_cars);
        btn10 = (Button)findViewById(R.id.btn10);
        volverAtras();
    }
    public void volverAtras(){
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant = new Intent(Japanese_Cars.this,MainActivity2.class);
                startActivity(ant);
            }
        });


    }
}