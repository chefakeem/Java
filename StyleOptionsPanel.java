//***************************************************************************************
//File Name: StyelOptionsPanel.java
// Student Name: Akeem Wilkins
//Purpose: Demonstrates the use of check boxes.
//***************************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
   private final int WIDTH = 300;
   private final int HEIGHT = 100;
   
   private int fontSize = 36;
   private int style = Font.PLAIN;
   private JLabel saying;
   private JCheckBox bold, italic;
   private JPanel primary;
   private JRadioButton small, medium, large;
   
   //---------------------------------------
   //Set up a panel with a label and some check boxes that
   //control the style of the label's font. 
   //--------------------------------------
   public StyleOptionsPanel()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font("Helvetica", style, fontSize));
      
      bold = new JCheckBox("Bold");
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);
      
      SytleListener listener = new SytleListener();
      bold.addItemListener(listener);
      italic.addItemListener(listener);
      
      small = new JRadioButton("Small Font");
      small.setBackground(Color.cyan);
      medium = new JRadioButton("Meidum Font");
      medium.setBackground (Color.cyan);
      large = new JRadioButton("Large Font", true);
      large.setBackground(Color.cyan);
      
      ButtonGroup group = new ButtonGroup();
      group.add(small);
      group.add(medium);
      group.add(large);
      
      SizeListener listenSize = new SizeListener();
      small.addActionListener(listenSize);
      medium.addActionListener(listenSize);
      large.addActionListener(listenSize);
      
      add(saying);
      add(bold);
      add(italic);
      add(small);
      add(medium);
      add(large);
      setBackground (Color.cyan);
      setPreferredSize (new Dimension(WIDTH, HEIGHT));
 }
 
 //*****************************************************
 //Represent the listener for both bheck boxes.
 //*****************************************************
 private class SytleListener implements ItemListener
 {
      //-----------------------------
      //Updates the style of the label front style.
      //-----------------------------
      public void itemStateChanged(ItemEvent event)
      {
            style = Font.PLAIN;
            
            if (bold.isSelected())
                  style = Font.BOLD;
                  
            if(italic.isSelected())
                  style += Font.ITALIC;
                  
            saying.setFont (new Font("Helvetica", style, fontSize));
      }
}

//***************************************************************
//Represent the listener for the radio buttons.
//************************************************************
private class SizeListener implements ActionListener
{
      //---------------------------------
      //Set the font size depending on which radio button
      //was selected.
      //--------------------------------
      public void actionPerformed (ActionEvent event)
      {
            Object source = event.getSource();
            
            if(source ==small)
                  fontSize = 12;
            else if(source == medium)
                  fontSize = 24;
            else
                  fontSize = 36;
            saying.setFont(new Font("Helvetica", style,fontSize));
          }
      }
      
}
      
