package com.insa.notrehexa.drawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageButton buttonFacebook = (ImageButton) findViewById(R.id.fbButton);
        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, MainActivity.class);
                startActivity(in);
            }
        });


        ImageButton buttonGoogle = (ImageButton) findViewById(R.id.gPlusButton);
        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(Login.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}
