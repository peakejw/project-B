package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddProduct extends Activity {
    DataBaseHelper helper = new DataBaseHelper(this);
    Product product = new Product();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);
    }

    public void onButtonClick(View view) {

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

            helper.insertProduct(product);
        }

    }

}
