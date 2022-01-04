package com.sarra.biblio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class LivreAdapter extends FirestoreRecyclerAdapter<Livre,LivreAdapter.LivreHolder> {
    public LivreAdapter(@NonNull FirestoreRecyclerOptions<Livre> option) {
        super(option);
    }
    @Override

    protected void onBindViewHolder(@NonNull LivreHolder holder, int position, @NonNull Livre model) {
        holder.titre.setText(model.getTitre());
        holder.auteur.setText(model.getAuteur());
        holder.nbpage.setText(model.getNbPages());
    }
    @NonNull
    @Override
    public LivreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical_livre,parent,false);
        return new LivreHolder(v);
    }

    public class LivreHolder  extends RecyclerView.ViewHolder{
        TextView auteur,titre,nbpage;
        ImageView image;
        public LivreHolder(@NonNull View itemView) {
            super(itemView);
            auteur = itemView.findViewById(R.id.noml);
            titre = itemView.findViewById(R.id.descl);
            nbpage = itemView.findViewById(R.id.nomla);
            image = itemView.findViewById(R.id.imageView);
            image.setImageResource(R.drawable.livre1);
        }
    }


}
