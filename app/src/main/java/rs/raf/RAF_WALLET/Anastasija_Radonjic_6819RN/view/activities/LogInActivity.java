package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import timber.log.Timber;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class LogInActivity extends AppCompatActivity {

    //View comps
    private ImageButton imageButton;
    private TextView textView;
    private EditText editNameText;
    private EditText editSurnameText;
    private EditText editBankText;
    private EditText editPasswordText;
    private Button prijavaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        init();
    }

    private void init() {
        initView();
        initGlide();
        initListeners();
    }

    private void initView() {
        imageButton = findViewById(R.id.LodInActivityImageButton);
        textView = findViewById(R.id.LodInActivityText);
        editNameText = findViewById(R.id.LodInActivityEnterName);
        editSurnameText = findViewById(R.id.LodInActivityEnterSurname);
        editBankText = findViewById(R.id.LodInActivityEnterBank);
        editPasswordText = findViewById(R.id.LodInActivityEnterPass);
        prijavaBtn = findViewById(R.id.LodInActivityButton);
    }

    private void initGlide() {
        Glide.with(this).load(R.drawable.ic_dollar).into(imageButton);
    }

    private void initListeners() {
        editNameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String name =s.toString().trim();
                Timber.e(name);
                String surname = s.toString().trim();
                Timber.e(surname);
            }
        });

        prijavaBtn.setOnClickListener(v -> {
            //uzimamo uneto ime
            String nameInput = editNameText.getText().toString().trim();
            //uzimamo uneto prezime
            String surnameInput = editSurnameText.getText().toString().trim();
            //uzimamo unetu banku
            String bankInput = editBankText.getText().toString().trim();
            //uzimamo unet password
            String passInput = editPasswordText.getText().toString().trim();

            if(nameInput.isEmpty() || surnameInput.isEmpty() || bankInput.isEmpty()){
                Toast.makeText(this, "Morate uneti sve podatke !", Toast.LENGTH_SHORT).show();
            }

            if(passInput.isEmpty()){
                Toast.makeText(this, "Lozinka ne sme biti prazna !", Toast.LENGTH_SHORT).show();
            }else if(passInput.length()<5){
                Toast.makeText(this, "Lozinka mora imati vise od 5 karaktera !", Toast.LENGTH_SHORT).show();
            }

            SharedPreferences sharedPreferences =getSharedPreferences(getPackageName(), MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", nameInput);
            editor.putString("password", surnameInput);
            editor.putString("bank", bankInput);
            editor.putString("password", passInput);
            editor.putBoolean("isLoged", true);
            editor.apply();

            Intent intent = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(intent);

        });
    }
}
