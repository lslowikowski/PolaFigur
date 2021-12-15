package com.ckuandroid.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PoleKwadratuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_kwadratu);
    }

    public void wyliczPoleKwadratu(View view) {
        EditText bok = (EditText) findViewById(R.id.bok);
        String bokStr = bok.getText().toString();
        Double bokDouble = Double.parseDouble(bokStr);
        Double poleKwadratuDouble = bokDouble * bokDouble;
        String wynik = "Pole kwadratu o boku: " + bokStr + " wynosi: " + poleKwadratuDouble.toString();
        Intent intentOknoGlowne = new Intent();
        intentOknoGlowne.putExtra("poleKwadratu", wynik);
        setResult(2, intentOknoGlowne);
        finish();
    }
}