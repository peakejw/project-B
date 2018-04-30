package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.View;
import android.widget.EditText;

public class AddProduct extends Activity {
    DataBaseHelper helper = new DataBaseHelper(this);
   public Product product = new Product();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);
    }

    public void onAddButtonClick(View view) {

        //add all elements to the product then sends them to the database also sends
        //an intent to the wasAdded class to make sure it is added and correct

        if(view.getId() == R.id.Badd) {

            EditText a = (EditText) findViewById(R.id.TFenterName);

            String b = a.getText().toString();
            product.setProductName(b);

            a = (EditText) findViewById(R.id.TFenterPrice);
            b = a.getText().toString();
            product.setPrice(b);

            a = (EditText) findViewById(R.id.TFenterQuantity);
            b = a.getText().toString();
            product.setQuantity(b);

            a = (EditText) findViewById(R.id.TFLocation);
            b = a.getText().toString();
            product.setLocation(b);

            a = (EditText) findViewById(R.id.TFExpiration);
            b = a.getText().toString();
            product.setExpiration(b);

            helper.insertProduct(product);

            Intent i = new Intent(AddProduct.this, WasAdded.class);
            i.putExtra("product", product.getProductName() );
            startActivity(i);

            if(view.getId() == R.id.ExistingProduct){
                Intent x = new Intent(AddProduct.this, ManageProducts.class);
                startActivity(x);
            }
        }

    }

}
