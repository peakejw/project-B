package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class viewinventory extends AppCompatActivity {
    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewinventory);
        String search =  getIntent().getStringExtra("product");
        Product product = new Product();
        product =  helper.search(search);




        TextView tv = (TextView)findViewById(R.id.TVLocation);
        tv.setText(product.getLocation());

        tv = (TextView)findViewById(R.id.TVid);
        tv.setText(product.getId());

        tv = (TextView)findViewById(R.id.TVname);
        tv.setText(product.getProductName());

        tv = (TextView)findViewById(R.id.TVPrice);
        tv.setText(product.getPrice());

        tv = (TextView)findViewById(R.id.TVQuantity);
        tv.setText(product.getQuantity());

        tv = (TextView)findViewById(R.id.TVExpiration);
        tv.setText(product.getExpiration());

    }






    }


