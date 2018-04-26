package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }

    public void onButtonClick (View v){

        if(v.getId() == R.id.UpdateProduct){
            Intent i = new Intent(Update.this, ProductUpdate.class);
            startActivity(i);
        }

    }

}
