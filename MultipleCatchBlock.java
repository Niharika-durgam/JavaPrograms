// 2.Write a program demonstrating multiple catch statements and finally block.
package exceptionhandling;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {

		try {
			  // Generating exceptions 
			
			  // ArrayIndexOutOfBoundsException
			  int arr[]=new int[5];
			  arr[10]=10;
			  
			  // ArithmeticException 
			  // int num1 = 10, num2 = 0;
	          // int result = num1 / num2;

	          // NullPointerException 
	          // String str = null;
	          // System.out.println(str.length()); 
			  
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}

}

/*
 * OUTPUT:
 * ArrayIndexOutOfBoundsException
 */

/*
 * OUTPUT:
 * Arithmetic Exception
 */

/*
 * OUTPUT:
 * Null pointer exception
 */
