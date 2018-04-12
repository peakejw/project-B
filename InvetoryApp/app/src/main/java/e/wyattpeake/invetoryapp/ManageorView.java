package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageorView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manageor_view);
    }


    public void onButtonClick (View v){

        if(v.getId() == R.id.SignInButton){
            Intent i = new Intent(ManageorView.this, AddProduct.class);
            startActivity(i);
        }

    }
}
