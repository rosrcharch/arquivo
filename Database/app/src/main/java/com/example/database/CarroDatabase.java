package com.example.database;

import androidx.room.Database;


@Database(entities = {Carro.class}, version = 1, exportSchema = false)

public abstract class CarroDatabase extends androidx.room.RoomDatabase {

    public abstract RoomDao getRoomDao();



}
