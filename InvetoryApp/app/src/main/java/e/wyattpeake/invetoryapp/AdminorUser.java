package e.wyattpeake.invetoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminorUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminor_user);
    }
        public void onButtonClick (View v){

            if(v.getId() == R.id.AdminButton){
                Intent i = new Intent(AdminorUser.this, LogInActivity.class);
                startActivity(i);
            }


    }
}
