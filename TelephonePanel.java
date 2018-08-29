//*******************************************************************************************
// File Name: TelephonePanel.java
// Name: Akeem Wilkins
// Purpose: 1) Lays out a (functionless) GUI like a telephone keypad witha title, and 
//          2) Illustrates use of BorderLayout and GridLayout.
//*******************************************************************************************

import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel
{
   public TelephonePanel()
   {
      //set BorderLayout for this panel
      setLayout(new BorderLayout());
      
      //create a JLabel with "Your Telephone" title
      JLabel title = new JLabel("Your Telephone");
      
      //add title label to north of this panel
      add(title, BorderLayout.NORTH);
 
      //create panel to hold keypad and give it a 4x3 GridLayout
      GridLayout layout = new GridLayout(4, 3);
         
      //add buttons representing keys to key panel
      JPanel p1 = new JPanel(layout);
      
      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");
      JButton b10 = new JButton("*");
      JButton b11 = new JButton("0");
      JButton b12 = new JButton("#");
      
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
      p1.add(b4);
      p1.add(b5);
      p1.add(b6);
      p1.add(b7);
      p1.add(b8);
      p1.add(b9);
      p1.add(b10);
      p1.add(b11);
      p1.add(b12);
      
      //add key panel to center of this panel
      add(p1, BorderLayout.CENTER);
   }
}