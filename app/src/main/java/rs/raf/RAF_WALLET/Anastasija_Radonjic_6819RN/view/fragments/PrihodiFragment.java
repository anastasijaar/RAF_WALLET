package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities.PregledFinansijeActivity;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.adapter.FinansijaPrihodiAdapter;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.differ.FinansijaDiffItemCallback;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.viewmodels.ListeViewModel;

public class PrihodiFragment extends Fragment {

    //View comps
    private RecyclerView recyclerView;

    private ListeViewModel listeViewModel;
    private FinansijaPrihodiAdapter finansijaAdapter;

    public PrihodiFragment() {
        super(R.layout.fragment_prihodi);
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
        recyclerView = (RecyclerView) view.findViewById(R.id.PrihodiFragmentListaRv);
    }

    private void initListeners(View view) {
    }

    private void initObservers(View view) {
        //dobijamo finansije koje su se prosledile usled neke promene
        listeViewModel.getFinansije().observe(getViewLifecycleOwner(), finansija -> {
            //izmene na svaku promenu liste
            finansijaAdapter.submitList(finansija);
        });
    }

    private void initRecycler(View view) {
        //instanciranje recycler-a
        finansijaAdapter = new FinansijaPrihodiAdapter(new FinansijaDiffItemCallback(), finansija -> {
            Intent intent = new Intent(getActivity(), PregledFinansijeActivity.class);
            return null;
        }, finansijaToDeleted ->{
            listeViewModel.delete(finansijaToDeleted);
            return null;
        }, finansijaToEdit ->{
            listeViewModel.edit(finansijaToEdit);
            return  null;
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(finansijaAdapter);
    }
}
