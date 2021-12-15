package com.ckuandroid.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PoleTrojkataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_trojkata);
    }

    public void wyliczPoleTrojkata(View view) {
        EditText podstawa = (EditText) findViewById(R.id.podstawa);
        String podstawaStr = podstawa.getText().toString();
        Double podstawaDouble = Double.parseDouble(podstawaStr);

        EditText wysokosc = (EditText) findViewById(R.id.wysokosc);
        String wysokoscStr = wysokosc.getText().toString();
        Double wysokoscDouble = Double.parseDouble(wysokoscStr);

        Double poleTrojkataDouble = podstawaDouble * wysokoscDouble / 2 ;
        String wynik = "Pole trójkąta o podstawie: " + podstawaStr + " i wysokości " + wysokoscStr +
                " wynosi: " + poleTrojkataDouble.toString();
        Intent intentOknoGlowne = new Intent();
        intentOknoGlowne.putExtra("poleTrojkata", wynik);
        setResult(4, intentOknoGlowne);
        finish();
    }
}