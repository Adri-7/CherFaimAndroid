package com.insa.notrehexa.drawer;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailsRepas extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_repas);

        // Set the defined toolbar as the action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_details_ami);
        setSupportActionBar(toolbar);

        // Add Up Action to the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View.OnClickListener detailsAmiListener = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailsAmi.class);
                view.getContext().startActivity(intent);
            }
        };

        CardView repas = (CardView) findViewById(R.id.carte_ami_1);
        repas.setOnClickListener(detailsAmiListener);
        repas = (CardView) findViewById(R.id.carte_ami_2);
        repas.setOnClickListener(detailsAmiListener);
        repas = (CardView) findViewById(R.id.carte_ami_3);
        repas.setOnClickListener(detailsAmiListener);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ruJussieu = new LatLng(45.780854, 4.876195);
        mMap.addMarker(new MarkerOptions().position(ruJussieu).title("RU Jussieu"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(ruJussieu));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ruJussieu, 17.0f));
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
