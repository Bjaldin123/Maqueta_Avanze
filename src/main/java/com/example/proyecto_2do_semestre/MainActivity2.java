package com.example.proyecto_2do_semestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void sgtLuxuryCars (View v){
        Intent sig = new  Intent(this,Luxury_Cars.class);
        startActivity(sig);
    }
    public void sgtJapaneseCars(View v){
        Intent sig = new  Intent(this,Japanese_Cars.class);
        startActivity(sig);
    }
    public void sgtFormulaCars (View v){
        Intent sig = new  Intent(this,Formula_Cars.class);
        startActivity(sig);
    }
    public void sgtVintageCars (View v){
        Intent sig = new  Intent(this,Vintage_Cars.class);
        startActivity(sig);
    }

}