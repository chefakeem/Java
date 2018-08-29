//***************************************************************
//File Name: StringManips.java
//Student Name: Akeem Wilkins
//Purpose: Test several methods for manipulating String objects
//***************************************************************
import java.util.Scanner;

public class StringManips
{
      public static void main(String[]args)
      {
            String phrase = new String("This is a String test.");
            int phraseLength;       //number of characters in the pgrase Sring
            int middleIndex;        //index of the middle character in the String
            String firstHalf;       //first half of the phrase String
            String secondHalf;      //second half of the phrase String
            String switchedPhrase;  //a new phrase with original halves switched
            String city;            //declare city
            String state;           //delcare state
            
            
            String middle3;         //Question #1
            
            Scanner scan = new Scanner(System.in); //question #3
            
            //comput the length and middle index of the phrase
            phraseLength = phrase.length();
            middleIndex = phraseLength/2;
            
            //get the substring for each half of the phrase
            firstHalf = phrase.substring(0,middleIndex);
            secondHalf = phrase.substring(middleIndex, phraseLength);
            //Question#1
             middle3 = phrase.substring(middleIndex-1,middleIndex+2);
            
            //concatenate the FirstHalf at the end of the secondHalf
            switchedPhrase = secondHalf.concat(firstHalf);
            
            //question#2
            switchedPhrase = switchedPhrase.replace(' ', '*');
            
            //print information about the phrase
            System.out.println();
            System.out.println("Original phrase: "+ phrase);
            System.out.println("Length of the phrase:" + phraseLength + "characters");
            System.out.println("Index of the middle:" + middleIndex);
            System.out.println("Character at the middle index:" + phrase.charAt(middleIndex));
            System.out.println("Switched phrase:" + switchedPhrase);
            System.out.println("Index of the middle 3:" + middle3);
            System.out.println();
            
            //question #3
            System.out.println("Please Enter your home State (NO SPACES)");
            state = scan.nextLine();
            state = state.toUpperCase();
            
            System.out.println("Please Enter your home City/Town");
            city = scan.nextLine();
            city = city.toLowerCase();
            
            System.out.println(state  +  city  +  state);
            
            
     }
}
            