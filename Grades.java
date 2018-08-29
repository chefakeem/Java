//***********************************************************************************
//File Name: Grades.java
//Student Name: Akeem Wilkins
//Purpose:Use student class to get test grades for two students and compute averages.
//***********************************************************************************
public class Grades
{
      public static void main(String[]args)
      {
            //this is displaying student 1 and student 2 and there names. 
            Student student1 = new Student("Mary");
            Student student2 = new Student("Mike");
            
            //input grades for Mary
            student1.inputGrades();
           
            //input grades for Mike
            student2.inputGrades();
            
            //print average for Mary
            System.out.println("Student 1: " + student1);
            System.out.println("Average: " + student1.getAverage());
             
            //print average for Mike
            System.out.println("Student 2: " + student2);
            System.out.println("Average: " + student2.getAverage());
            }
}