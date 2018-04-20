package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WasAdded extends Activity {
    DataBaseHelper helper = new DataBaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //searches the database for the recently added class and displays that product
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.was_added);
        String search =  getIntent().getStringExtra("product");
        Product product = new Product();
        product =  helper.search(search);




      TextView  tv = (TextView)findViewById(R.id.TVaddedProduct);
        tv.setText(product.toString());




    }

    public void OnButtonClick(View view){
        if(view.getId() == R.id.Bok){
            Intent i = new Intent(WasAdded.this, ManageProducts.class);
            startActivity(i);
        }
    }



}
