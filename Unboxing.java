//Write a java program for  Unboxing.(all types) 
package javaprograms;

public class Unboxing {
	
	public static void main(String[] args) {
		
		// Unboxing for all Wrapper classes to primitive types using intValue()
		
		Integer i=new Integer(60);// Creating Integer object
		int i1 =i.intValue();//explicit conversion
		System.out.println("Integer Unboxing: "+i1);
		
		Float f = new Float(5.75f);// Creating Float object
        float f1 = f.floatValue();//explicit conversion
        System.out.println("Float Unboxing: "+f1);
        
        Double d = new Double(99.99);// Creating Double object
        double d1 = d.doubleValue();//explicit conversion
        System.out.println("Double Unboxing: "+d1);

        Character c = new Character('A');// Creating Character object
        char c1= c.charValue();//explicit conversion
        System.out.println("Character Unboxing: "+c1);
        
        Long l = new Long(300L);// Creating Long object
        long l1 = l.longValue();//explicit conversion
        System.out.println("Long Unboxing: "+l1);
        
        Boolean bl = new Boolean(true);// Creating Boolean object
        boolean bl1 = bl.booleanValue();//explicit conversion
        System.out.println("Boolean Unboxing: "+bl1);
        
		Byte b = new Byte((byte)10);// Creating Byte object
		byte b1 = b.byteValue();//explicit conversion
		System.out.println("Byte Unboxing: "+b1);

		Short s = new Short((short) 20);// Creating Short object
        short s1 = s.shortValue();//explicit conversion
        System.out.println("Short Unboxing: "+s1);

	}

}


/*
OUTPUT:

Integer Unboxing: 60
Float Unboxing: 5.75
Double Unboxing: 99.99
Character Unboxing: A
Long Unboxing: 300
Boolean Unboxing: true
Byte Unboxing: 10
Short Unboxing: 20

*/