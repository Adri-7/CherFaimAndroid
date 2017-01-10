package com.insa.notrehexa.drawer;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class EditMealActivity extends CreateMealActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Add example values
        final EditText date = (EditText) findViewById(R.id.meal_date);
        final EditText time = (EditText) findViewById(R.id.meal_time);
        final EditText name = (EditText) findViewById(R.id.meal_name);
        final EditText place = (EditText) findViewById(R.id.meal_place);
        final LinearLayout content = (LinearLayout) findViewById(R.id.meal_content);
        final ImageView photo = (ImageView) findViewById(R.id.meal_image);

        date.setText("12/01/2016");
        time.setText("12:00");
        name.setText("Groupe de projet");
        place.setText("RU Jussieu");
        photo.setImageResource(R.drawable.meal_example);
        View v = LayoutInflater.from(content.getContext()).inflate(R.layout.sample_meal_participant, content, false);
        content.addView(v);
    }
}
