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

    }
}
