package com.ckuandroid.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PoleKolaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_kola);
    }

    public void wyliczPoleKola(View view) {
        EditText promien = (EditText) findViewById(R.id.promien);
        String promienStr = promien.getText().toString();
        Double promienDouble = Double.parseDouble(promienStr);
        Double poleKolaDouble = Math.PI * promienDouble * promienDouble;
        String wynik = "Pole koła o promieniu: " + promienStr + " wynosi: " + poleKolaDouble.toString();
        Intent intentOknoGlowne = new Intent();
        intentOknoGlowne.putExtra("poleKola", wynik);
        setResult(1, intentOknoGlowne);
        finish();
    }
}