package e.wyattpeake.invetoryapp;

import android.content.Context;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataBaseHelperTest {
    Context context;
    Product product;


    @Test
    public void insertProduct() {
        DataBaseHelper dbh = new DataBaseHelper(context);
        dbh.insertProduct(product);

        assertEquals(product, dbh.getDatabaseName());

    }

    @Test
    public void search() {
    }
}