package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class StudentComment {
    public static ArrayList<StudentComment> studentCommentArrayList = new ArrayList<>();
    private String studentAddComment;
    private String dateAndTime;
    Student std;
    StudentComment(String studentAddComment, Student std){
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        this.dateAndTime=IST;
        this.studentAddComment=studentAddComment;
        this.std=std;
        studentCommentArrayList.add(this);
    }
    public String getDateAndTime(){
        return this.dateAndTime;
    }
    public String getStudentAddComment(){
        return this.studentAddComment;
    }

}
