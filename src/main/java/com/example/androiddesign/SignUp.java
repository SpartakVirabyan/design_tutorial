package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password_sign);
        EditText confirmPassword = findViewById(R.id.confirm_password);
        Button signUp = findViewById(R.id.sign_up_btn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(name.getText().length() == 0)){
                    if(!(email.getText().length() == 0)){
                        if(!(password.getText().length() == 0)) {
                            if (!(confirmPassword.getText().length() == 0)) {
                                Intent intent = new Intent(SignUp.this,
                                        LogIn.class);
                            }
                        }
                    }
                }
            }
        });

    }
}