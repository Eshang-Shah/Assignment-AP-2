# BACKPACK: IIITD's Custom Learning Management System (LMS)

## Background
Ever since the arrival of Google Classroom (GC), it has been the go-to Learning Management System (LMS) for IIITD. LMS is the backbone of how teaching is delivered at IIITD. For quite some time now, it has been observed that IIITD should have its very own LMS, and the institute administration has named the project **"BACKPACK"**.

You have been contacted by **BYLD**, the developer group at IIITD, to give your inputs on this project. They want you to use the knowledge of **Object-Oriented Programming (OOP)** that you have gathered from Assignment-1 along with interfaces and polymorphism to design a robust system that can support multiple roles. 

## Roles
The system will be used by the following roles:

- **Instructors**: A single course can have multiple instructors, like Google Classroom.
- **Students**: Students will interact with the course materials and assessments.

For now, you are supposed to design a single course page that has users for the roles mentioned above and show BYLD a working command-line simulation.

## Features for INSTRUCTORS:
1. **Lecture Material Management**:
   - An instructor can upload and view lecture materials. Lecture materials can be of two types:
     - **Lecture Videos**: A filename with the extension `.mp4`.
     - **Lecture Slides**: An array of strings representing the content of the slides.

2. **Assessment Management**:
   - An instructor can upload and grade assessments. The assessments can be of two types:
     - **Assignments**: A problem statement describing the assignment.
     - **Quizzes**: A single question requiring a one-word answer.
   - While uploading an assignment, the instructor will specify the maximum marks for that assignment. This will be used when grading submissions. 
   - For quizzes, the maximum marks are **1** by default.
   
3. **Assessment Closure**:
   - An instructor can close an assessment after which no further submissions will be accepted.

## Features for STUDENTS:
1. **Lecture Material Access**:
   - A student can view the uploaded lecture material.

2. **Assessment Participation**:
   - A student can view assessments and upload submissions that will be graded by the instructor. The format of submissions will be:
     - **Assignments**: A filename with the extension `.zip` (e.g., `sample_submission.zip`).
     - **Quiz**: A one-word solution to the question.

3. **Grading and Marks**:
   - Students can check if their submission has been graded and view the marks they have received.

## COMMON FUNCTIONS: Discussion Forum
Discussions in forums are an important part of any active learning environment. Therefore, everyone (instructors and students) should be allowed to add comments to a course discussion forum.

- **Commenting**: Both instructors and students can add comments to the discussion forum.
- **Viewing Comments**: Comments should display the name of the member who added them and the timestamp of the comment.

Unlike Google Classroom where comments are added to specific assessments and lecture materials, **BYLD** wants you to create a simple discussion forum for the course.

## Simulation
To simulate this assignment:
- Create a **dummy course** with dummy accounts for both instructors and students.
- You should be able to **log out** of one user and **log in as another user**.
  - When logged in as an instructor, you should be able to use the system from the perspective of an instructor.
  - When logged in as a student, you should be able to perform functions required by a student.


