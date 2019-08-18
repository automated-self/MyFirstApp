package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    private MainViewPresenterInterface presenter = new Presenter();
    private Repo repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        repo = new Repo();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 EditText activityEditTextView = (EditText)findViewById(R.id.activity_name);
                 presenter.logActivity(
                         activityEditTextView.getText().toString()
                 );
             }
        });

        findViewById(R.id.button_get_activities).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<OSActivity> results;
                try {
                    results = repo.getActivityList().execute().body().getResults();
                    Log.d("MainActivity", "Success!");
                    for (int i = 0; i < results.size(); i++) {
                        Log.d()
                    }
                    Log.d("MainActivity", repo.getActivityList().execute().body().toString());

                } catch (IOException e) {
                    Log.d("MainActivity", "error!");
                    e.printStackTrace();
                }
            }
        });
    }
}
