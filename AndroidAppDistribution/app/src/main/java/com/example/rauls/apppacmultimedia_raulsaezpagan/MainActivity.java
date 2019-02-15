package com.example.rauls.apppacmultimedia_raulsaezpagan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button fpgm;
        Button fpgs;
        Button acceso;
        Button acercade;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fpgm = (Button)findViewById(R.id.button6);
        fpgs = (Button)findViewById(R.id.button7);
        acceso = (Button)findViewById(R.id.button8);
        acercade = (Button)findViewById(R.id.button9);

        fpgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpgm = new Intent(MainActivity.this, fpmedio.class);
                startActivity(fpgm);
            }
        });
        fpgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpgs = new Intent(MainActivity.this, fpsuperior.class);
                startActivity(fpgs);
            }
        });
        acceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pacceso = new Intent(MainActivity.this, pacceso.class);
                startActivity(pacceso);
            }
        });
        acercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acercade = new Intent(MainActivity.this, acercade.class);
                startActivity(acercade);
            }
        });


    }
}
