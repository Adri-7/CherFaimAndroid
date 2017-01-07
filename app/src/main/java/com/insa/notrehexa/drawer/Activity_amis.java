package com.insa.notrehexa.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.view.ActionMode;

public class Activity_amis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amis);

        try {
            getSupportActionBar().hide();
        } catch (Exception ignored) {}

    }
}
