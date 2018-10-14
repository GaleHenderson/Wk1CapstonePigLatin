package Wk1CapstonePigLatinTranslator;

import java.util.Scanner;

public class PigLatinTestWk1CapstoneFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String engWord;
		String userCont = "y";
		String userName;
		
		// Opens a new scanner
		Scanner scan = new Scanner(System.in);
		
		//takes user input
		System.out.println("Please share your name with us: ");
		userName = scan.nextLine();
		
		while (userCont.equalsIgnoreCase("y")) {
			System.out.println(userName + ", please enter the word(s) you would like to translate: ");
			engWord = scan.nextLine();
			// this is the output the user will receive upon submitting an English word.
			System.out.print(userName + ", " + engWord + " translates to ");
			pigTranslate(engWord);
			System.out.println(" in Pig Latin.");
			
			// Asking user would he/she like to translate another word
			System.out.println("Would you like to continue translating? Enter Y for yes. Otherwise, press any other key.");
			userCont = scan.nextLine();
		}
		
		// This will run if the user selects an answer other than Y to whether they
				// wanted to continue
				System.out.println(
						"Ankthay ouyay orfay isitingvay Inesylvaniasway! Eway opehay ouyay ikedlay ethay anguagelay anslatortray.");
				System.out.println("(Thank you for visiting Swinesylvania! We hope you liked the language translator.)");
				System.out.println(" ");
				System.out.println("Easeplay, isitvay oonsay! Oodbyegay.");
				System.out.println("(Please, visit soon! Goodbye.)");
		
scan.close();		
	}
// METHOD GOES HERE
	public static void pigTranslate(String engWord) {
        final String allVowels = "AEIOUaeiou";
        String beforeVowel = "";
        String translatedWord;
        int slice;//slice as in slice the part that we will append later
        String [] wordArray = engWord.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            for (slice = 0; slice < wordArray[i].length() && !allVowels.contains("" + wordArray[i].charAt(slice)); slice++) {
             beforeVowel += wordArray[i].charAt(slice);
           }
        if (slice == 0) {
            translatedWord = wordArray[i] + "way "; 
        }
        else {
        translatedWord = ((wordArray[i].substring(slice)) + beforeVowel + "ay" + " ");
        }
        System.out.print(translatedWord);
        beforeVowel = "";
    }     
	}
}
