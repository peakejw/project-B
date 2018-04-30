package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ItemToBeRemoved extends Activity{
    public Product product = new Product();
    DataBaseHelper helper = new DataBaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.was_removed);

        String name =  getIntent().getStringExtra("product");
        product = helper.search(name);


        TextView tv = (TextView)findViewById(R.id.RLocation);
        tv.setText(product.getLocation());

        tv = (TextView)findViewById(R.id.Rid);
        tv.setText(product.getId());

        tv = (TextView)findViewById(R.id.Rname);
        tv.setText(product.getProductName());

        tv = (TextView)findViewById(R.id.Rprice);
        tv.setText(product.getPrice());

        tv = (TextView)findViewById(R.id.Rquantity);
        tv.setText(product.getQuantity());

        tv = (TextView)findViewById(R.id.RExpiration);
        tv.setText(product.getExpiration());
    }

    public void onRemoveClick(View view){
        if(view.getId() == R.id.RRemove){
            helper.deleteProduct(product);

            Intent i = new Intent(ItemToBeRemoved.this, ManageProducts.class);
            startActivity(i);
        }
        if(view.getId() == R.id.RCancel){
            Intent i = new Intent(ItemToBeRemoved.this, ManageProducts.class);
            startActivity(i);
        }
    }
}
