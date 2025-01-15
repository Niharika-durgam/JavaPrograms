//Write java program to check  candidate eligible for voting or not
package javaprograms;

//Import the scanner class to read input
import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		//Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		//User input
		System.out.print("Enter your age : ");
		int age=scanner.nextInt();
		
		//Check age to determine voting eligibility
		//If age is  greater than 18 
		if (age >= 18) {
			System.out.println("You are eligible for voting.");
			System.out.println("Congratulations..");
		}
		//If age is less than 18 
		else{
			System.out.println("You are not eligible for voting.");
			System.out.println("Better Luck Next Time..");
		}
		
		scanner.close();
	}

}

/*
OUTPUT
Enter your age : 20
You are eligible for voting.
Congratulations..
*/