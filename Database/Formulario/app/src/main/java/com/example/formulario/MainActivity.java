package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spEstados;
    private Integer id;
    private EditText login;
    private EditText senha;
    private EditText nome;
    private EditText endereco;
    private EditText numero;
    private EditText idade;
    private RadioButton sexoM;
    private RadioButton sexoF;
    private CadastroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<Cadastro> arrayAdapter;
        //lista de infromação
        List<Cadastro> estados = new ArrayList<Cadastro>();
        estados.add(new Cadastro("(AC)","Acre"));
        estados.add(new Cadastro("(AL)", "Alagoas"));
        estados.add(new Cadastro("(AP)", "Amapá"));
        estados.add(new Cadastro("(AM)", "Amazonas"));
        estados.add(new Cadastro("(BA)", "Bahia"));
        estados.add(new Cadastro("(CE)", "Ceará"));
        estados.add(new Cadastro("(DF)", "Distrito Federal"));
        estados.add(new Cadastro("(ES)", "Espírito Santo"));
        estados.add(new Cadastro("(GO)", "Goiás"));
        estados.add(new Cadastro("(MA)", "Maranhão"));
        estados.add(new Cadastro("(MT)", "Mato Grosso"));
        estados.add(new Cadastro("(MS)", "Mato Grosso do Sul"));
        estados.add(new Cadastro("(MG)", "Minas Gerais"));
        estados.add(new Cadastro("(PA)", "Pará"));
        estados.add(new Cadastro("(PB)", "Paraíba"));
        estados.add(new Cadastro("(PR)", "Paraná"));
        estados.add(new Cadastro("(PE)", "Pernambuco"));
        estados.add(new Cadastro("(PI)", "Piauí"));
        estados.add(new Cadastro("(RJ)", "Rio de Janeiro"));
        estados.add(new Cadastro("(RN)", "Rio Grande do Norte"));
        estados.add(new Cadastro("(RS)", "Rio Grande do Sul"));
        estados.add(new Cadastro("(RO)", "Rondônia"));
        estados.add(new Cadastro("(RR)", "Roraima"));
        estados.add(new Cadastro("(SC)","Santa Catarina"));
        estados.add(new Cadastro("(SP)", "São Paulo"));
        estados.add(new Cadastro("(SE)", "Sergipe"));
        estados.add(new Cadastro("(TO)", "Tocantins"));

        //adaptador para o layout e informaçoes do spinner
        arrayAdapter = new ArrayAdapter<Cadastro>(this, android.R.layout.simple_spinner_item, estados);

        //Spinner preenchido
        spEstados = findViewById(R.id.estado);
        spEstados.setAdapter(arrayAdapter);

        //açossiar os atributos aos ID's
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        nome = findViewById(R.id.nome);
        endereco = findViewById(R.id.endereco);
        numero = findViewById(R.id.numero);
        idade = findViewById(R.id.idade);
        sexoM = findViewById(R.id.masculino);
        sexoF = findViewById(R.id.feminino);
        dao = new CadastroDAO(this);

    }


    public void cadastrar(View view){
            //criar obj do tipo cadastro
            Cadastro A = new Cadastro();
            A.setLogin(login.getText().toString());
            A.setSenha(senha.getText().toString());
            A.setNome(nome.getText().toString());
            A.setEndereco(endereco.getText().toString());
            A.setNumero(numero.getText().toString());
            A.setIdade(idade.getText().toString());

            Cadastro cadastro = (Cadastro)spEstados.getSelectedItem();
            A.setEstado(cadastro.getCodigo());


            //setar os valores de sexo
            if(sexoM.isChecked())
                A.setSexo("Masculino");
            if(sexoF.isChecked())
                A.setSexo("Feminino");

            long id = dao.cadastrar(A);
            Toast.makeText(this, "cadastro realizado "+id, Toast.LENGTH_SHORT).show();
        }





}
