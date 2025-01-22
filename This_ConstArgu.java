//Write a Java Program  to pass  this keyword as argument in the constructor call.
package anudip.ANPD0453;
class Task1
{
	This_ConstArgu arg;
	Task1(This_ConstArgu arg) // Constructor
	{
		this.arg=arg;
	}
	void show() // Method to display a message
	{
		System.out.println("This is Constructor Argument using this keyword");
	}
}

public class This_ConstArgu 
{
	This_ConstArgu()  
	{
		System.out.println("This is Constructor");
		Task1 obj=new Task1(this);
		obj.show(); // Call the show() method of Task1 using the created object
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_ConstArgu obj=new This_ConstArgu();  // Creating object of class
	}

}

/* Ouput
 * This is Constructor
 * This is Constructor Argument using this keyword
*/
