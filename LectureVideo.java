package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class LectureVideo implements Materials{
    public static ArrayList<LectureVideo> lectureVideoArrayList = new ArrayList<>();
    private String videoTopic;
    private String videoName;
    private Instructor Proff;
    LectureVideo(String videoTopic, String videoName, Instructor Proff){
        this.videoTopic=videoTopic;
        this.videoName=videoName;
        this.Proff=Proff;
        lectureVideoArrayList.add(this);
    }

    @Override
    public String addMaterial() {
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        return IST;
    }

    @Override
    public void viewMaterial() {
        System.out.println("Topic of Slides: "+this.videoTopic);
        System.out.println("Name of File: "+ this.videoName);
        System.out.println("Date of upload: "+this.addMaterial());
        System.out.println("Uploaded by: "+this.Proff.getInstID());

    }
}
