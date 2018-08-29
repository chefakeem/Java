//***************************************************************************************
//File Name: Student.java
// Student Name: Akeem Wilkins
//Purpose: Define a student class that stores name, score on test 1, and score on test 2.
//Methods prompt for and read in grades, compute the average, 
//and return a string containing student's info.
//***************************************************************************************
import java.util.Scanner;

public class Student
{
      //delcare instance data
      private String Name;
      int test1;
      int test2;
      double average;
      
      Scanner scan = new Scanner(System.in);
      
      //constructor
      Student ()
      {
         Name =  "No Name Given";
         test1 = 0;
         test2 = 0;
      }
      //this method allows student Name to be passed
      public Student (String studentName)
      {
         Name = studentName;
      }
      
      public void inputGrades()
      {
      //both scan.next is asking the user to input both grades for the test of the student. 
          System.out.print("Please input the test 1 Grades for " + Name + " :");
          test1 = scan.nextInt();
          
          System.out.print("Please input the test 2 Grades for " + Name + " :");

          test2 = scan.nextInt();   
      }
      
      //this method computes the average of both test grades. 
      public double getAverage()
      {
         average = (double)((test1 + test2) / 2);
         return average;
      }
      
      //this toString method is use to return student name and both test grades. 
      public String toString()
      {
         return "Name of the Student:" + Name + "\tTest 1: " + test1 + "\tTest 2: " + test2;
      }
      
      //this method is made to print out the student Name
      public void printName()
      {
         System.out.println("Student Name:" + Name);
         //add body of printName
      }       
 }