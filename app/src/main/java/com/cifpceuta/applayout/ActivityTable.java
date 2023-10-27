package com.cifpceuta.applayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }
    public void botonVolver(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}