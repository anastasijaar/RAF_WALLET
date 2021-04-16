package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.recycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.function.Function;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.models.Finansija;

public class FinansijaRashodiAdapter extends ListAdapter<Finansija, FinansijaRashodiAdapter.ViewHolder> {

    private final Function<Finansija, Void> onFinansijaClicked;
    private final Function<Finansija, Void> onFinansijaDelete;
    private final Function<Finansija, Void> onFinansijaEdit;

    public FinansijaRashodiAdapter(@NonNull DiffUtil.ItemCallback<Finansija> diffCallback, Function<Finansija, Void> onFinansijaClicked, Function<Finansija, Void> onFinansijaDelete, Function<Finansija, Void> onFinansijaEdit) {
        super(diffCallback);
        this.onFinansijaClicked = onFinansijaClicked;
        this.onFinansijaDelete = onFinansijaDelete;
        this.onFinansijaEdit = onFinansijaEdit;
    }

    @NonNull
    @Override
    public FinansijaRashodiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.finansija_rashodi_list_item, parent, false);
        return new FinansijaRashodiAdapter.ViewHolder(view, parent.getContext(), position -> {
            Finansija finansija = getItem(position);
            onFinansijaClicked.apply(finansija);
            return null;

        },position ->{
            Finansija finansija = getItem(position);
            onFinansijaDelete.apply(finansija);
            return null;
        }, position ->{
            Finansija finansija = getItem(position);
            onFinansijaEdit.apply(finansija);
            return null;
        });
    }

    @Override
    public void onBindViewHolder(@NonNull FinansijaRashodiAdapter.ViewHolder holder, int position) {
        Finansija finansija = getItem(position);
        holder.bind(finansija);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private Context context;

        public void bind(Finansija finansija) {
            ImageView dolarImageView = itemView.findViewById(R.id.dollarRashodiPictureIv);
            Glide.with(context).load(R.drawable.ic_bigredmoney).into(dolarImageView);
            ImageView deleteImageView = itemView.findViewById(R.id.trashPictureIv);
            Glide.with(context).load(R.drawable.ic_delete).into(deleteImageView);
            ImageView editImageView = itemView.findViewById(R.id.editPictureIv);
            Glide.with(context).load(R.drawable.ic_edit).into(editImageView);
            ((TextView)itemView.findViewById(R.id.naslovRashodiTv)).setText(finansija.getNaslov());
            ((TextView)itemView.findViewById(R.id.kolicinaRashodiTv)).setText(Integer.toString(finansija.getKolicina()));
        }

        public ViewHolder(@NonNull View itemView, Context context, Function<Integer, Void> onItemClicked, Function<Integer, Void> onItemDelete, Function<Integer, Void> onItemEdit) {
            super(itemView);
            this.context = context;
            itemView.setOnClickListener(v -> {
                if(getAdapterPosition() != RecyclerView.NO_POSITION) {
                    onItemClicked.apply(getAdapterPosition());
                }
            });

            itemView.findViewById(R.id.trashPictureIv).setOnClickListener(v -> {
                onItemDelete.apply(getAdapterPosition());
            });

            itemView.findViewById(R.id.editPictureIv).setOnClickListener(v -> {
                onItemEdit.apply(getAdapterPosition());
            });


        }


    }
}
