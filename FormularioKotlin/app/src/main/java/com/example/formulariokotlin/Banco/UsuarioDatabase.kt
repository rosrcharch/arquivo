package com.example.formulariokotlin.Banco

import androidx.room.Database
import com.example.formulariokotlin.Usuario

@Database(entities = arrayOf(Usuario::class), version = 1, exportSchema = false)
    class UsuarioDatabase

