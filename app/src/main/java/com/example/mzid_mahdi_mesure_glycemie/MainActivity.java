package com.example.mzid_mahdi_mesure_glycemie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void init()
    {
        etValeur = findViewById(R.id.etValeur);
        rbtOui = findViewById(R.id.rbtOui);
        rbtNon = findViewById(R.id.rbtNon);
        sbage = findViewById(R.id.sbAge);
        tvage = findViewById(R.id.tvage);
    }
    private EditText etValeur;
    private RadioButton rbtOui,rbtNon;
    private SeekBar sbage;
    private TextView tvage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}