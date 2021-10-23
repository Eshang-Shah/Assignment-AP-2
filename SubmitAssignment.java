package com.company;

import java.util.ArrayList;

public class SubmitAssignment {
    public static ArrayList<SubmitAssignment> submitAssignmentArrayList = new ArrayList<>();

    public static ArrayList<Integer> gradesGivenAssignment = new ArrayList<>();

    private int submitionID;
    private String assignmentFileName;
    private Student studentid;

    public int getSubmitionID(){
        return this.submitionID;
    }
    public Student getStudentid(){
        return this.studentid;
    }
    public String getfilename(){
        return this.assignmentFileName;
    }


    SubmitAssignment(int submitionID, String assignmentFileName,Student studentid){
        this.assignmentFileName=assignmentFileName;
        this.studentid=studentid;
        this.submitionID=submitionID;
        submitAssignmentArrayList.add(this);

    }

}
