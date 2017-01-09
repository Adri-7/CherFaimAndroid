package com.insa.notrehexa.drawer;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;



public class RepasActivitySuggestionsFrag extends Fragment {


    public static RepasActivitySuggestionsFrag newInstance() {

        RepasActivitySuggestionsFrag fragment = new RepasActivitySuggestionsFrag();
        return fragment;


    }
    public RepasActivitySuggestionsFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_repas_suggestions, container, false);

        return rootView;
    }
}