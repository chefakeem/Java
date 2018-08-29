//******************************************************************
//File name: RatePanel.java
//Your name: Akeem Wilkins
//Purpose: Panel for a program that converts different currencies to
//U.S. Dollars
//******************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class RatePanel extends JPanel
{
   private double[] rate;
   private String[] currencyName;
   private JLabel result;
   private JLabel dollarAmountLabel;
   private JTextField dollarAmount;
   private JComboBox currencyCombo;
   
   //---------------------------------------------------------
   //Sets up a panel to convert cost from one of 6 currencies
   //into U.S. Dollars. The panel contains a heading, a text
   //field for the cost of the item, a combo box for selecting
   //the currency, and a label to display the result
   //---------------------------------------------------------
   public RatePanel()
   {
      JLabel title = new JLabel("How much is that in dollars?")
      ;title.setAlignmentX(Component.CENTER_ALIGNMENT);
      title.setFont(new Font("Helvetica", Font.BOLD, 20));
      
          
      //Set up the arrays for the currency conversions
      currencyName = new String[] {"Select the currency.", "European Euro", "Canadian Dollar", "Japanese Yen", "Australian Dollar" , "Indian Rupee" , "Mexican Peso"};
      rate = new double[] {0.0, 1.2103, 0.7351, 0.0091, 0.6969, 0.0222, 0.0880};
      
      currencyCombo = new JComboBox(currencyName);
      currencyCombo.addActionListener(new ComboListener());
      
      result = new JLabel("------------");
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      add(title);
      add(Box.createRigidArea(new Dimension (0,20)));
      
      //Put input amount info on one panel
      JLabel dollarAmountLabel = new JLabel("Enter cost of item");
      dollarAmount = new JTextField(10);
      JPanel amt = new JPanel();
      amt.add(dollarAmountLabel);
      amt.add(dollarAmount);
      
      //Put currency info on another panel
      JLabel cHeading = new JLabel ("Select a currency: ");
      JPanel currency = new JPanel();
      currency.add(cHeading);
      currency.add(currencyCombo);
      
      //Add panels to main panel
      add(amt);
      add(currency);
      add(result);
   }
   
   //****************************************************
   //Represents an action listener for the combo box
   //****************************************************
   private class ComboListener implements ActionListener
   {
      //-----------------------------------------------
      //Determines which currency has been selected and
      //the value in that currency then computes and
      //displays the value in U.S. Dollars
      //-----------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
         int index = currencyCombo.getSelectedIndex();
         DecimalFormat fmt = new DecimalFormat("#.00");
         
         int amt;
         try
         {
            amt = Integer.parseInt(dollarAmount.getText());
         }
         catch (Exception e)
         {
            amt = 1;
         }
         result.setText(amt + " " +currencyName[index]+ " = " +fmt.format(amt*rate[index]) + "U.S. Dollars");
       }
   }
     
}