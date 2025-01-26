//Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

package PracticePrograms;

// Importing the Arrays class for sorting
import java.util.Arrays;
public class SortingArray {
	public static void main(String[] args) {
		// Declare and initialize the array with given integers
		 int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

	        // Sorting the array
	        Arrays.sort(numbers);

	        // Printing the sorted array
	        System.out.println("Sorted array in ascending order: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	}

}

/*OUTPUT
Sorted array in ascending order: 
12 20 35 45 56 67 78 78 89*/