package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Instructor I0 = new Instructor("I0");
        Instructor I1 = new Instructor("I1");
        Student S0 = new Student("S0");
        Student S1 = new Student("S1");
        Student S2 = new Student("S2");
        Instructor nullInstructor = null;
        Student nullStudent = null;
        Assignment ass = new Assignment();
        System.out.println("Welcome to Backpack\n" +
                "1. Enter as instructor\n" +
                "2. Enter as student\n" +
                "3. Exit");
        while (true) {
            int input;
            Scanner scn = new Scanner(System.in);
            input = Integer.parseInt(scn.nextLine());

            //instructor
            if (input==1) {
                I0.printsId();
                System.out.println("Choose ID:");
                int chooseInstructorId = Integer.parseInt(scn.nextLine());


                String printInstructor;
                if (chooseInstructorId == 0) {
                    nullInstructor = I0;

                } else if (chooseInstructorId == 1) {
                    nullInstructor = I1;

                } else {
                    System.out.println("Please enter a valid number");
                    continue;
                }

                while (true) {
                    nullInstructor.printsMenu();
                    int instructorMenu = Integer.parseInt(scn.nextLine());


                    //Add Class material
                    if (instructorMenu == 1) {
                        System.out.println("1. Add Lecture Slide\n" +
                                "2. Add Lecture Video");
                        int typeMaterial = Integer.parseInt(scn.nextLine());

                        // addLectureSlide
                        if (typeMaterial == 1) {
                            System.out.println("Enter topic of slide(s)");
                            String slideTopic = scn.nextLine();

                            System.out.println("Enter number of slide(s)");
                            int slideNumber = Integer.parseInt(scn.nextLine());
                            int z = 1;
                            LectureSlide addLectureSlide = new LectureSlide(slideTopic,slideNumber,nullInstructor);
                            for (int a = 0; a < slideNumber; a++) {
                                System.out.println("Content of slide " + z + ": ");
                                z++;
                                String slideContent = scn.nextLine();
                                addLectureSlide.getSlideContentArrayList().add(slideContent);
                            }
                            System.out.println("Welcone " + nullInstructor.getInstID());
                        }
                        // addLectureVideo
                        else if (typeMaterial == 2) {
                            System.out.println("Enter topic of video: ");
                            String videoTopic = scn.nextLine();
                            System.out.println("Enter filename of video: ");
                            String fileName = scn.nextLine();

                            StringBuilder reverseFileName = new StringBuilder(fileName);
                            reverseFileName.reverse();
                            if (reverseFileName.substring(0, 4).equals("4pm.")) {
                                LectureVideo addLectureVideo = new LectureVideo(videoTopic,fileName,nullInstructor);

                            }
                            else {
                                System.out.println("It should be a mp4 file");
                            }
                        }
                        else {
                            System.out.println("Please enter valid number");
                        }
                    }
                    //addAssesment
                    else if (instructorMenu == 2) {
                        System.out.println("1. Add Assignment\n" +
                                "2. Add Quiz");
                        int assignmentType = Integer.parseInt(scn.nextLine());

                        if (assignmentType==1){
                            System.out.print("Enter problem statement: ");
                            String problemStatement = scn.nextLine();
                            System.out.print("Enter Maximum Marks: ");
                            int maxMarks = Integer.parseInt(scn.nextLine());
                            Assignment assignment = new Assignment(problemStatement,maxMarks,nullInstructor);

                        }

                        if (assignmentType==2){
                            System.out.print("Enter the question: ");
                            String question = scn.nextLine();
                            Quiz quiz =new Quiz(question,nullInstructor);

                        }
                    }
                    //View lecture material
                    else if (instructorMenu == 3) {
                        for(int b=0; b<LectureSlide.lectureSlidesArrayList.size(); b++){
                            LectureSlide.lectureSlidesArrayList.get(b).viewMaterial();
                            System.out.println(" ");
                        }
                        for(int b=0; b<LectureVideo.lectureVideoArrayList.size(); b++){
                            LectureVideo.lectureVideoArrayList.get(b).viewMaterial();
                            System.out.println(" ");
                        }
                    }
                    //viewAssesments
                    else if (instructorMenu == 4) {
                        System.out.println("List of Assignment:- ");
                        for (int l = 0; l< Assignment.assignmentArrayList.size(); l++){
                            Assignment.assignmentArrayList.get(l).viewAssesment();
                        }
                        System.out.println("List of Quiz:- ");
                        for (int f = 0; f<Quiz.quizArrayList.size(); f++){
                            Quiz.quizArrayList.get(f).viewAssesment();
                        }
                        System.out.println("Welcome "+ nullInstructor.getInstID());
                    }
                    //gradeAssesment
                    else if (instructorMenu == 5){
                        System.out.println("List of Assignment: ");
                        for (int lm = 0; lm< Assignment.assignmentArrayList.size(); lm++){
                            Assignment.assignmentArrayList.get(lm).viewAssesment();
                        }
                        System.out.println("List of Quiz:- ");
                        for (int fk = 0; fk<Quiz.quizArrayList.size(); fk++){
                            Quiz.quizArrayList.get(fk).viewAssesment();
                        }
                        System.out.print("Enter ID to view submission: ");
                        int viewSubmisiionID = Integer.parseInt(scn.nextLine());
                        boolean checker =true;
                        for (int bl = 0; bl<SubmitAssignment.submitAssignmentArrayList.size(); bl++){
                            if(SubmitAssignment.submitAssignmentArrayList.get(bl).getSubmitionID()==viewSubmisiionID){
                                checker=false;
                                System.out.println(SubmitAssignment.submitAssignmentArrayList.get(bl).getStudentid().getStdID());
                            }
                        }
                        if(!checker){
                            System.out.println("Please enter student ID to be checked: ");
                            String idCheck = scn.nextLine();
                            System.out.println("Submission:- ");
                            System.out.println(SubmitAssignment.submitAssignmentArrayList.size());
                            for (int ul =0; ul<SubmitAssignment.submitAssignmentArrayList.size(); ul++){
                                if (idCheck.contentEquals(SubmitAssignment.submitAssignmentArrayList.get(ul).getStudentid().getStdID())) {
                                    System.out.println(SubmitAssignment.submitAssignmentArrayList.size());
                                                      System.out.println(Assignment.assignmentArrayList.size());
                                }
                            }
                            for (int abc =0; abc < Assignment.assignmentArrayList.size(); abc++){
                                System.out.println("Maximum Marks: " + Assignment.assignmentArrayList.get(abc).getMaxMarks());

                            }
                            System.out.print("Enter Marks received: ");
                            int marksGiven = Integer.parseInt(scn.nextLine());

                            ass.setGivenMarks(marksGiven);
                            System.out.println("Welcme "+ nullInstructor.getInstID());
                        }
                        boolean checker2 = true;
                        for (int al =0; al<SubmitQuiz.submitQuizArrayList.size(); al++){
                            if(SubmitQuiz.submitQuizArrayList.get(al).getSubmitionID()==viewSubmisiionID){
                                checker2=false;
                                System.out.println(SubmitQuiz.submitQuizArrayList.get(al).getStudentid().getStdID());
                            }
                        }
                        if (!checker2){
                            System.out.println("Please enter student ID to be checked: ");
                            String idCheck2 = scn.nextLine();
                            System.out.println("Submission:- ");
                            for (int uul =0; uul<SubmitQuiz.submitQuizArrayList.size(); uul++){
                                if (idCheck2.contentEquals(SubmitAssignment.submitAssignmentArrayList.get(uul).getStudentid().getStdID())) {
                                    System.out.println("Answer: " + SubmitQuiz.submitQuizArrayList.get(uul).getQuizAnswers());
                                }

                            }
                            System.out.print("Enter Marks recieved: ");
                            int marksGiven = Integer.parseInt(scn.nextLine());
                            Assignment assquiz = new Assignment();
                            assquiz.setGivenMarks(marksGiven);
                            System.out.println("Welcme "+ nullInstructor.getInstID());
                        }
                    }
                    //closeAssesment
                    else if (instructorMenu == 6) {
                        System.out.println("List of Assignment:- ");
                        for (int l = 0; l< Assignment.assignmentArrayList.size(); l++){
                            Assignment.assignmentArrayList.get(l).viewAssesment();
                        }
                        System.out.println("List of Quiz:- ");
                        for (int f = 0; f<Quiz.quizArrayList.size(); f++){
                            Quiz.quizArrayList.get(f).viewAssesment();
                        }
                        System.out.print("Setect the assignment/quiz to be closed");
                        int closeAssignment = Integer.parseInt(scn.nextLine());
                        for (int o =0; o<Assignment.assignmentArrayList.size(); o++) {
                            if (closeAssignment == Assignment.assignmentArrayList.get(o).getIdAssignment()) {
                                Assignment.assignmentArrayList.remove(o);
                            }

                        }
                        for (int y = 0; y<Quiz.quizArrayList.size(); y++) {
                            if (closeAssignment == Quiz.quizArrayList.get(y).getIdQuiz()) {
                                Quiz.quizArrayList.remove(y);
                            }


                        }
                    }
                    //viewComments
                    else if (instructorMenu == 7) {
                        for (int c = 0; c < InstructorComment.proffesorCommentArrayList.size(); c++){
                            System.out.println(InstructorComment.proffesorCommentArrayList.get(c).getInstructorAddComments() +" -- "+ nullInstructor.getInstID());
                            System.out.println(InstructorComment.proffesorCommentArrayList.get(c).getProfDateTime());
                        }
                        for (int u = 0; u < StudentComment.studentCommentArrayList.size(); u++){
                            System.out.println(StudentComment.studentCommentArrayList.get(u).getStudentAddComment() +" -- "+ nullStudent.getStdID());
                            System.out.println(StudentComment.studentCommentArrayList.get(u).getDateAndTime());
                        }

                    }
                    //addComments
                    else if (instructorMenu == 8) {
                        System.out.print("Enter Comment: ");
                        String inputComment = scn.nextLine();
                        InstructorComment instructorComment = new InstructorComment(inputComment,nullInstructor);

                    } else if (instructorMenu == 9) {
                        System.out.println(" ");
                        System.out.println("Loggig Out....");
                        System.out.println("");
                        System.out.println("Welcome to Backpack\n" +
                                "1. Enter as instructor\n" +
                                "2. Enter as student\n" +
                                "3. Exit");
                        break;

                    } else {
                        System.out.println("Please enter a valid menu number");

                    }

                }
            }

            //Student
            else if (input==2){
                S0.printsId();
                System.out.print("Choose ID:");
                int chooseStudentId = Integer.parseInt(scn.nextLine());

                if (chooseStudentId==0){
                    nullStudent=S0;
                }
                else if (chooseStudentId==1){
                    nullStudent=S1;
                }
                else if (chooseStudentId==2){
                    nullStudent=S2;
                }
                else {
                    System.out.println("Please enter a valid number");
                    continue;
                }

                while (true) {
                    nullStudent.printsMenu();
                    int studentMenu = Integer.parseInt(scn.nextLine());
                    if (studentMenu == 1) {
                        for (int b = 0; b < LectureSlide.lectureSlidesArrayList.size(); b++) {
                            LectureSlide.lectureSlidesArrayList.get(b).viewMaterial();
                            System.out.println(" ");
                        }
                        for (int b = 0; b < LectureVideo.lectureVideoArrayList.size(); b++) {
                            LectureVideo.lectureVideoArrayList.get(b).viewMaterial();
                            System.out.println(" ");
                        }
                    }

                    //viewAssesment
                    else if (studentMenu == 2) {

                        for (int j =0; j< Assignment.assignmentArrayList.size(); j++){
                            System.out.println("-----------------------------------------------------------------");
                            Assignment.assignmentArrayList.get(j).viewAssesment();
                            System.out.println("-----------------------------------------------------------------");
                        }
                        for (int k = 0; k<Quiz.quizArrayList.size(); k++){
                            Quiz.quizArrayList.get(k).viewAssesment();
                            System.out.println("--------------------------------------------------------------------");

                        }
                        System.out.println("Welcome "+ nullStudent.getStdID());

                    }
                    //submitAssesment
                    else if (studentMenu == 3) {
                        System.out.println("Pending Assignments and Quizzes");
                        SubmitAssignment eshang = null;
                        SubmitQuiz bully = null;
                        nullStudent.view();

                        System.out.print("Enter ID of assesment: ");

                        int submId= Integer.parseInt(scn.nextLine());

                        boolean checkForAssignment = true;
                        for (int q = 0; q <Assignment.assignmentArrayList.size(); q++){
                            if (Assignment.assignmentArrayList.get(q).getIdAssignment() == submId) {
                                System.out.println(Assignment.assignmentArrayList.get(q).getProblemStatement());
                                checkForAssignment=false;
                            }
                        }

                        if (!checkForAssignment){
                            System.out.print("Enter filename of assignment: ");
                            String submFileName = scn.nextLine();
                            StringBuilder reverseSubFileName = new StringBuilder(submFileName);
                            reverseSubFileName.reverse();
                            if (reverseSubFileName.length()<4){
                                System.out.println("Please enter valid");
                            }
                            else if (reverseSubFileName.substring(0, 4).equals("piz.")) {
                                eshang = new SubmitAssignment(submId, submFileName, nullStudent);
                                nullStudent.addingCompletedAssesments.add(submId);

                            }
                            else {
                                System.out.println("Please Enter a valid file");
                            }
                        }
                        boolean checkForQuizId = true;
                        for (int e = 0; e <Quiz.quizArrayList.size(); e++){
                            if (Quiz.quizArrayList.get(e).getIdQuiz() == submId){
                                System.out.println(Quiz.quizArrayList.get(e).getQuestion());
                                checkForQuizId=false;
                                break;
                            }
                        }
                        if (!checkForQuizId){
                            System.out.print("Your Answer:");
                            String quizAnswer = scn.nextLine();
                            bully = new SubmitQuiz(submId,quizAnswer,nullStudent);
                            nullStudent.addingCompletedQuiz.add(submId);

                        }
                    }
                    //viewGrades
                    else if (studentMenu == 4) {
                        for (int hy =0; hy<SubmitAssignment.submitAssignmentArrayList.size(); hy++){
                            if (nullStudent.getStdID().contentEquals(SubmitAssignment.submitAssignmentArrayList.get(hy).getStudentid().getStdID())) {
                                System.out.println("Graded submissions\n" +
                                        "Submission: " + SubmitAssignment.submitAssignmentArrayList.get(hy).getfilename() + "\n" +
                                        "Marks scored:" + ass.getGivenMarks() + "\n" +
                                        "Graded by:" + nullInstructor.getInstID());
                            }
                        }
                    }
                    else if (studentMenu == 5) {
                        for (int c = 0; c < InstructorComment.proffesorCommentArrayList.size(); c++){
                            System.out.println(InstructorComment.proffesorCommentArrayList.get(c).getInstructorAddComments() +" -- "+ nullInstructor.getInstID());
                            System.out.println(InstructorComment.proffesorCommentArrayList.get(c).getProfDateTime());
                        }
                        for (int u = 0; u < StudentComment.studentCommentArrayList.size(); u++){
                            System.out.println(StudentComment.studentCommentArrayList.get(u).getStudentAddComment() +" -- "+ nullStudent.getStdID());
                            System.out.println(StudentComment.studentCommentArrayList.get(u).getDateAndTime());
                        }
                    }
                    //addComments
                    else if (studentMenu == 6) {
                        System.out.print("Enter Comment: ");
                        String enterComment = scn.nextLine();
                        StudentComment stdComment = new StudentComment(enterComment,nullStudent);

                    }
                    else if (studentMenu == 7) {
                        System.out.println("Loggig Out....");
                        System.out.println("Welcome to Backpack\n" +
                                "1. Enter as instructor\n" +
                                "2. Enter as student\n" +
                                "3. Exit");
                        break;

                    }
                    else {
                        System.out.println("Please enter a valid menu number");
                    }
                }
            }

            //exit
            else if (input==3){
                System.out.println("Thank You for using Backpack!");
                break;
            }
            else {
                System.out.println("Please enter a valid Number");
                System.out.println("Welcome to Backpack\n" +
                        "1. Enter as instructor\n" +
                        "2. Enter as student\n" +
                        "3. Exit");
            }
        }

    }
}
