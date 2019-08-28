package com.example.database;

import androidx.room.Database;


@Database(entities = (Carro.class), version = 1)

public abstract class RoomDatabase extends androidx.room.RoomDatabase {

}
