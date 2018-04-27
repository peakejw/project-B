package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewInventory extends AppCompatActivity {
    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewinventory);

        /*
       while(true) {
           Product product = helper.dislpay();


           TextView tv = (TextView) findViewById(R.id.TVid2);
           tv.setText(product.getId());

           tv = (TextView) findViewById(R.id.TVproduct2);
           tv.setText(product.getProductName());

           tv = (TextView) findViewById(R.id.TVquantity2);
           tv.setText(product.getQuantity());



       }
       */
    }






    }


