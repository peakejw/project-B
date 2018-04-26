package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends Activity {
    PasswordDataBase helper = new PasswordDataBase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onButtonClick(View view) {

        if (view.getId() == R.id.BCreate) {

            String confirm;



            UserName userName = new UserName();

            EditText a = (EditText) findViewById(R.id.TfUsername);
            String b = a.getText().toString();
            userName.setUserName(b);

            while (userName.getPassword() == null) {

                a = (EditText) findViewById(R.id.TFPasword);
                b = a.getText().toString();
                a = (EditText) findViewById(R.id.TFConfirm);
                confirm = a.getText().toString();

                if (confirm.equals(b)) {
                    userName.setPassword(b);
                }
            }

            helper.insertUser(userName);

            Intent i = new Intent(SignUpActivity.this, LogInActivity.class);
            startActivity(i);
        }
    }





}
