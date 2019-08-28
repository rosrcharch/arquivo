package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button buttum;
    private CheckBox checkBox;
    private EditText editText;
    private EditText editText2;
    private TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();

        progressBar

    }



    void setListener(){
        buttum=(Button)findViewById(R.id.buttum);
        editText=(EditText)findViewById(R.id.tLogin);
        editText2 =(EditText) findViewById(R.id.tSenha);


        buttum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText.getText().toString();
                String senha = editText2.getText().toString();


                if (name!=null) {

                    Intent intent = new Intent(getApplicationContext(), BActivity.class);

                    intent.putExtra("valor1", name);
                    intent.putExtra("valor2", senha);


                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "please novo username:", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
