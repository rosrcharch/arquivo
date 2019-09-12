package com.example.listalivros;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LivroRoomDao_Impl implements LivroRoomDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Livros> __insertionAdapterOfLivros;

  public LivroRoomDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLivros = new EntityInsertionAdapter<Livros>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Livros` (`id`,`nome_campo`,`produtora_campo`,`autora`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Livros value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getProdutora() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProdutora());
        }
        if (value.getAutora() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAutora());
        }
      }
    };
  }

  @Override
  public void inserir(final Livros livros) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLivros.insert(livros);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Livros> buscarTodos() {
    final String _sql = "SELECT * FROM livros";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome_campo");
      final int _cursorIndexOfProdutora = CursorUtil.getColumnIndexOrThrow(_cursor, "produtora_campo");
      final int _cursorIndexOfAutora = CursorUtil.getColumnIndexOrThrow(_cursor, "autora");
      final List<Livros> _result = new ArrayList<Livros>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Livros _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        _tmpNome = _cursor.getString(_cursorIndexOfNome);
        final String _tmpProdutora;
        _tmpProdutora = _cursor.getString(_cursorIndexOfProdutora);
        final String _tmpAutora;
        _tmpAutora = _cursor.getString(_cursorIndexOfAutora);
        _item = new Livros(_tmpId,_tmpNome,_tmpProdutora,_tmpAutora);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
