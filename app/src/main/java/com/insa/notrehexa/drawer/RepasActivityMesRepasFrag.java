package com.insa.notrehexa.drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

        return rootView;
    }
}