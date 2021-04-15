package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
        super(R.layout.fragment_third);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        initInnerFragment();
    }

    private void initInnerFragment() {
        // U fragment-u koristimo getChildFragmentManager() za dobijanje fragment managera
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.ListaFinansijaFcv, new ListaFinansijaFragment());
        transaction.commit();
    }
}
