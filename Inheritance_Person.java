/*Create a parent class called "Person" with attributes such as name, age, and a 
method called "speak". Create a child class called "Student" that inherits from 
Person and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

package PracticePrograms;
//Parent Class: Person
class Person {
	String name;
	int age;

	// Method: speak
	void speak() {
		System.out.println(name + " says: Hello!");
	}
}
//Child Class: Student
class Student extends Person {
	String grade;

	// Method: study
	void study() {
		System.out.println("grade " + grade );
	}
}
public class Inheritance_Person {

	public static void main(String[] args) {
		// Create a Student object
		Student student = new Student();
		student.name = "ABC";
		student.age = 21;
		student.grade = "A";

		// Call the methods
		student.speak();
		student.study();

	}

}

/*OUTPUT
ABC says: Hello!
grade A*/
