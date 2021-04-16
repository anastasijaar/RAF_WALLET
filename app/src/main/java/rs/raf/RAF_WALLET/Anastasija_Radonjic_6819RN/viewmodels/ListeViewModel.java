package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.models.Finansija;

public class ListeViewModel extends ViewModel {

    public static int counter = 5;

    private final MutableLiveData<List<Finansija>> finansije = new MutableLiveData<>();
    private final ArrayList<Finansija> finansijeLista = new ArrayList<>();

    public ListeViewModel() {
        for(int i=0; i<=4; i++) {
            Finansija finansija = new Finansija(i, "Naslov" + i, 1 + i);
            finansijeLista.add(finansija);
        }
        // ovo radimo zato sto finansije.setValue u pozadini prvo proverava da li je pokazivac na objekat isti i ako jeste nece uraditi notifyAll
        // kreiranjem nove liste dobijamo novi pokazivac svaki put
        ArrayList<Finansija> listToSubmit = new ArrayList<>(finansijeLista);
        finansije.setValue(listToSubmit);
    }

    public LiveData<List<Finansija>> getFinansije() {
        return finansije;
    }


    public void delete(Finansija finansija){
        finansijeLista.remove(finansija);
        ArrayList<Finansija> listToSubmit = new ArrayList<>(finansijeLista);
        finansije.setValue(listToSubmit);
    }

    public void edit(Finansija finansija){
        //implement edit
    }






}
