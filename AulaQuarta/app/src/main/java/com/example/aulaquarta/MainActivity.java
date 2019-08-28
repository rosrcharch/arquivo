package com.example.aulaquarta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.aulaquarta.R.id.button;
import static com.example.aulaquarta.R.id.buttonNovo;

public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button button;
    ProgressBar progressBar;
    ProgressDialog progressDialog;

    ConstraintLayout layout1;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.app_name) .setTitle(R.string.app_name);


        layout1=findViewById(R.id.layoutC);


        TextView tv1 = new TextView(this);
        tv1.setText("meu texto");


        Button btn = new Button (this);
        btn.setText("Button");

        layout1.addView(tv1);
        layout1.addView(btn);

        layout1 = findViewById(R.id.layoutC);
        layout1.addView(button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setPositiveButton("aceitar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(), "voce escolheu por aceitar a oferta", Toast.LENGTH_LONG).show();


                    }
                });


                builder.setNegativeButton("recusar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(), "Voce n'ao aceitou!!", Toast.LENGTH_LONG).show();


                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });

    }


}
