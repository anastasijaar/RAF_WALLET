package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class IzmenaProfilaFragment extends Fragment {

    public IzmenaProfilaFragment() {
        super(R.layout.fragment_izmena_profila);
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


    }

    private void initListeners(View view) {
    }
}
