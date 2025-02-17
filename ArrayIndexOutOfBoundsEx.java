// 3.Write a program using exception handling to handle array index out of bounds.
package exceptionhandling;

public class ArrayIndexOutOfBoundsEx {
	
	public static void main(String[] args) {
		// Accessing an invalid index
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
		}
		//Handling the exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The number cannot be inserted");
			System.out.println("Exception: ArrayIndexOutOfBounds");
		}
		
	}

}

/*
 * OUTPUT:
 * The number cannot be inserted
 * Exception: ArrayIndexOutOfBound
 */