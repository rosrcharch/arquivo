package com.example.recicleview;

public class Movie {

    private String titulo;
    private String genero;
    private String ano;


    public Movie(){

    }

    public Movie(String titulo, String genero, String ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitlo() {

        return titulo;
    }

    public void setTitlo(String titlo) {

        this.titulo = titlo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {

        return ano;
    }

    public void setAno(String ano) {

        this.ano = ano;
    }


}
