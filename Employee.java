//Write a Java program to take Employee id,name,address & salary from user and display on to screen.

package javaprograms;

//Import the scanner class to read input
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		//Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		//User Input
		//Take details of Employee
		System.out.println("Enter the Employee id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Employee address : ");
		String address = sc.nextLine();
		System.out.println("Enter the Employee salary : ");
		int salary = sc.nextInt();
		
		//Print details provided by the user
		System.out.println("------Employee Details------");
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Salary : "+salary);
		
		//Close the scanner
		sc.close();
	}

}

/*
OUTPUT:
Enter the Employee id : 
101
Enter the Employee name : 
Niharika Durgam
Enter the Employee address : 
Solapur
Enter the Employee salary : 
50000
------Employee Details------
Employee ID : 101
Employee Name : Niharika Durgam
Employee Address : Solapur
Employee Salary : 50000
*/