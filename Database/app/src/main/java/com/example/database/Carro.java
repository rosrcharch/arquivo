package com.example.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Carro {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String cor;
    private String marca;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
