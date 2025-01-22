//Write java program to invoke current class method using this keyword
package anudip.ANPD0453;

public class This_Method {
	
	void display() // Method to display a message
	{
		System.out.println("Call Display method ");
	}
	void show() // Method to invoke the current class method using 'this'
	{
		this.display();
		System.out.println("Invoked Method using this Keyword");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Method obj=new This_Method();		
		obj.show(); // Call invoke method
	}

}

/*Output:
 * 
 * Call Display method 
 * Invoked Method using this Keyword
 * 
 */
