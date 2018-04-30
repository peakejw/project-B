package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProductUpdate extends AppCompatActivity {
    public Product product = new Product();
    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_update);


        String name =  getIntent().getStringExtra("product");
        product = helper.search(name);

       TextView tv = (TextView) findViewById(R.id.TVproductUpdate) ;

        tv.setText(product.getProductName());

        tv = (TextView) findViewById(R.id.TVlocationUpdate) ;

        tv.setText(product.getLocation());

        tv = (TextView) findViewById(R.id.TVpriceUpdate) ;

        tv.setText(product.getPrice());

        tv = (TextView) findViewById(R.id.TVquantityUpdate) ;

        tv.setText(product.getQuantity());

        tv = (TextView) findViewById(R.id.TVexUpdate) ;

        tv.setText(product.getExpiration());



    }

    public void onUpdateClick(View view){
        if(view.getId() == R.id.UpdateProductButton) {
            helper.deleteProduct(product);

            EditText a = findViewById(R.id.TVproductUpdate);
           String b = a.getText().toString();
           product.setProductName(b);

             a = findViewById(R.id.TVlocationUpdate);
             b = a.getText().toString();
            product.setLocation(b);

             a = findViewById(R.id.TVpriceUpdate);
             b = a.getText().toString();
            product.setPrice(b);

             a = findViewById(R.id.TVquantityUpdate);
             b = a.getText().toString();
            product.setQuantity(b);

            a = findViewById(R.id.TVexUpdate);
            b = a.getText().toString();
            product.setExpiration(b);

            helper.insertProduct(product);
            Toast.makeText(ProductUpdate.this, product.getProductName() +" was updated ! ", Toast.LENGTH_LONG).show();

            Intent i = new Intent(ProductUpdate.this, ManageProducts.class);
            startActivity(i);









        }
    }
}
