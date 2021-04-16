package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.differ;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.models.Finansija;

public class FinansijaDiffItemCallback extends DiffUtil.ItemCallback<Finansija> {

    @Override
    public boolean areItemsTheSame(@NonNull Finansija oldItem, @NonNull Finansija newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(@NonNull Finansija oldItem, @NonNull Finansija newItem) {
        return oldItem.getNaslov().equals(newItem.getNaslov())
                && oldItem.getKolicina() == newItem.getKolicina();
    }
}
