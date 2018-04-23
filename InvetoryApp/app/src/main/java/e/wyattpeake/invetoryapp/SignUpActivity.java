package e.wyattpeake.invetoryapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        String confirm;


        PasswordDataBase helper = new PasswordDataBase(this);
        UserName userName = new UserName();

        EditText a = (EditText) findViewById(R.id.TfUsername);
        String b = a.getText().toString();
        userName.setUserName(b);

        while(userName.getPassword() == null) {

            a = (EditText) findViewById(R.id.TFPasword);
            b = a.getText().toString();
            a = (EditText) findViewById(R.id.TFConfirm);
            confirm = a.getText().toString();

            if (confirm.equals(b)) {
                userName.setPassword(b);
            }
        }

        helper.insertUser(userName);




    }
}
