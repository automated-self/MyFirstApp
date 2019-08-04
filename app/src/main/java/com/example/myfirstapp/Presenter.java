package com.example.myfirstapp;

class Presenter implements MainViewPresenterInterface {
    private MainPresenterModelInterface model = new Model();

    @Override
    public void logActivity(String activity_name) {
        model.logActivity(activity_name);
    }
}
