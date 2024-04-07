Title: Student Database Management System

Description:

This Java program implements a simple Student Database Management System (DBMS) using HashMap to store student information. It allows users to perform operations like adding a new student, viewing all students, searching for a specific student by roll number, calculating the average marks of all students, and exiting the program.



Features:

Add, View, and Search: Easily add, view, and search student records by roll number.
Average Marks Calculation: Quickly calculate the average marks of all students in the database.
User-friendly Interface: Intuitive menu-driven interface for seamless interaction.
Error Handling: Implemented error handling for smooth execution.
Usage:

Add: Add new students with details like name, roll number, age, and marks.
View: Display a list of all students along with their details.
Search: Find specific students by their roll number.
Calculate: Compute the average marks of all students.
Exit: Terminate the program.



Usage:

1. Compile the program:
    javac student.java

2. Run the program:
    java student

User Interface:

The program provides the following options to the user:
1. Add student
2. View student
3. Search student
4. Calculate Average Marks
5. Exit


Documentation for each option:

1. Add student:
    - Prompts the user to enter the student's name, roll number, age, and marks.
    - Creates a new Student object with the entered details and adds it to the database HashMap.


2. View student:
    - Displays the list of all students along with their details (name, roll number, age, and marks).


3. Search student:
    - Prompts the user to enter a roll number.
    - Searches for the student with the specified roll number in the database.
    - If found, displays the details of the student; otherwise, prints "Student Not Found".


4. Calculate Average Marks:
    - Calculates the average marks of all the students in the database.
    - Prints the average marks.


5. Exit:
    - Exits the program.


Note: 
- The program continuously prompts the user for input until the user chooses to exit.
- Error handling is implemented to catch any exceptions that may occur during execution and display an error message.


Example:
Suppose you want to add a new student named John with roll number 101, age 20, and marks 85. You would select option 1, enter the details as prompted, and the student will be added to the database. You can then view all students using option 2, search for a specific student using option 3, calculate the average marks of all students using option 4, or exit the program using option 5.



Student Database Management System (DBMS)


