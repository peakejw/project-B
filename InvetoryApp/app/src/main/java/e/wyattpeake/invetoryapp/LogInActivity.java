package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void onButtonClick (View v){

        if(v.getId() == R.id.BSignIn){
            Intent i = new Intent(LogInActivity.this, ManageorView.class);
            startActivity(i);
        }

        if(v.getId() == R.id.BSignUp){
            Intent i = new Intent(LogInActivity.this, SignUpActivity.class);
            startActivity(i);
        }

//        if(v.getId() == R.id.Blogin){
//            Intent i = new Intent(LogInActivity.this, A.class);
//            startActivity(i);
//            }
//
//        }
    }

            }

