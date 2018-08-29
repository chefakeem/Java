//***************************************************************
//File Name: PlusTest.java
//Student Name: Akeem Wilkins
//Purpose: Demonstrate the different of the +operator
//***************************************************************

public class PlusTest
{
      //--------------------------------------
      //Main prints some expressions using the + operator
      //--------------------------------------
      public static void main (String[]args)
      {
         System.out.println();
         System.out.println("This is a long string that is the" + "concatenation of two shorter strings.");
         System.out.println("The first computer was invented about"+55+"years ago.");
         System.out.println("8 plus 5 is " +8+5); 
         System.out.println("8 plus 5 is "+(8+5));
         System.out.println(8+5+ " equals 8 plus 5.");// 13 equals 8 plus 5
      }     
 }  
 //***********************************************************
 //("8 plus 5 is " +8+5);the first string is outputed between the quotations 
 // followed by operand with a number followed by operand with a number which is the 85.
 //8 plus 5 is 85
 //
 //("8 plus 5 is "+(8+5));the output will print out the string between the quotations then
 // then followed by the mathematical operand between partenthesis which adds the 8 and 5 is 13.
 //8 plus 5 is 13
 //
 //(8+5+ " equals 8 plus 5."); the output of this print line will give the result of the mathematical
 //operand of 8+5+ which is 13 followed by string between the quotations equals 8 plus 5 is outputed.
 // 13 equals 8 plus 5
 