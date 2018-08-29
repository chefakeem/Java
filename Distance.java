//***************************************************************
//File Name: Distance.java
//Student Name: Akeem Wilkins
//Purpose: Computes the distances between two points
//***************************************************************
import java.util.Scanner;
public class Distance
{
  public static void main (String[]args)
      {
        double x1, y1, x2, y2; //coordinates of two points
        double distance; // distance between the points
        double quantity; //declare quanity
        
        Scanner scan = new Scanner(System.in);
        
        //Read in the two points
        System.out.print("Enter the coordinates of the first point " + "(put a space between them):");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print("Enter the coordinates of the second point:");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        //Compute the Distance
        quantity = Math.pow((x1-x2),2)+Math.pow((y1-y2),2); //this formula computes the quanity
        distance = Math.sqrt(quantity);//this is the formula code to compute the distance
        
        //Print ou the answer
        System.out.println(distance);
      }     
 } 
 
 //*********************************************
 //Output Compile Message:
 //Enter the coordinates of the first point (put a space between them): 3 17
 //Enter the coordinates of the second point: 8 10
 //8.602325267042627
 //