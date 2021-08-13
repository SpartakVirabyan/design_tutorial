package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityRounded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rounded);
        EditText username = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.pass_word);
        Button login = findViewById(R.id.log_in_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().length() != 0){
                    if(password.getText().length() != 0){
                        Intent intent = new Intent(MainActivityRounded.this,
                                SignIn.class);
                    }
                }
            }
        });
    }
}