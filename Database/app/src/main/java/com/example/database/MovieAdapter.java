package com.example.database;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.room.Database;

import java.util.List;

public class MovieAdapter extends Database.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_view, parent, false);
        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movie = moviesList.get(position);
        holder.titulo.setText(movie.getTitulo());
        holder.genero.setText(movie.getGenero());
        holder.ano.setText(movie.getAno());

    }


    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends Database.ViewHolder {
        public TextView titulo, genero, ano;

        public MyViewHolder(View view){
            super(view);
            titulo = (TextView) view.findViewById(R.id.titulo);
            genero = (TextView) view.findViewById(R.id.genero);
            ano = (TextView) view.findViewById(R.id.ano);

        }

    }

    public MovieAdapter(List<Movie> moviesList){
        this.moviesList = moviesList;

    }

}
