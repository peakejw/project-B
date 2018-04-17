package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //vasu and wyatt ahmed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v){

        if(v.getId() == R.id.Blogin){
            Intent i = new Intent(MainActivity.this, LogInActivity.class);
            startActivity(i);
        }

    }
}
