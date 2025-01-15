package javaprograms;

//Import the scanner class to read input
import java.util.Scanner;

public class Sqperimeter {

	public static void main(String[] args) {
		//Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		//User Input for side of a square
		System.out.println("Enter the side of a square : ");
		int side = sc.nextInt();
		
		//Calculate the perimeter
		int perimeter = 4 * side;
		//Print perimeter of square
		System.out.println("Perimeter of Square : "+perimeter);
		
		//Scanner close
		sc.close();

	}

}

/*
 OUTPUT:
 Enter the side of a square : 
4
Perimeter of Square : 16

 */
