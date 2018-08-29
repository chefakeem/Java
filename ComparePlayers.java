//*******************************************************
//File name: ComparePlayers.java
//Name: Akeem Wilkins
//Purpose: Use Account class to create and manage Sally 
//and Joe's bank accounts
//*******************************************************

import java.util.Scanner;

public class ComparePlayers
{
   public static void main(String[] args)
   {
      Player player1 = new Player();
      Player player2 = new Player();
      
      Scanner scan = new Scanner(System.in);
      
      //Prompt for and read in information for player 1
      player1.readPlayer();
      
      //Prompt for and read in information for player 2
      player2.readPlayer();
      
      //Compare player1 to player 2 and print a message saying
      //whether they are equal
      if (player1 == player2)
          System.out.println("Same Player");
            else
               System.out.println("Different Player");
    }
}
