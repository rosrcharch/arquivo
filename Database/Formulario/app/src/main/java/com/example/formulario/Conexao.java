package com.example.formulario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;


public class Conexao extends SQLiteOpenHelper {

    private static final String name = "banco.db";
    private static final int version = 1;
    private static final String id = "_id";
    private static final String CADASTRO = "usuarios";
    private static final String login = "login";
    private static final String senha = "senha";
    private static final String nome = "nome";
    private static final String endereco = "endereco";
    private static final String numero = "numero";
    private static final String idade = "idade";
    private static final String sexo = "sexo";
    private static final String estado = "estado";

    public Conexao(Context context) {
        super(context, name, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE " +CADASTRO+ "("
                +id+" integer PRIMARY KEY AUTOINCREMENT,"
                +login+" text,"
                +senha+" text,"
                +nome+" text,"
                +endereco+" text,"
                +numero+" text,"
                +idade+" text, "
                +sexo+" varchar(50),"
                +estado+" varchar(50)"
                +")";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
