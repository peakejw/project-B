package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WasAdded extends Activity {
    DataBaseHelper helper = new DataBaseHelper(this);
    Product product = new Product();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //searches the database for the recently added class and displays that product
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.was_added);
        String search =  getIntent().getStringExtra("product");

        product =  helper.search(search);




      TextView  tv = (TextView)findViewById(R.id.TVLocation);
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

    public void OnButtonClick(View view){
        if(view.getId() == R.id.Bok){
            Intent i = new Intent(WasAdded.this, ManageProducts.class);
            startActivity(i);
        }

        if(view.getId() == R.id.removeButton){
            helper.deleteProduct(product);
            Toast.makeText(WasAdded.this,product.getProductName()+ " was removed",Toast.LENGTH_LONG).show();
        }
    }



}
