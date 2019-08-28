package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaCadastro extends AppCompatActivity {

    private ListView listView;
    private CadastroDAO dao;
    private List<Cadastro> cadastros;
    private List<Cadastro> cadastrosFiltrados = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cadastro);

        listView = findViewById(R.id.lista_cadastro);

        dao = new CadastroDAO(this);

        cadastros = dao.obterTodos();

        cadastrosFiltrados.addAll(cadastros);

        ArrayAdapter<Cadastro> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cadastros);

        listView.setAdapter(adaptador);


    }
}
