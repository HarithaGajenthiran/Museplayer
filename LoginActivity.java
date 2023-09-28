package com.example.museplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText mobileNumberBox, passwordBox;
    Button btnLogin;
    String strMobileNumber = "9003234419";
    String strPassword = "1234567";

    private static void onClick() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.login_btn);
        mobileNumberBox = findViewById(R.id.et_mobile_number);
        passwordBox = findViewById(R.id.et_password);

        btnLogin.setOnClickListener(view -> {

            String mobileNumber = mobileNumberBox.getText().toString();
            String password = passwordBox.getText().toString();

            if(mobileNumber.equals("") && password.equals(""))
            {
                mobileNumberBox.setError("Please enter your mobile number");
                passwordBox.setError("Please enter your password");
            } else  if (mobileNumber.equals(""))
            {
                mobileNumberBox.setError("Please enter your mobile number");
            } else  if (password.equals(""))
            {
                mobileNumberBox.setError("Please enter your password");
            } else if(password.length() <=6)
            {
                passwordBox.setError("Please enter at least 7 characters");
            } else if (!mobileNumber.equals(strMobileNumber))
            {
                mobileNumberBox.setError("Please enter valid number");
            } else if (!password.equals(strPassword))
            {
                passwordBox.setError("Incorrect password");
            } else
            {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}


