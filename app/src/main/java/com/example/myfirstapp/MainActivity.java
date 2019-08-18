package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
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

        // todo: put this in a thread you dummy!
        // bypass the networkOnMainThreadException
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

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
                    results = repo.getActivityList().execute().body();
                    Log.d("MainActivity", "Success!");
                    for (int i = 0; i < results.size(); i++) {
                        OSActivity result = results.get(i);
                        Log.d("MainActivity", result.getName());
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
