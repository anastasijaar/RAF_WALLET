package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class UnosFragment extends Fragment {

    //View comps
    private TextView textView;
    private Spinner spinner;
    private EditText naslovInputText;
    private EditText kolicinaInputText;
    private CheckBox checkBox;
    private EditText opisInputText;
    private Button dodajUListuBtn;

    public UnosFragment() {
        super(R.layout.fragment_unos);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        initView(view);
        initListeners(view);
    }

    private void initView(View view) {
        textView = (TextView) view.findViewById(R.id.UnosFragmentText);
        spinner = (Spinner) view.findViewById(R.id.UnosFragmentSpinner);
        naslovInputText = (EditText) view.findViewById(R.id.UnosFragmentNaslovInput);
        kolicinaInputText = (EditText) view.findViewById(R.id.UnosFragmentKolicinaInput);
        checkBox = (CheckBox) view.findViewById(R.id.UnosFragmentCheckBox);
        opisInputText = (EditText) view.findViewById(R.id.UnosFragmentOpisInput);
        dodajUListuBtn = (Button) view.findViewById(R.id.UnosFragmentDodajUListuButton);
    }

    private void initListeners(View view) {
    }
}
