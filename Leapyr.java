//Write a program to check leap year using if else. How to check whether a given year is a leap year or not.
package javaprograms;

//Import the scanner class to read input
import java.util.Scanner;

public class Leapyr { 

	public static void main(String[] args) {
		//Create Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		//User Input
		System.out.println("Enter year: ");
		int year=scanner.nextInt();
		//Check if the year is divisible by 400
		if (year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		}
		// Check if the year is divisible by 100 but not by 400 (not a leap year)
		else if (year % 100 == 0) {
			System.out.println(year + " is not a leap year.");
		} 
		// Check if the year is divisible by 4 but not by 100 (leap year condition)
		else if (year % 4 == 0) {
			System.out.println(year + " is a leap year.");
		} 
		// If none of the above conditions are true, it's not a leap year
		else {
			System.out.println(year + " is not a leap year.");
		}

		scanner.close();
	}

}

/*
OUTPUT:
Enter year: 
1997
1997 is not a leap year.
*/