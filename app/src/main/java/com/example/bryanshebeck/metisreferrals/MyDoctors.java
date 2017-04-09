package com.example.bryanshebeck.metisreferrals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by bwkuloba on 4/8/17.
 */

public class MyDoctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydoctors);


        ImageButton homeButton = (ImageButton) findViewById(R.id.persistentHomeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyDoctors.this, Home.class));
            }
        });

        ImageButton docButton = (ImageButton) findViewById(R.id.persistentDocButton);
        docButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyDoctors.this, MyDoctors.class));
            }
        });

        ImageButton apptButton = (ImageButton) findViewById(R.id.persistentApptButton);
        apptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyDoctors.this, MyAppointments.class));
            }
        });

        ImageButton profileButton = (ImageButton) findViewById(R.id.persistentProfileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyDoctors.this, Profile.class));
            }
        });
    }

}
