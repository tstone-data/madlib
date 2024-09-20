package test;

import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {	
		// Initializes variables as empty strings
		Scanner scan = new Scanner(System.in);
		String noun1 = "";
		String noun2 = "";
		String adjective1 = "";
		String adjective2 = "";
		String verb1 = "";
		String adverb1 = "";
		
		System.out.println("Let's create a custom MadLib.");
		// Asks users for input and stores input in respective strings
		System.out.println("Enter an adjective: ");
		adjective1 = scan.next();
		System.out.println("Enter a noun: ");
		noun1 = scan.next();
		System.out.println("Enter a verb: ");
		verb1 = scan.next();
		System.out.println("Enter an adverb: ");
		adverb1 = scan.next();
		System.out.println("Enter another adjective: ");
		adjective2 = scan.next();
		System.out.println("Enter another noun: ");
		noun2 = scan.next();
		// Outputs MadLib story using the appropriate user input
		System.out.println("Here is your custom MadLib:");
		System.out.print("Once upon a time there was a " + adjective1 + " " + noun1);
		System.out.print(" who really enjoyed to " + verb1 + " " + adverb1);
		System.out.print(" with their " + adjective2 + " " + noun2 + ".");
		scan.close();
	}
}
