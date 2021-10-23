package com.company;

import java.util.ArrayList;

public class Instructor implements People{
    public static ArrayList<Instructor> instructorsArrayList = new ArrayList<>();
    private String instID;
    Instructor(String instID){
        this.instID= instID;
        instructorsArrayList.add(this);

    }
    public String getInstID(){
        return instID;
    }

    @Override
    public void printsMenu() {
        System.out.println("---INSTRUCTOR MENU---\n" +
                "1. Add class material\n" +
                "2. Add assessments\n" +
                "3. View lecture materials\n" +
                "4. View assessments\n" +
                "5. Grade assessments\n" +
                "6. Close assessment\n" +
                "7. View comments\n" +
                "8. Add comments\n" +
                "9. Logout");

    }

    @Override
    public void printsId() {
        System.out.println("Instructors:\n" +
                "0 - I0\n" +
                "1 - I1");

    }
}
