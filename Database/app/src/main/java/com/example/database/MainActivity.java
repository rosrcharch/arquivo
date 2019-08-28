package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = (Button)findViewById(R.id.button);
        Button botaoEntrar = (Button)findViewById(R.id.btLogin);
        Button botaoCadastrar = (Button)findViewById(R.id.btCadastrar);

        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView)findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (login.equals("Rogerio") && senha.equals("1234")) {
                    Intent intent = new Intent (MainActivity.this, MovieAdapter.class)
                }else{
                    Toast.makeText(MainActivity.this, "Login incorreto!!", Toast.LENGTH_SHORT).show();
            }
        }
});
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            mAdapter = new MoviesAdapter(movieList);
            // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),2);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);

            prepareMovieData();


        }
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText titulo = (EditText)findViewById(R.id.editText);
                EditText autor = (EditText)findViewById((R.id.editText2));
                EditText editora = (EditText)findViewById(R.id.editText3);
                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String resultado;

                //resultado = crud.insereDado(tituloString,autorString,editoraString);

                //Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();

                RoomDao dao = Room.databaseBuilder(getApplicationContext(), CarroDatabase.class, "carro.db")
                        .build()
                        .getRoomDao();
                dao.salvar(tituloString, autorString, editoraString);

                //Intent intent = new Intent(MainActivity.this, Consulta.class);
                //startActivity(intent);
            }
        });
    }
}
