package com.example.famouspeople;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {

    EditText tLogin;
    EditText tSenha;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        tLogin = findViewById(R.id.login);
        tSenha = findViewById(R.id.senha);
        btLogin = findViewById(R.id.button_login);

        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}
