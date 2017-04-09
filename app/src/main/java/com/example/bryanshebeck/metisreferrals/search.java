package com.example.bryanshebeck.metisreferrals;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class search extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] doctors = {"Michael Jimenez", "Raul Ramos", "George Martin Engle", "Phillis Mycourte", "Herbert Thompson"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.doctor_search, R.id.doctorsListView, doctors));
    }

        protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                startActivity(new Intent(search.this, doctorBio.class));
                break;
            case 1:
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sacred-heart.org/medicalgroup/profile/?ID=24")));
                break;
            case 2:

            case 3:

            case 4:


        }
    }

}
