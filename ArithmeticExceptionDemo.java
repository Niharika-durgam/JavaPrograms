//1.Write a program demonstrating  Exception handling using try catch for Arithmetic Exception.
package exceptionhandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		int result;

        try {
            // Divide by zero which will throw ArithmeticException
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching ArithmeticException and displaying a error message
            System.out.println("Number cannot divide by zero!");
        }
        
	}

}

/*
 * OUTPUT:
 * Number cannot divide by zero!
 */
