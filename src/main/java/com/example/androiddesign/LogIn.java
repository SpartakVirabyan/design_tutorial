package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password_sign);
        Button logIn = findViewById(R.id.login_btn);
        TextView text = findViewById(R.id.text);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(email.getText().length() == 0)) {
                    if (!(password.getText().length() == 0)) {
                        text.setText("OK");
                    }
                }

            }
        });
    }
}