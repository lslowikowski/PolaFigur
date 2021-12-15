package com.ckuandroid.polafigur;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obliczPoleKola(View view) {
        Intent intentObliczPoleKola = new Intent(this, PoleKolaActivity.class);
        startActivityForResult(intentObliczPoleKola, 1);
    }

    public void obliczPoleKwadratu(View view) {
        Intent intentObliczPoleKwadratu = new Intent(this, PoleKwadratuActivity.class);
        startActivityForResult(intentObliczPoleKwadratu, 2);
    }

    public void obliczPoleProstokata(View view) {
        Intent intentObliczPoleProstokata = new Intent(this, PoleProstokataActivity.class);
        startActivityForResult(intentObliczPoleProstokata, 3);
    }

    public void obliczPoleTojkata(View view) {
        Intent intentObliczPoleTrojkata = new Intent(this, PoleTrojkataActivity.class);
        startActivityForResult(intentObliczPoleTrojkata, 4);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        TextView wynik = (TextView) findViewById(R.id.wynik);
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            String wynikStr = data.getStringExtra("poleKola");
            wynik.setText(wynikStr);
        }
        if(requestCode == 2){
            String wynikStr = data.getStringExtra("poleKwadratu");
            wynik.setText(wynikStr);
        }
        if(requestCode == 3){
            String wynikStr = data.getStringExtra("poleProstokata");
            wynik.setText(wynikStr);
        }
        if(requestCode == 4){
            String wynikStr = data.getStringExtra("poleTrojkata");
            wynik.setText(wynikStr);
        }
    }
}