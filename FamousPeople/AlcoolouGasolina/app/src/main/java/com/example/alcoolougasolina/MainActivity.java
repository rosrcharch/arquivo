package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool;
    private TextInputEditText editPrecoGasolina;
    private Button btnCalcular;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        btnCalcular = findViewById(R.id.btnCalcular);
        textResultado = findViewById(R.id.textResultado);


    }

    public void calcularPreco(View view){
        //Recupera os valores digitados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //Validar os campos digitados

        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);
        if (camposValidados){
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        }else {
            textResultado.setText("Preencha os campos primeiros!! ");
        }


    }

    public Boolean validarCampos (String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if (pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){

        //Converter valores String para numeros
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);

        //Formula de calculo
        Double resultado = precoAlcool / precoGasolina;
            if (resultado >= 0.7){
                textResultado.setText("Melhor ultilizar a gasolina!!");
            }else {
                textResultado.setText("Melhor ultilizar o alcool!!");
            }

    }
}
