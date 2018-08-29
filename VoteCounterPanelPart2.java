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
   
   private JLabel winnerLabel;
   
   //-----------------------------
   //Constructor: Sets up the GUI.
   //-----------------------------
   public VoteCounterPanel()
   {
   
      //initialize counts
      votesForJoe = 0;
      votesForSam = 0;
      
      VoteButtonListener voteListener = new VoteButtonListener();
      
      joe = new JButton("Vote for Joe");
      joe.addActionListener(voteListener);
      joe.addActionListener(new JoeButtonListener());
      
      sam = new JButton("Vote for Sam");
      sam.addActionListener(voteListener);
      sam.addActionListener(new SamButtonListener());
      
      labelJoe = new JLabel("Votes for Joe: " +votesForJoe);
      labelSam = new JLabel("Votes for Sam: " +votesForSam);
      
      winnerLabel = new JLabel("--");
      
      add(joe);
      add(labelJoe);
      
      add(sam);
      add(labelSam);
      
      add(winnerLabel);
      
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
 
 //******************************************************
 //Represents a listener for button push (action) events.
 //******************************************************
 private class VoteButtonListener implements ActionListener
 {
   public void actionPerformed(ActionEvent event)
   {
      if(event.getSource()==joe)
      {
         votesForJoe++;
         labelJoe.setText("Votes for Joe:" + votesForJoe);
       }
       else
       {
         votesForSam++;
         labelSam.setText("Votes for Joe:" + votesForSam);
       }
       
       if(votesForJoe>votesForSam)
         winnerLabel.setText("Joeis ahead in the votes count!!");
       else if (votesForJoe<votesForSam)
         winnerLabel.setText("Sam is ahead in the vote cont!!");
       else
         winnerLabel.setText("Joe and Sam are tied!!");
       }
  }       
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