package com.insa.notrehexa.drawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class RepasActivityMesRepasFrag extends Fragment {


    public static RepasActivityMesRepasFrag newInstance() {

        RepasActivityMesRepasFrag fragment = new RepasActivityMesRepasFrag();
        return fragment;


    }
    public RepasActivityMesRepasFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_repas_mes_repas, container, false);

        View.OnClickListener detailsRepasListener = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailsRepas.class);
                view.getContext().startActivity(intent);
            }
        };

        CardView repas = (CardView) rootView.findViewById(R.id.mes_carte_repas_1);
        repas.setOnClickListener(detailsRepasListener);
        repas = (CardView) rootView.findViewById(R.id.mes_carte_repas_2);
        repas.setOnClickListener(detailsRepasListener);

        ImageButton b = (ImageButton) rootView.findViewById(R.id.imageButton2);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EditMealActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        b = (ImageButton) rootView.findViewById(R.id.imageButton22);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EditMealActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        return rootView;
    }
}