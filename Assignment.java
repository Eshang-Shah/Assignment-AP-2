package com.company;

import java.util.ArrayList;

public class Assignment extends Assesment {
    public static ArrayList<Assignment> assignmentArrayList = new ArrayList<>();
    private String problemStatement;
    private int maxMarks;
    private int idAssignment;
    private int givenMarks;
    Instructor proff;
    Assignment(String problemStatement,int maxMarks, Instructor proff){
        this.problemStatement=problemStatement;
        this.maxMarks=maxMarks;
        this.proff=proff;
        this.idAssignment=id;
        id++;
        assignmentArrayList.add(this);
    }

    public int getGivenMarks() {
        return givenMarks;
    }
    public int setGivenMarks(int givenMarks){
        return this.givenMarks=givenMarks;
    }

    public int getIdAssignment() {
        return this.idAssignment;
    }

    public String getProblemStatement(){
        return this.problemStatement;
    }
    public int getMaxMarks(){
        return this.maxMarks;
    }
    Assignment(){

    }
    @Override
    public void viewAssesment() {

            System.out.println("ID: "+this.idAssignment + " Assignment: " + this.problemStatement+"Maximum Marks: "+this.maxMarks);
    }

}
