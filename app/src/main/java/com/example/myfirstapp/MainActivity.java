package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    private MainViewPresenterInterface presenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 EditText activityEditTextView = (EditText)findViewById(R.id.activity_name);
                 presenter.logActivity(
                         activityEditTextView.getText().toString()
                 );
             }
        });
    }
}
