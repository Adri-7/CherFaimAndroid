package com.insa.notrehexa.drawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class DetailsAmi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_ami);

        // Set the defined toolbar as the action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_details_ami);
        setSupportActionBar(toolbar);

        // Add Up Action to the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Francis Desforges");

        View.OnClickListener detailsRepasListener = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailsRepas.class);
                view.getContext().startActivity(intent);
            }
        };

        CardView repas = (CardView) findViewById(R.id.carte_repas_1);
        repas.setOnClickListener(detailsRepasListener);
        repas = (CardView) findViewById(R.id.carte_repas_2);
        repas.setOnClickListener(detailsRepasListener);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
