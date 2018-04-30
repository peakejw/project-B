package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Update extends AppCompatActivity {
    public Product product = new Product();
    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }

    public void onButtonClick (View v){

        if(v.getId() == R.id.UpdateProduct){

            EditText a = (EditText) findViewById(R.id.TFupdateName);

            String b = a.getText().toString();
            product = helper.search(b);

            if (product.getProductName() == null) {
                Toast.makeText(Update.this, " product doesn't exist!", Toast.LENGTH_LONG).show();

            }
            else {



                Intent i = new Intent(Update.this, ProductUpdate.class);
                i.putExtra("product", product.getProductName());
                startActivity(i);
            }
        }

    }

}
