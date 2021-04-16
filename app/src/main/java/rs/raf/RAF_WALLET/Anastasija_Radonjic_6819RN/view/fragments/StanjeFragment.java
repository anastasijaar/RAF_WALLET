package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class StanjeFragment extends Fragment {

    //View comps
    private TextView textView;
    private TextView prihodText;
    private TextView prihodInputText;
    private TextView rashodText;
    private TextView reshodInputText;
    private TextView razlikaText;
    private TextView razlikaInputText;

    public StanjeFragment() {
        super(R.layout.fragment_first);
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
        textView = (TextView) view.findViewById(R.id.StanjeFragmentText);
        prihodText = (TextView) view.findViewById(R.id.StanjeFragmentPrihodText);
        prihodInputText = (TextView) view.findViewById(R.id.StanjeFragmentPrihodInput);
        rashodText = (TextView) view.findViewById(R.id.StanjeFragmentRashodText);
        reshodInputText = (TextView) view.findViewById(R.id.StanjeFragmentRashodInput);
        razlikaText = (TextView) view.findViewById(R.id.StanjeFragmentRazlika);
        razlikaInputText = (TextView) view.findViewById(R.id.StanjeFragmentRazlikaInput);
    }

    private void initListeners(View view) {


    }
}