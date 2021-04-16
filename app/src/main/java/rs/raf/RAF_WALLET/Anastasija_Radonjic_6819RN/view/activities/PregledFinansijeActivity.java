package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.models.Finansija;

public class PregledFinansijeActivity extends AppCompatActivity {

    //View comps
    private TextView textView;
    private ImageButton imageButton;
    private TextView naslovText;
    private TextView naslovInputText;
    private TextView kolicinaText;
    private TextView kolicinaInputText;
    private TextView opisText;
    private TextView opisInputText;
    private Button ureduBtn;

    Finansija finansija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregled_finansije);
        init();
    }

    private void init() {
        initView();
        initListeners();
    }


    private void initView() {
        textView = findViewById(R.id.PregledFinansijeActivityText);
        imageButton = findViewById(R.id.PregledFinansijeActivityImageButton);
        naslovText = findViewById(R.id.PregledFinansijeActivityNaslov);
        naslovInputText = findViewById(R.id.PregledFinansijeActivityNaslovInput);
        kolicinaText = findViewById(R.id.PregledFinansijeActivityKolicina);
        kolicinaInputText = findViewById(R.id.PregledFinansijeActivityKolicinaInput);
        opisText = findViewById(R.id.PregledFinansijeActivityOpis);
        opisInputText = findViewById(R.id.PregledFinansijeActivityOpisInput);
        ureduBtn = findViewById(R.id.PregledFinansijeActivityButton);
    }

    private void initListeners() {
        ureduBtn.setOnClickListener(v -> {
            finish();
        });
        Intent intent = getIntent();
        String naslov = intent.getStringExtra("naslov");
        naslovInputText.setText(naslov);
        String kolicina = intent.getStringExtra("kolicina");
        kolicinaInputText.setText(String.valueOf(kolicina));

    }

}