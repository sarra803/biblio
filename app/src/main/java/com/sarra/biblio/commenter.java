package com.sarra.biblio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class commenter extends AppCompatActivity {
EditText champ1,champ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commenter);
        champ1 = findViewById(R.id.titree);
        champ2 = findViewById(R.id.nTitre);
         /*listereservation.update(

                        "titre", titr,
                        "auteur", au,
                        "nbpages", nb
                        )*/
    }

    public void commenter(View view) {
        String tit = champ1.getText().toString();
        String com = champ2.getText().toString();
        CollectionReference commentaires = FirebaseFirestore.getInstance().collection("commentaires");
        commentaires.add(new Commentaire(tit,com));
    }
    }

