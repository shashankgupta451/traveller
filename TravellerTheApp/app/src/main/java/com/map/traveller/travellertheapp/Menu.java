package com.map.traveller.travellertheapp;

/**
 * Created by Raviiii on 03-01-2016.
 */

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends Activity {

    private static ImageButton cul, locl, bnor, hotres,fam,bestway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        fam = (ImageButton) findViewById(R.id.imageButton3);
        bestway = (ImageButton) findViewById(R.id.imageButton4);
        bnor = (ImageButton) findViewById(R.id.imageButton5);
        hotres = (ImageButton) findViewById(R.id.imageButton6);

        bestway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                setContentView(R.layout.activity_maps);
            }
        });

        bnor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                setContentView(R.layout.activity_maps);
            }
        });

    }

    public void current(View view)
    {
        Class ourClass = null;
        try {
            ourClass = Class.forName("com.map.traveller.travellertheapp.CurrentLocation");
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void locate(View view)
    {
        Class ourClass = null;
        try {
            ourClass = Class.forName("com.map.traveller.travellertheapp.MapsActivity");
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void tHotel(View view)
    {
        Class ourClass = null;
        try {
            ourClass = Class.forName("com.map.traveller.travellertheapp.HotelResta");
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onfamosvp(View view)
    {
        Class ourClass = null;
        try {
            ourClass = Class.forName("com.map.traveller.travellertheapp.FamVisitPlc");
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
