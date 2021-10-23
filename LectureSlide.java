package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class LectureSlide implements Materials {
    public static ArrayList<LectureSlide> lectureSlidesArrayList = new ArrayList<>();
    private String slideTopic;
    private int slideNumber=0;
    private Instructor Proff;
    private ArrayList<String> slideContentArrayList = new ArrayList<>();

    LectureSlide(){
    }

    LectureSlide(String slideTopic, int slideNumber, Instructor Proff){
        this.Proff=Proff;
        this.slideNumber=slideNumber;
        this.slideTopic=slideTopic;
        lectureSlidesArrayList.add(this);
    }

    public ArrayList<String> getSlideContentArrayList() {
        return this.slideContentArrayList;
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
        System.out.println("Topic of Slides: "+this.slideTopic);
        int checker=1;
        for (int x =0; x<this.getSlideContentArrayList().size(); x++){
            System.out.println("Slide " +checker+ " : "+getSlideContentArrayList().get(x));
            checker++;
        }
        System.out.println("No of slides: "+this.slideNumber);
        System.out.println("Date of upload: "+this.addMaterial());
        System.out.println("Uploaded by: "+this.Proff.getInstID());

    }
}
