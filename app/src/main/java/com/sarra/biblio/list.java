package com.sarra.biblio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class list extends AppCompatActivity {
    private final FirebaseFirestore MonLivre = FirebaseFirestore.getInstance();
    private final CollectionReference livrel = MonLivre.collection("livre");
    private LivreAdapter adapterlivre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recylelivre();
    }
    private void recylelivre()
    {
        Query querylivre = livrel;
        FirestoreRecyclerOptions<Livre> option = new FirestoreRecyclerOptions.Builder<Livre>()
                .setQuery(querylivre, Livre.class)
                .build();
        adapterlivre = new LivreAdapter(option);

        RecyclerView livrerec = findViewById(R.id.recycleV);
        livrerec.setHasFixedSize(true);
        livrerec.setLayoutManager(new LinearLayoutManager(this));
        livrerec.setAdapter(adapterlivre);
    }

    protected void onStart() {
        super.onStart();
        adapterlivre.startListening();

    }


    @Override
    protected void onStop() {
        super.onStop();
        adapterlivre.stopListening();
    }

    public void reserver(View view) {
        Intent i = new Intent(getApplicationContext(),reserverLivre.class);
       startActivity(i);
   }
    public void publier(View view) {
        Intent i = new Intent(getApplicationContext(),commenter.class);
        startActivity(i);
    }




}