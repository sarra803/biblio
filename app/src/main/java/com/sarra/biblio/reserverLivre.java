package com.sarra.biblio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class reserverLivre extends AppCompatActivity {
    private EditText titre, auteur, nbPages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserver_livre);
        setTitle("reserver livre");

        titre = findViewById(R.id.nTitre);
        auteur = findViewById(R.id.nAuteur);
        nbPages = findViewById(R.id.nnbPages);
    }

    public void ajouter(View view) {
        String tit = titre.getText().toString();
        String aut = auteur.getText().toString();
        String nb = nbPages.getText().toString();
        CollectionReference liverl = FirebaseFirestore.getInstance().collection("livre");
        liverl.add(new Livre(tit,aut,nb));

    }
    }
