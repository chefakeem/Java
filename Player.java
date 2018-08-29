//*******************************************************
//File name: Player.java
//Name: Akeem Wilkins
//Purpose: Use Account class to create and manage Sally 
//and Joe's bank accounts
//*******************************************************

import java.util.Scanner;

public class Player
{
   private String name;
   private String team;
   private int jerseyNumber;
   
   
   //-------------------------------------------------
   //Prompts fro and reads in the player's name, team, and
   //jersey number.
   //-------------------------------------------------
   
   public void readPlayer()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Name:");
      name = scan.next();
      System.out.print("Team:");
      team = scan.nextLine();
      System.out.print("Jersey number:");
      jerseyNumber = scan.nextInt();
   }
}