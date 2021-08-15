package com.example.designtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRounded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rounded);
        EditText username = findViewById(R.id.username_rounded);
        EditText password = findViewById(R.id.password_rounded);
        Button login = findViewById(R.id.login_button_rounded);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().length() != 0){
                    if(password.getText().length() != 0){
                        Intent intent = new Intent(MainActivityRounded.this,
                                SignIn.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}