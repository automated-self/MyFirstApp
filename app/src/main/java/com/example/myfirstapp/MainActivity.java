package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        presenter = new Presenter();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 presenter.logActivity(findViewById(R.id.activity_name));



//                 Bundle params = new Bundle();
//                 params.putString("mood", "alert");
//                 params.putString("userID", "Cory&Chris");
//                 mFirebaseAnalytics.logEvent("test_event", params);
             }
        });
    }
}
