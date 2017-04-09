package com.example.bryanshebeck.metisreferrals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton homeProfileButton = (ImageButton) findViewById(R.id.homeScreenProfileButton);
        homeProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Profile.class));
            }
        });

        ImageButton homeDoctorsButton = (ImageButton) findViewById(R.id.homeScreenMyDocsButton);
        homeDoctorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, search.class));
            }
        });

        ImageButton homeAppointmentsButton = (ImageButton) findViewById(R.id.homeScreenAppointmentsButton);
        homeAppointmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, MyAppointments.class));
            }
        });

        ImageButton homeAboutUsButton = (ImageButton) findViewById(R.id.homeScreenAboutButton);
        homeAboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, About.class));
            }
        });

        ImageButton homeSettingsButton = (ImageButton) findViewById(R.id.homeScreenSettingsButton);
        homeDoctorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Settings.class));
            }
        });

    }
}
