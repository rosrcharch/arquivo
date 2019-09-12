package com.example.listalivros;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/listalivros/Livros;", "", "id", "", "nome", "", "produtora", "autora", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutora", "()Ljava/lang/String;", "getId", "()I", "getNome", "getProdutora", "app_debug"})
public final class Livros {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nome_campo")
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "produtora_campo")
    private final java.lang.String produtora = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "autora")
    private final java.lang.String autora = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProdutora() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAutora() {
        return null;
    }
    
    public Livros(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String produtora, @org.jetbrains.annotations.NotNull()
    java.lang.String autora) {
        super();
    }
}