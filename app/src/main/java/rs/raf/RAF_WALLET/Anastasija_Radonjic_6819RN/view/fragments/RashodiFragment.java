package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities.IzmenaPodatakaActivity;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities.PregledFinansijeActivity;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.adapter.FinansijaRashodiAdapter;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.differ.FinansijaDiffItemCallback;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.viewmodels.ListeViewModel;

public class RashodiFragment extends Fragment {

    //View comps
    private RecyclerView recyclerView;

    private ListeViewModel listeViewModel;
    private FinansijaRashodiAdapter finansijaRashodiAdapter;

    public RashodiFragment() {
        super(R.layout.fragment_rashodi);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listeViewModel = new ViewModelProvider(getActivity()).get(ListeViewModel.class);
        init(view);
    }

    private void init(View view) {
        initView(view);
        initListeners(view);
        initObservers(view);
        initRecycler(view);
    }

    private void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.RashodiFragmentListaRv);
    }

    private void initListeners(View view) {
    }

    private void initObservers(View view) {
        //dobijamo finansije koje su se prosledile usled neke promene
        listeViewModel.getFinansije().observe(getViewLifecycleOwner(), finansija -> {
            //izmene na svaku promenu liste
            finansijaRashodiAdapter.submitList(finansija);
        });
    }

    private void initRecycler(View view) {
        //instanciranje recycler-a
        finansijaRashodiAdapter = new FinansijaRashodiAdapter(new FinansijaDiffItemCallback(), finansija -> {
            Intent intent = new Intent(getActivity(), PregledFinansijeActivity.class);
            intent.putExtra("id", finansija.getId());
            intent.putExtra("naslov",finansija.getNaslov());
            intent.putExtra("kolicina", finansija.getKolicina());
            startActivity(intent);
            return null;
        }, finansijaToDeleted ->{
            listeViewModel.delete(finansijaToDeleted);
            return null;
        }, finansijaToEdit ->{
            Intent intent = new Intent(getActivity(), IzmenaPodatakaActivity.class);
            startActivity(intent);
            return  null;
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(finansijaRashodiAdapter);
    }
}
