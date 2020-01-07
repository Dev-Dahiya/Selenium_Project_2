package introduction;

public class StringDemo {
	public static void main(String[] args) {
		// String Literal - goes in String Constant Pool
		String str1 = "Hello";
		
		// This will not create a new String Literal, but will create a new reference
		// to existing string literal content.
		String str3 = "Hello";
		
		// String Object - goes in Heap Storage
		String str2 = new String("Welcome");
		
		//This will create a new string object
		String str4 = new String("Welcome");
		
		
		System.out.println(str1 == str3);
		System.out.println(str2 == str4);
		
		String str5 = "Dev";
		String str6 = new String("Dev");
		System.out.println(str5 == str6);
		
		
//		Strings are immutable
	}

}
