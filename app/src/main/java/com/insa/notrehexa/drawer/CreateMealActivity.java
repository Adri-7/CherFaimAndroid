package com.insa.notrehexa.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.List;

public class CreateMealActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_meal);

        // Add Up Action to the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the recycer view
        List<FriendData> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.meal_participating);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.save_action, menu);
        return true;
    }

    public List<FriendData> fill_with_data() {

        List<FriendData> data = new ArrayList<>();

        data.add(new FriendData("Xavier Berthelette",R.drawable.icon_man_64dp));
        data.add(new FriendData("Faye Thibault", R.drawable.icon_woman_64dp));
        data.add(new FriendData("Peppin Séguin", R.drawable.icon_man_64dp));

        return data;
    }
}