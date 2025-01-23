//Write a java program to check given number is perfect number or not
package Loops;

//Import the scanner class to read input
import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args) {
		//Create scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		//Take user input
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		//Create loop from 1 to the number 
		for(int i=1; i<=n/2; i++) {
			//Check whether number is divisor of the number
			if(n%i==0)
				sum = sum+i;//Calculate the sum of factors
		}
		//Check if the number is equal to the calculated sum, it is a perfect number
		if(sum==n)
			System.out.println("Perfect Number");
		//If above condition doesn't match then, its not perfect number 
		else
			System.out.println("Not a Perfect Number");
		
		//Close scanner
		sc.close();
	}

}

/*
 OUTPUT:
 Enter a number: 
 28
 Perfect Number
*/