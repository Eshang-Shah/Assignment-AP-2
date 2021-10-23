package com.company;

import java.util.ArrayList;

public class Quiz extends Assesment {
    private String question;
    private int idQuiz;
    Instructor proff;

    public static ArrayList<Quiz> quizArrayList =new ArrayList<>();

    Quiz(String question, Instructor proff){
        this.question=question;
        this.proff=proff;
        this.idQuiz=id;
        id++;
        quizArrayList.add(this);

    }

    public int getIdQuiz() {
        return this.idQuiz;
    }

    public String getQuestion() {
        return this.question;
    }

    @Override
    public void viewAssesment() {
            System.out.println("ID: "+this.idQuiz + " Quiz: " + this.question);
            System.out.println("--------------------------------------------------------------------");

    }
}
