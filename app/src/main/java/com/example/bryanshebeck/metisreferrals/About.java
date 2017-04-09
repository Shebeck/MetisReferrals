package com.example.bryanshebeck.metisreferrals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by bwkuloba on 4/8/17.
 */

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ImageButton homeButton = (ImageButton) findViewById(R.id.persistentHomeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, Home.class));
            }
        });

        ImageButton docButton = (ImageButton) findViewById(R.id.persistentDocButton);
        docButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, MyDoctors.class));
            }
        });

        ImageButton apptButton = (ImageButton) findViewById(R.id.persistentApptButton);
        apptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, MyAppointments.class));
            }
        });

        ImageButton profileButton = (ImageButton) findViewById(R.id.persistentProfileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, Profile.class));
            }
        });
    }

}