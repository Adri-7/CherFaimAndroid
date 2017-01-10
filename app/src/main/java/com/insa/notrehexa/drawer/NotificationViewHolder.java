package com.insa.notrehexa.drawer;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NotificationViewHolder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView message;
    ImageView imageView;

    NotificationViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        message = (TextView) itemView.findViewById(R.id.message);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
