package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by wyattpeake on 4/2/18.
 */

public class ManageProducts extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_product);
    }

    public void onButtonClick (View v){

        if(v.getId() == R.id.BaddNew){
            Intent i = new Intent(ManageProducts.this, AddProduct.class);
            startActivity(i);
        }

        if(v.getId() == R.id.updateButton){
            Intent i = new Intent(ManageProducts.this, Update.class);
            startActivity(i);
        }

        if(v.getId() == R.id.removeButton){
            Intent i = new Intent(ManageProducts.this, RemoveProduct.class);
            startActivity(i);
        }

    }
}
