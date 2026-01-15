package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button length, weightmass, volume, about;
    final Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        length = (Button) findViewById(R.id.length);
        weightmass = (Button) findViewById(R.id.weightmass);
        volume = (Button) findViewById(R.id.volume);
        about = (Button) findViewById(R.id.about);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, lengthactivity.class);
                startActivity(i);
            }
        });

        weightmass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, weightactivity.class);
                startActivity(i);
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, volumeactivity.class);
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog aboutPage = new Dialog(context);
                aboutPage.setContentView(R.layout.aboutpage);
                aboutPage.show();
            }
        });

    }
}