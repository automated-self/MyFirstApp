package com.example.myfirstapp.models_java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OSActivity {

    @SerializedName("_id")
    @Expose
    private Id id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("time_end")
    @Expose
    private TimeEnd timeEnd;
    @SerializedName("time_start")
    @Expose
    private TimeStart timeStart;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimeEnd getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(TimeEnd timeEnd) {
        this.timeEnd = timeEnd;
    }

    public TimeStart getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(TimeStart timeStart) {
        this.timeStart = timeStart;
    }

}

