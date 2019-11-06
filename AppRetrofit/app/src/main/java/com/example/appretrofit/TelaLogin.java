package com.example.appretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity implements View.OnClickListener {

    Button submit, exit;
    String username, password;
    EditText userinput, passinput;
    SharedPreferences sh_Pref;
    SharedPreferences.Editor toEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        getInit();
    }

    public void getInit() {
        submit = (Button) findViewById(R.id.submit);
        exit = (Button) findViewById(R.id.exit);
        userinput = (EditText) findViewById(R.id.userinput);
        passinput = (EditText) findViewById(R.id.passinput);
        submit.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    public void sharedPreferences() {

        sh_Pref = getSharedPreferences("Login Credentials", MODE_PRIVATE);
        toEdit = sh_Pref.edit();
        toEdit.putString("Username", username);
        toEdit.putString("Password", password);
        toEdit.commit();

    }

    @Override
    public void onClick(View currentButton) {
        switch (currentButton.getId()) {
            case R.id.submit:
                username = userinput.getText().toString();
                password = passinput.getText().toString();
                sharedPreferences();
                Toast.makeText(this, "Seus detalhes foram salvados", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(TelaLogin.this, MainActivity.class));
                break;
            case R.id.exit:
                finish();
        }



    }
}
