package com.example.maitotoast;

import android.os.Bundle;
import android.view.View;import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private int scoreActuel = 0;
    private TextView affichageScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiserInterface();
    }

    private void initialiserInterface() {
        // Liaison avec des IDs renommés
        affichageScore = findViewById(R.id.tv_valeur_compteur);
        Button btnToast = findViewById(R.id.btn_action_toast);
        Button btnPlus = findViewById(R.id.btn_action_plus);


        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherAlerte();
            }
        });

        btnPlus.setOnClickListener(v -> incrementerDeUn());
    }

    private void afficherAlerte() {
        String msg = "Bonjour !";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    private void incrementerDeUn() {
        scoreActuel++;
        affichageScore.setText("Total: " + scoreActuel);
    }
}