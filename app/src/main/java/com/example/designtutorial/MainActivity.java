package com.example.designtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button login = findViewById(R.id.login_button);
        login.setOnClickListener(v -> {
            if(username.getText().length() != 0){
                if(password.getText().length() != 0){
                    Intent intent = new Intent(MainActivity.this,
                            MainActivityRounded.class);
                     startActivity(intent);

                }
            }
        });
    }
}