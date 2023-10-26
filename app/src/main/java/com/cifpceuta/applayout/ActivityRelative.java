package com.cifpceuta.applayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityRelative extends AppCompatActivity {

    private ListView lista;
    private String[] datos_lista;
    private Button btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        lista = (ListView) findViewById(R.id.lista);
        datos_lista = getResources().getStringArray(R.array.datos_lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datos_lista);
        lista.setAdapter(adapter);

    }
    public void botonCerrar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}