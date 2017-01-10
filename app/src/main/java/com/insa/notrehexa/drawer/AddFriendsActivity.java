package com.insa.notrehexa.drawer;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class AddFriendsActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friends);

        // Set the defined toolbar as the action bar
        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);

        // Add Up Action to the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set the recycer view
        List<FriendData> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewF);
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
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    public List<FriendData> fill_with_data() {

        List<FriendData> data = new ArrayList<>();

        data.add(new FriendData("Aubrey Bousquet",R.drawable.icon_man_64dp));
        data.add(new FriendData("Villette Marcil", R.drawable.icon_woman_64dp));
        data.add(new FriendData("Arnaude Gaulin", R.drawable.icon_woman_64dp));
        data.add(new FriendData("Verney Breton", R.drawable.icon_man_64dp));
        data.add(new FriendData("Bruce Gingras", R.drawable.icon_man_64dp));
        data.add(new FriendData("Océane Savoie", R.drawable.icon_woman_64dp));

        return data;
    }
}
