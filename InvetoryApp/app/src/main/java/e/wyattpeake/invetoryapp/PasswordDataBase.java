package e.wyattpeake.invetoryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class PasswordDataBase extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "password.db";
    private static final String TABLE_NAME = "password";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";
   SQLiteDatabase db;

    public static final String Table_Create = "create table "+ TABLE_NAME + " (id integer primary key autoincrement, " +
            "username text not null, password text not null)";

    public PasswordDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Table_Create);
        this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String query = "drop table if EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);


    }

    public void insertUser(UserName u) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUMN_USERNAME, u.getUserName());
        values.put(COLUMN_PASSWORD, u.getPassword());



    }

    //valid dates user password, takes in object of Username returns boolean

    public  boolean validateUser(UserName user){
        db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from "+ TABLE_NAME, null);
        String a, b;

        boolean valid = false;


        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(1);
                if(a.equalsIgnoreCase(user.getUserName())){
                   b = cursor.getString(2);
                   if( b.equals(user.getPassword())){
                       valid = true;
                    }
                }

            } while (cursor.moveToNext());
        }
        return valid;
    }
}
