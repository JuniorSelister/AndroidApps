package com.sanguine.navapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callSecondActivity(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("Value1", "Aula 5");
        i.putExtra("Value2", "Descomplica");

        startActivity(i);
    }

}


