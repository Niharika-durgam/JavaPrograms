/*Create a parent class called "Vehicle" with attributes such as brand, model, year, 
and a method called "drive". Create a child class called "Car" that inherits from 
Vehicle and has an additional attribute called "color" and a method called "honk". 
Create an object of the Car class and call both the "drive" and "honk" methods.*/

package PracticePrograms;
//Parent Class: Vehicle
class Vehicle {
	String brand;
	String model;
	int year;

	// Method: drive
	void drive() {
		System.out.println("Driving");
	}
}

//Child Class: Car
class Car extends Vehicle {
	String color;

	// Method: honk
	void honk() {
		System.out.println("Car is honking");
	}
}
//Main Class
public class Inheritance_Vehical {

	public static void main(String[] args) {
		// Create a Car object
		Car car = new Car();
		car.brand = "Toyota";
		car.model = "ABC";
		car.year = 2023;
		car.color = "red";

		// Call the methods
		car.drive();
		car.honk();
	}

}
/*OUTPUT
Driving
Car is honking*/



