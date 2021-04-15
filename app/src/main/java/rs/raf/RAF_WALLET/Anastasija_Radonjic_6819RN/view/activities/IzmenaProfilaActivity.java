package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.IzmenaProfilaFragment;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.ProfilFragment;

public class IzmenaProfilaActivity extends AppCompatActivity {

    //View comps
    private TextView textView;
    private ImageButton imageButton;
    private TextView nameText;
    private EditText editNameText;
    private TextView surnametext;
    private EditText editSurnameText;
    private TextView bankText;
    private EditText editBankText;
    private Button sacuvajBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmena_profila);
        init();
    }

    private void init() {
        initView();
    }

    private void initView() {
        textView = findViewById(R.id.IzmenaProfilaActivityText);
        imageButton = findViewById(R.id.IzmenaProfilaActivityImageButton);
        nameText = findViewById(R.id.IzmenaProfilaActivityName);
        editNameText = findViewById(R.id.IzmenaProfilaActivityEditNameInput);
        surnametext = findViewById(R.id.IzmenaProfilaActivitySurname);
        editSurnameText = findViewById(R.id.IzmenaProfilaActivityEditSurnameInput);
        bankText = findViewById(R.id.IzmenaProfilaActivityBank);
        editBankText = findViewById(R.id.IzmenaProfilaActivityEditBankInput);
        sacuvajBtn = findViewById(R.id.IzmenaProfilaActivitySacuvajButton);
    }


}