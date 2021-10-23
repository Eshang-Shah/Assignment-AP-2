package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class InstructorComment {
    public static ArrayList<InstructorComment> proffesorCommentArrayList = new ArrayList<>();
    private String instructorAddComments;
    private String profDateTime;
    Instructor Proff;
    InstructorComment(String instructorAddComments,Instructor Proff){
        this.instructorAddComments=instructorAddComments;
        this.Proff=Proff;
        proffesorCommentArrayList.add(this);
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        this.profDateTime=IST;

    }

    public String getProfDateTime() {
        return this.profDateTime;
    }

    public String getInstructorAddComments(){
        return this.instructorAddComments;
    }

}
