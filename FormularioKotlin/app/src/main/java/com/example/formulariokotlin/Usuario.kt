package com.example.formulariokotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Usuario(@PrimaryKey(autoGenerate = true)val id: Int = 0,
              @ColumnInfo(name = "nome_usuario") val nome: String,
              @ColumnInfo(name = "nome_usuario") val numero: Int,
              @ColumnInfo(name = "nome_usuario") val numero: Int,
              @ColumnInfo(name = "nome_usuario") val numero: Int,)

