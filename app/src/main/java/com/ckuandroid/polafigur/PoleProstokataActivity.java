package com.ckuandroid.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PoleProstokataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pole_prostokata);
    }

    public void wyliczPoleProstokata(View view) {
        EditText bokA = (EditText) findViewById(R.id.bokA);
        String bokAStr = bokA.getText().toString();
        Double bokADouble = Double.parseDouble(bokAStr);

        EditText bokB = (EditText) findViewById(R.id.bokB);
        String bokBStr = bokB.getText().toString();
        Double bokBDouble = Double.parseDouble(bokBStr);

        Double poleProstokataDouble = bokADouble * bokBDouble;
        String wynik = "Pole prostokąta o bokach: " + bokAStr + " i " + bokBStr +
                       " wynosi: " + poleProstokataDouble.toString();
        Intent intentOknoGlowne = new Intent();
        intentOknoGlowne.putExtra("poleProstokata", wynik);
        setResult(3, intentOknoGlowne);
        finish();
    }
}