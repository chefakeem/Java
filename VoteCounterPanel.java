//***********************************************************************************
//File Name: VoteCounterPanel.java
//Student Name: Akeem Wilkins
//Purpose:Demonstrate a graphical user interface and event listeners to tally votes
//for two candidates, Joe and Sam
//***********************************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
   private int votesForJoe;
   private JButton joe;
   private JLabel labelJoe;
   
   private int votesForSam;
   private JButton sam;
   private JLabel labelSam;
   
   
   //-----------------------------
   //Constructor: Sets up the GUI.
   //-----------------------------
   public VoteCounterPanel()
   {
      //initialize counts
      votesForJoe = 0;
      votesForSam = 0;
      
      joe = new JButton("Vote for Joe");
      joe.addActionListener(new JoeButtonListener());
      sam = new JButton("Vote for Sam");
      sam.addActionListener(new SamButtonListener());
      
      labelJoe = new JLabel("Votes for Joe: " +votesForJoe);
      labelSam = new JLabel("Votes for Sam: " +votesForSam);
      
      add(joe);
      add(labelJoe);
      
      add(sam);
      add(labelSam);
      
      setPreferredSize(new Dimension(300,80));
      setBackground(Color.cyan);
 }
 
 //***************************************************************
 //Represents a listener for votes for Joe
 //************************************************************
 private class JoeButtonListener implements ActionListener
 {
   //-------------------------------------------------
   //Updates the counter and label when Vote for Joe
   //button is pushed
   //-------------------------------------------------
   public void actionPerformed(ActionEvent event)
   {
      votesForJoe++;
      labelJoe.setText("Votes for Joe:" + votesForJoe);
   }
 }
 
 
 //****************************************************
 //Represents a listener for votes for Sam
 //*****************************************************
 private class SamButtonListener implements ActionListener
 {
 
   //-------------------------------------------------
   //Updates the counter and label when Vote for Sam
   //button is pushed
   //-------------------------------------------------
   public void actionPerformed(ActionEvent event)
   {
         votesForSam++;
         labelSam.setText("Votes for Sam:" + votesForSam);
   }
  }
}