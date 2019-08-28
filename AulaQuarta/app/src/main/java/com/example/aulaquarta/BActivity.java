package com.example.aulaquarta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class BActivity extends AppCompatActivity {

  //declaracao das variaveis de layout e button;

    ConstraintLayout layout1;
    AlertDialog.Builder builder;
    ProgressBar progressBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        progressBar2 = findViewById(R.id.progressBar);
        Button btn = new Button(this);
        btn.setText("texto");

  //contrutor dos retornos das variaveis "new"

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (progressBar2.isShown()){
                    progressBar2.setVisibility(View.GONE);
                }else {
                    progressBar2.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}