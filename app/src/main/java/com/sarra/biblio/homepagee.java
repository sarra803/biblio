package com.sarra.biblio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepagee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagee);
    }
    public void Voirplus(View view) {
       Intent i = new Intent(getApplicationContext(),list.class);
        startActivity(i);
    }
}