package com.company;

import java.util.ArrayList;

public class Student implements People {
    public static ArrayList<Student> studentArrayList = new ArrayList<>();
    public ArrayList<Integer> addingCompletedAssesments = new ArrayList<>();
    public ArrayList<Integer> addingCompletedQuiz = new ArrayList<Integer>();
    private String stdID;
    Student(String stdID){
        this.stdID=stdID;
        studentArrayList.add(this);
    }

    public String getStdID(){
        return this.stdID;
    }
    public void view(){
        for (int j =0; j< Assignment.assignmentArrayList.size(); j++){
            if (!this.addingCompletedAssesments.contains(Assignment.assignmentArrayList.get(j).getIdAssignment())) {
                System.out.println("-----------------------------------------------------------------");
                Assignment.assignmentArrayList.get(j).viewAssesment();
                System.out.println("-----------------------------------------------------------------");
            }
        }
        for (int k = 0; k<Quiz.quizArrayList.size(); k++) {
            if (!this.addingCompletedQuiz.contains(Quiz.quizArrayList.get(k).getIdQuiz())) {
                Quiz.quizArrayList.get(k).viewAssesment();
            }
        }
    }

    @Override
    public void printsMenu() {
        System.out.println("---Student Menu---");
        System.out.println("1. View lecture materials\n" +
                "2. View assessments\n" +
                "3. Submit assessment\n" +
                "4. View grades\n" +
                "5. View comments\n" +
                "6. Add comments\n" +
                "7. Logout ");
    }

    @Override
    public void printsId() {
        System.out.println("Students:\n" +
                "0 - S0\n" +
                "1 - S1\n" +
                "2 - S2");
    }
}
