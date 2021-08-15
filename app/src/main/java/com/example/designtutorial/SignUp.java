package com.example.designtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText name = findViewById(R.id.name_sign_up);
        EditText email = findViewById(R.id.email_sign_up);
        EditText password = findViewById(R.id.password_sign_up);
        EditText confirmPassword = findViewById(R.id.confirm_password_sign_up);
        Button signUp = findViewById(R.id.signup_button);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(name.getText().length() == 0)){
                    if(!(email.getText().length() == 0)){
                        if(!(password.getText().length() == 0)) {
                            if (!(confirmPassword.getText().length() == 0)) {
                                Intent intent = new Intent(SignUp.this,
                                        LogIn.class);
                                startActivity(intent);
                            }
                        }
                    }
                }
            }
        });

    }
}