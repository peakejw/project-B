package e.wyattpeake.invetoryapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "product.db";
    private static final String TABLE_PRODUCT = "product";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_PRODUCT_NAME = "productName";
    private static final String COLUMN_QUANTITY = "quantity";
    private static final String COLUMN_PRICE = "price";
    SQLiteDatabase db;

    public static final String Table_Create = "create table "+ TABLE_PRODUCT + " (id integer primary key autoincrement, " +
            "productName text not null, quantity text not null, price text not null)";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Table_Create);
        this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String query = "drop table if EXISTS " + TABLE_PRODUCT;
        db.execSQL(query);
        this.onCreate(db);


    }

    public void insertContact(Product p) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put(COLUMN_ID, p.getId());
        values.put(COLUMN_PRODUCT_NAME, p.getProductName());
        values.put(COLUMN_QUANTITY, p.getQuantity());
        values.put(COLUMN_PRICE, p.getPrice());

        db.insert(TABLE_PRODUCT, null, values);
        db.close();


    }

    public Product search(String word) {
        db = this.getReadableDatabase();
        Product product = new Product();
        Cursor cursor = db.rawQuery("select * from "+ TABLE_PRODUCT, null);
        String a;
        String b = "not found";

        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(1);
                if(a.equalsIgnoreCase(word)){
                    product.setId(cursor.getString(0));
                    product.setId(cursor.getString(1));
                    product.setId(cursor.getString(2));
                    product.setId(cursor.getString(3));
                }

            } while (cursor.moveToNext());
        }
        return product;


    }

}