package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageorView extends AppCompatActivity {

    DataBaseHelper helper = new DataBaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manageor_view);
    }


    public void onButtonManageClick(View v) {

        if (v.getId() == R.id.ManageButton) {
            Intent i = new Intent(ManageorView.this, AddProduct.class);
            startActivity(i);
        }
        // (v.getId() == R.id.ViewButton) {

        if (v.getId() == R.id.ViewButton){
            Intent i = new Intent(ManageorView.this, ViewInventory.class);
            startActivity(i);
        }


    }
}