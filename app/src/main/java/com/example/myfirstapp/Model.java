package com.example.myfirstapp;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

class Model implements MainPresenterModelInterface {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    public void logActivity(String activity_name) {
         Bundle params = new Bundle();
         params.putString("activity", activity_name);
         params.putString("userID", "Cory&Chris");

         // this will crash!!!
         mFirebaseAnalytics.logEvent("test_event", params);
    }
}
