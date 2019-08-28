package com.example.database;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface RoomDao {


    @Insert
    void salvar(String... nome);
}
