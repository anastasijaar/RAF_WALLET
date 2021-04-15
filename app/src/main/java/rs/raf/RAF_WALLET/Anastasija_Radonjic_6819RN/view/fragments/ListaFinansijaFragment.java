package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.viewpager.FinansijeAdapter;

public class ListaFinansijaFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    public ListaFinansijaFragment() {
        super(R.layout.fragment_lista_finansija);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        initView(view);
        initTabs(view);
    }

    private void initView(View view) {
        viewPager = (ViewPager) view.findViewById(R.id.ListaFinansijaFragmentviewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.ListaFinansijaFragmenttabLayout);
    }

    private void initTabs(View view) {
        viewPager.setAdapter(new FinansijeAdapter(getActivity().getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
}
