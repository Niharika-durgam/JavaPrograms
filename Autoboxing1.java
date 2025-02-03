//Write  a java program for Autoboxing.(All Primitive Types)
package javaprograms;

public class Autoboxing1 {
	
	public static void main(String[] args) {
		
		// Autoboxing for all primitive types using valueOf()

		// int to Integer
		int a = 10;
		Integer i = Integer.valueOf(a);  // Explicit conversion
		System.out.println("Integer Autoboxing: " + i); 
		
		// float to Float
		float b = 20.2f; 
		Float f = Float.valueOf(b);  // Explicit conversion
		System.out.println("Float Autoboxing: " + f); 

		// double to Double 
		double d = 5.5; 
		Double d1 = Double.valueOf(d);  // Explicit conversion
		System.out.println("Double Autoboxing: " + d1); 

		// char to Character 
		char c = 'A'; 
		Character ch = Character.valueOf(c);  // Explicit conversion
		System.out.println("Character Autoboxing: " + ch); 
		
		// long to Long 
		long l = 1000L; 
		Long l1 = Long.valueOf(l);  // Explicit conversion
		System.out.println("Long Autoboxing: " + l1);

		// boolean to Boolean
		boolean var = true; 
		Boolean obj = Boolean.valueOf(var);  // Explicit conversion
		System.out.println("Boolean Autoboxing: " + obj); 
		
		// byte to Byte 
		byte var1 = 1; 
		Byte obj1 = Byte.valueOf(var1);  // Explicit conversion
		System.out.println("Byte Autoboxing: " + obj1); 
		
		// short to Short
		short s = 100;
		Short s1 = Short.valueOf(s);  // Explicit conversion
		System.out.println("Short Autoboxing: " + s1); 
	}

}


/*
OUTPUT:

Integer Autoboxing: 50
Float Autoboxing: 10.5
Double Autoboxing: 5.5
Character Autoboxing: A
Long Autoboxing: 1000
Boolean Autoboxing: true
Byte Autoboxing: 1
Short Autoboxing: 100

*/