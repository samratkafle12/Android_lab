package com.example.mydbms2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;


public class DBAdapter {



    private static final String DB_NAME = "student.db";
    private static final String DB_TABLE = "students";
    private static final int DB_VERSION = 1;

    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_CLASS = "class";
    public static final String KEY_NUMBER = "number";

    private SQLiteDatabase db;
    private final Context context;
    private DBOpenHelper dbOpenHelper;

    public DBAdapter(Context _context) {
        context = _context;
    }

    /**
     * Close the database
     */
    public void close() {
        if (db != null) {
            db.close();
            db = null;
        }
    }

    /**
     * Open the database
     */
    public void open() throws SQLiteException {
        dbOpenHelper = new DBOpenHelper(context, DB_NAME, null, DB_VERSION);
        try {
            db = dbOpenHelper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = dbOpenHelper.getReadableDatabase();
        }
    }

    public long insert(Student student) {
        ContentValues newValues = new ContentValues();

        newValues.put(KEY_NAME, student.Name);
        newValues.put(KEY_CLASS, student.Clas);
        newValues.put(KEY_NUMBER, student.Number);

        return db.insert(DB_TABLE, null, newValues);
    }


    public Student[] queryAllData() {
        Cursor results = db.query(DB_TABLE, new String[]{KEY_ID, KEY_NAME, KEY_CLASS, KEY_NUMBER},
                null, null, null, null, null);
        return ConvertToStudent(results);
    }

    public Student[] queryOneData(long id) {
        Cursor results = db.query(DB_TABLE, new String[]{KEY_ID, KEY_NAME, KEY_CLASS, KEY_NUMBER},
                KEY_ID + "=" + id, null, null, null, null);
        return ConvertToStudent(results);
    }

    private Student[] ConvertToStudent(Cursor cursor) {
        int resultCounts = cursor.getCount();
        if (resultCounts == 0 || !cursor.moveToFirst()) {
            return null;
        }
        Student[] students = new Student[resultCounts];
        for (int i = 0; i < resultCounts; i++) {
            students[i] = new Student();
            students[i].ID = cursor.getInt(0);
            students[i].Name = cursor.getString(cursor.getColumnIndex(KEY_NAME));
            students[i].Clas = cursor.getString(cursor.getColumnIndex(KEY_CLASS));
            students[i].Number = cursor.getString(cursor.getColumnIndex(KEY_NUMBER));
            cursor.moveToNext();
        }
        return students;
    }

    public long deleteAllData() {
        return db.delete(DB_TABLE, null, null);
    }

    public long deleteOneData(int id) {
        return db.delete(DB_TABLE, KEY_ID + "=" + id, null);
    }

    public long updateOneData(long id, Student student) {
        ContentValues updateValues = new ContentValues();
        updateValues.put(KEY_NAME, student.Name);
        updateValues.put(KEY_CLASS, student.Clas);
        updateValues.put(KEY_NUMBER, student.Number);

        return db.update(DB_TABLE, updateValues, KEY_ID + "=" + id, null);
    }

    private static class DBOpenHelper extends SQLiteOpenHelper {

        public DBOpenHelper(Context context, String name, CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        private static final String DB_CREATE = "create table " +
                DB_TABLE + " (" + KEY_ID + " integer primary key autoincrement, " +
                KEY_NAME + " text not null, " + KEY_CLASS + " text not null," + KEY_NUMBER + " text not null);";

        @Override
        public void onCreate(SQLiteDatabase _db) {
            _db.execSQL(DB_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase _db, int _oldVersion, int _newVersion) {
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
            onCreate(_db);
        }
    }
}



