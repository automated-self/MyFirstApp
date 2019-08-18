package com.example.myfirstapp.models_java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeEnd {

    @SerializedName("$date")
    @Expose
    private Integer $date;

    public Integer get$date() {
        return $date;
    }

    public void set$date(Integer $date) {
        this.$date = $date;
    }

}