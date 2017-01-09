package com.insa.notrehexa.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetailsAmi extends AppCompatActivity {
    final private static String amiName = "Jean Farget";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_ami);

        // Set the defined toolbar as the action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_details_ami);
        setSupportActionBar(toolbar);

        // Add Up Action to the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle(amiName);
    }
}
