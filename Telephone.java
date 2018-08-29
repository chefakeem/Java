//*******************************************************
//File name: Telephone.java
//Name: Akeem Wilkins
//Purpose: Use Account class to create and manage Sally 
//and Joe's bank accounts
//*******************************************************

import javax.swing.*;
public class Telephone
{
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Telephone");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new TelephonePanel());frame.pack();
         frame.setVisible(true);
      }
}