package com.todo.list.data.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.todo.list.data.db.model.TodoListData;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoListDAO_Impl implements TodoListDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoListData> __insertionAdapterOfTodoListData;

  private final EntityDeletionOrUpdateAdapter<TodoListData> __deletionAdapterOfTodoListData;

  public TodoListDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoListData = new EntityInsertionAdapter<TodoListData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TodoList` (`id`,`name`,`completionStatus`,`completionDeadline`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoListData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = value.getCompletionStatus() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getCompletionDeadline());
      }
    };
    this.__deletionAdapterOfTodoListData = new EntityDeletionOrUpdateAdapter<TodoListData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TodoList` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoListData value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final TodoListData todoListData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTodoListData.insert(todoListData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTodoItem(final TodoListData todoListData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTodoListData.handle(todoListData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getTodoList(final Continuation<? super List<TodoListData>> continuation) {
    final String _sql = "SELECT * FROM TODOLIST";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<TodoListData>>() {
      @Override
      public List<TodoListData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "completionStatus");
          final int _cursorIndexOfCompletionDeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "completionDeadline");
          final List<TodoListData> _result = new ArrayList<TodoListData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TodoListData _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final boolean _tmpCompletionStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCompletionStatus);
            _tmpCompletionStatus = _tmp != 0;
            final long _tmpCompletionDeadline;
            _tmpCompletionDeadline = _cursor.getLong(_cursorIndexOfCompletionDeadline);
            _item = new TodoListData(_tmpId,_tmpName,_tmpCompletionStatus,_tmpCompletionDeadline);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
