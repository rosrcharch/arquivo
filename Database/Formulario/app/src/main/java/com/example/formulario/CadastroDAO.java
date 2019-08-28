package com.example.formulario;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;


    public CadastroDAO(Context context) {

    conexao = new Conexao(context);
    banco = conexao.getWritableDatabase();

    }
    public long cadastrar(Cadastro cadastro){

        ContentValues values = new ContentValues();
        values.put("login", cadastro.getLogin());
        values.put("senha", cadastro.getSenha());
        values.put("nome", cadastro.getNome());
        values.put("endereco", cadastro.getEndereco());
        values.put("numero", cadastro.getNumero());
        values.put("idade", cadastro.getIdade());
        values.put("sexo", cadastro.getSexo());
        values.put("estado", cadastro.getEstado());

        return banco.insert("cadastro", null, values);

    }

        public List<Cadastro> obterTodos(){

        List<Cadastro> cadastros = new ArrayList<>();
        Cursor cursor = banco.query("cadastro", new String[]{"id", "login","senha","nome","endereco","numero","idade","sexo","estado"},
                null, null, null, null, null);

        while(cursor.moveToNext()) {
            Cadastro A = new Cadastro();
            A.setId(cursor.getInt(0));
            A.setLogin(cursor.getString(1));
            A.setSenha(cursor.getString(2));
            A.setNome(cursor.getString(3));
            A.setEndereco(cursor.getString(4));
            A.setNumero(cursor.getString(5));
            A.setIdade(cursor.getString(6));
            A.setSexo(cursor.getString(7));
            A.setEstado(cursor.getString(8));
            cadastros.add(A);

        }
        return cadastros;

    }

}
