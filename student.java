import java.util.Scanner;
import java.util.HashMap;

    class Student{
        public String name;
        public int rollNo;
        public int age;
        public int marks;
        
        public Student(String name, int rollNo, int age, int marks){
            this.name=name;
            this.rollNo=rollNo;
            this.age=age;
            this.marks=marks;
        }
        public int display(){
            return rollNo;
        }
        public void viewStudent(){
            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+rollNo);
            System.out.println("Age: "+age);
            System.out.println("Marks: "+marks);
        }
    }
    
    

