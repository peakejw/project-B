package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogInActivity extends Activity {
   private UserName user = new UserName();
    PasswordDataBase helper = new PasswordDataBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void onButtonClick (View v){

        if(v.getId() == R.id.BSignIn){



            EditText a = (EditText) findViewById(R.id.TFUsername);

            String b = a.getText().toString();
            user.setUserName(b);

            a = (EditText) findViewById(R.id.TFpassword);

            b = a.getText().toString();
            user.setPassword(b);

            if(helper.validateUser(user) == true) {


                Intent i = new Intent(LogInActivity.this, ManageorView.class);
                startActivity(i);
            }
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

