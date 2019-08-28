package com.example.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;


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

    private void prepareMovieData(){
        Movie movie = new Movie("American pie: o primeiro encontro", "comedia e besteirol americano", "2012");
        movieList.add(movie);

        movie  = new Movie("Flash: Flash point paradox", "acao, aventura", "2016");
        movieList.add(movie);

        movie = new Movie("Liga da Justica: Guerra", "aventura, suspense", "2017");
        movieList.add(movie);

        movie = new Movie("Aquaman: Trono de Atlantis", "acao, aventura", "2017");
        movieList.add(movie);

        movie = new Movie("Batman: Bad Blood", "suspense, acao, aventura", "2017");
        movieList.add(movie);

        movie = new Movie("Esquadrao Suicida: Ataque ao Arkham", "acao, comedia, suspense", "2018");
        movieList.add(movie);

        movie = new Movie("Liga da Justica Sombria", "acao, aventura", "2018");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();



    }
}
