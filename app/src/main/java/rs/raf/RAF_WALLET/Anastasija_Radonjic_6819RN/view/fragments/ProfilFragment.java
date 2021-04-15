package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities.IzmenaProfilaActivity;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities.LogInActivity;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.viewmodels.SharedViewModel;
import timber.log.Timber;

public class ProfilFragment extends Fragment {

    //View comps
    private TextView textView;
    private ImageButton imageButton;
    private TextView nameText;
    private TextView nameInputText;
    private TextView surnameText;
    private TextView surnameInputText;
    private TextView bankText;
    private TextView bankInputText;
    private Button izmeniBtn;
    private Button odjavaBtn;

    public ProfilFragment() {
        super(R.layout.fragment_profil);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Timber.e("Profil fragment");
        init(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences preferences = this.getActivity().getSharedPreferences(getActivity().getPackageName(), Context.MODE_PRIVATE);
        nameInputText.setText(preferences.getString("username", ""));
        surnameInputText.setText(preferences.getString("surname", ""));
        bankInputText.setText(preferences.getString("bank", ""));
    }

    private void init(View view) {
        initView(view);
        initListeners(view);
    }

    private void initView(View view) {
        textView = (TextView) view.findViewById(R.id.ProfilFragmentText);
        imageButton = (ImageButton) view.findViewById(R.id.ProfilFragmentImageButton);
        nameText = (TextView) view.findViewById(R.id.ProfilFragmentName);
        nameInputText = (TextView) view.findViewById(R.id.ProfilFragmentNameInput);
        surnameText = (TextView) view.findViewById(R.id.ProfilFragmentSurname);
        surnameInputText = (TextView) view.findViewById(R.id.ProfilFragmentSurnameInput);
        bankText = (TextView) view.findViewById(R.id.ProfilFragmentBank);
        bankInputText = (TextView) view.findViewById(R.id.ProfilFragmentBankInput);
        izmeniBtn = (Button) view.findViewById(R.id.ProfilFragmentIzmeniButton);
        odjavaBtn = (Button) view.findViewById(R.id.ProfilFragmentOdjavaButton);
    }

    private void initListeners(View view) {

        view.findViewById(R.id.ProfilFragmentIzmeniButton).setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), IzmenaProfilaActivity.class);
            startActivity(intent);

        });

        view.findViewById(R.id.ProfilFragmentOdjavaButton).setOnClickListener(v -> {
            SharedPreferences settings = getContext().getSharedPreferences(getActivity().getPackageName(), Context.MODE_PRIVATE);
            settings.edit().clear().apply();
            Intent intent = new Intent(getActivity(), LogInActivity.class);
            startActivity(intent);
        });
    }


}
