package introduction;


public class Variables {
	public static void main(String[] args) {
		/*
		 * byte
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		byte byteVariable = 100;
		System.out.println("Byte value: " + byteVariable);
		
		/*
		 * short
		 * Min: -32,768 
		 * Max: 32,767
		 * Default: 0
		 */
		short shortVariable = 1000;
		System.out.println("Short value: " + shortVariable);
		
		/*
		 * int
		 * Min: -2,147,483,648
		 * Max: 2,147,483,647
		 * Default: 0
		 */
		int intVariable = 100000;
		System.out.println("Int value: " + intVariable);
		
		/*
		 * long
		 * Min: -2^63
		 * Max: 2^63 - 1
		 * Default: 0
		 */
		long longVariable = 100000000L;
		System.out.println("Long value: " + longVariable);
		
		/*
		 * float
		 * Default: 0.0f
		 */
		float floatVariable = 20.1f;
		System.out.println("Float value: " + floatVariable);
		
		/*
		 * double
		 * Default: 0.0;
		 */
		double doubleVariable = 60.33;
		System.out.println("Double value: " + doubleVariable);
		
		/*
		 * boolean
		 * true and false
		 * Default: false
		 */
		boolean booleanVariable = true;
		System.out.println("Boolean value: " + booleanVariable);
		
		/*
		 * char
		 * Min: 0
		 * Max: 65,535
		 */
		char charVariable = 'a';
		System.out.println("Char value: " + charVariable);

		
	}

}
