package com.insa.notrehexa.drawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<NotificationData> data = new ArrayList<>();

        data.add(new NotificationData("Peter Parker veut être votre ami.", true, R.drawable.icon_man_64dp));
        data.add(new NotificationData("Peter Parker vous a invité dans son groupe \"Un bon gros ninka !\".", true, R.drawable.ic_people_black_24dp));
        data.add(new NotificationData("John Doe veut être votre ami.", true, R.drawable.icon_man_64dp));
        data.add(new NotificationData("Janet Doe veut être votre ami.", true, R.drawable.icon_woman_64dp));
        data.add(new NotificationData("Peter Parker veut être votre ami.", true, R.drawable.icon_man_64dp));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        NotificationViewAdapter adapter = new NotificationViewAdapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
