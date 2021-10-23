package com.company;

import java.util.ArrayList;

public class SubmitQuiz {
    public static ArrayList<SubmitQuiz> submitQuizArrayList = new ArrayList<>();
    public static ArrayList<Integer> gradesGivenQuiz = new ArrayList<>();
    private String quizAnswers;
    private Student studentid;
    private int submitionID;
    public int getSubmitionID(){
        return this.submitionID;
    }
    public Student getStudentid(){
        return this.studentid;
    }
    public String getQuizAnswers(){
        return this.quizAnswers;
    }

    SubmitQuiz(int submitionID,String quizAnswers,Student studentid){
        this.quizAnswers=quizAnswers;
        this.studentid=studentid;
        this.submitionID=submitionID;
        submitQuizArrayList.add(this);
    }
}
