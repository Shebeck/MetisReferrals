package com.example.bryanshebeck.metisreferrals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeaveReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leave_review);

        Button submitReviewButton = (Button) findViewById(R.id.leaveReview);
        submitReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LeaveReview.this, Home.class));
            }
        });
    }
}