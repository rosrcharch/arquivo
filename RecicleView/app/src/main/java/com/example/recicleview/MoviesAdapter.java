package com.example.recicleview;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movie = moviesList.get(position);
        holder.titulo.setText(movie.getTitlo());
        holder.genero.setText(movie.getGenero());
        holder.ano.setText(movie.getAno());

    }


    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, genero, ano;

        public MyViewHolder(View view){
            super(view);
            titulo = (TextView) view.findViewById(R.id.titulo);
            genero = (TextView) view.findViewById(R.id.genero);
            ano = (TextView) view.findViewById(R.id.ano);

        }

    }

    public MoviesAdapter(List<Movie> moviesList){
        this.moviesList = moviesList;

    }

}

