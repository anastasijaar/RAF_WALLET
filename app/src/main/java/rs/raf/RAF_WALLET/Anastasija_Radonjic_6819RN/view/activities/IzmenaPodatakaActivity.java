package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class IzmenaPodatakaActivity extends AppCompatActivity {

    //View comps
    private TextView textView;
    private ImageButton imageButton;
    private TextView naslovText;
    private EditText naslovInputText;
    private TextView kolicinaText;
    private EditText kolicinaInputText;
    private TextView opisText;
    private EditText opisinputText;
    private Button odustaniBtn;
    private Button izmeniBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmena_podataka);
        init();
    }

    private void init() {
        initView();
        initListeners();
    }

    private void initView() {
        textView = findViewById(R.id.IzmenaPodatakaActivityText);
        imageButton = findViewById(R.id.IzmenaPodatakaActivityImageButton);
        naslovText = findViewById(R.id.IzmenaPodatakaActivityNaslov);
        naslovInputText = findViewById(R.id.IzmenaPodatakaActivityNaslovInput);
        kolicinaText = findViewById(R.id.IzmenaPodatakaActivityKolicina);
        kolicinaInputText = findViewById(R.id.IzmenaPodatakaActivityKolicinaInput);
        opisText = findViewById(R.id.IzmenaPodatakaActivityOpis);
        opisinputText = findViewById(R.id.IzmenaPodatakaActivityOpisInput);
        odustaniBtn = findViewById(R.id.IzmenaPodatakaActivityOdustaniButton);
        izmeniBtn = findViewById(R.id.IzmenaPodatakaActivityIzmeniButton);
    }

    private void initListeners() {
        odustaniBtn.setOnClickListener(v -> {
            finish();
        });

        izmeniBtn.setOnClickListener(v -> {

            finish();

        });

    }
}