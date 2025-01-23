//Write a program to check given number is prime number or not
package Loops;

//Import the scanner class to read input
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		//Create scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		//Take user input
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int flag=0;
		//If number is equal to 0,1 are not prime
		if(n==0||n==1) {
			System.out.println(n+ "is not a Prime Number");
		}
		else {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					System.out.println(n+ "is not a Prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+ "is a Prime Number");
			}
		}
		
		//Scanner close
		sc.close();
	}

}

/*
 OUTPUT:
 Enter a number: 
 11
 11is a Prime Number
 */
