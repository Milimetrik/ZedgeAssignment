package com.engin.zedgeassignment.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class ImagesDao_Impl implements ImagesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavouriteImage> __insertionAdapterOfFavouriteImage;

  private final EntityDeletionOrUpdateAdapter<FavouriteImage> __deletionAdapterOfFavouriteImage;

  public ImagesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavouriteImage = new EntityInsertionAdapter<FavouriteImage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favourite_images` (`id`,`previewURL`,`largeImageURL`,`user`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteImage value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getPreviewURL() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPreviewURL());
        }
        if (value.getLargeImageURL() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLargeImageURL());
        }
        if (value.getUser() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUser());
        }
      }
    };
    this.__deletionAdapterOfFavouriteImage = new EntityDeletionOrUpdateAdapter<FavouriteImage>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favourite_images` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteImage value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertFavouriteImage(final FavouriteImage favouriteImage,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavouriteImage.insert(favouriteImage);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFavouriteImage(final FavouriteImage favouriteImage,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavouriteImage.handle(favouriteImage);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<FavouriteImage>> observeAllFavouriteImages() {
    final String _sql = "SELECT * from favourite_images";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"favourite_images"}, false, new Callable<List<FavouriteImage>>() {
      @Override
      public List<FavouriteImage> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPreviewURL = CursorUtil.getColumnIndexOrThrow(_cursor, "previewURL");
          final int _cursorIndexOfLargeImageURL = CursorUtil.getColumnIndexOrThrow(_cursor, "largeImageURL");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final List<FavouriteImage> _result = new ArrayList<FavouriteImage>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavouriteImage _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpPreviewURL;
            if (_cursor.isNull(_cursorIndexOfPreviewURL)) {
              _tmpPreviewURL = null;
            } else {
              _tmpPreviewURL = _cursor.getString(_cursorIndexOfPreviewURL);
            }
            final String _tmpLargeImageURL;
            if (_cursor.isNull(_cursorIndexOfLargeImageURL)) {
              _tmpLargeImageURL = null;
            } else {
              _tmpLargeImageURL = _cursor.getString(_cursorIndexOfLargeImageURL);
            }
            final String _tmpUser;
            if (_cursor.isNull(_cursorIndexOfUser)) {
              _tmpUser = null;
            } else {
              _tmpUser = _cursor.getString(_cursorIndexOfUser);
            }
            _item = new FavouriteImage(_tmpId,_tmpPreviewURL,_tmpLargeImageURL,_tmpUser);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Boolean> isImageInFavourites(final int imageId) {
    final String _sql = "SELECT EXISTS (SELECT * from favourite_images where id = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, imageId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"favourite_images"}, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
