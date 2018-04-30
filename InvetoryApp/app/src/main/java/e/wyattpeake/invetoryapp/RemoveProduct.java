package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RemoveProduct extends AppCompatActivity {
   public Product product = new Product();
   DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_product);
    }

    public void onRemoveButtonClick(View v) {

        if(v.getId() == R.id.RPremove) {
            EditText a = (EditText) findViewById(R.id.ETRemoveText);

            String b = a.getText().toString();
            product = helper.search(b);

            if (product.getProductName() == null) {
                Toast.makeText(RemoveProduct.this, " product doesnt exist!", Toast.LENGTH_LONG).show();

            } else {
                Intent i = new Intent(RemoveProduct.this, ItemToBeRemoved.class);
                i.putExtra("product", product.getProductName());
                startActivity(i);
            }
        }
    }

}
