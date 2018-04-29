package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewInventory extends Activity{
   public DataBaseHelper helper = new DataBaseHelper(this);


   public ArrayList<Product> Plist = new ArrayList();








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_inventory);
        Cursor cursor =  helper.display();
        ListView listView ;


        int i =0;


        while(cursor.moveToNext()) {
            Product product = new Product();
            product.setProductName(cursor.getString(1));
            product.setLocation(cursor.getString(5));
            product.setQuantity(cursor.getString(2));
            product.setPrice(cursor.getString(3));
            System.out.println(cursor.getString(1) + " " + cursor.getString(5) + " ");

            Plist.add(i, product);
            i++;
        }


            MyListAdapter listAdapter = new MyListAdapter(this, R.layout.temp_layout, Plist);

            listView = (ListView) findViewById(R.id.ListView);
            listView.setAdapter(listAdapter);












    }



}
