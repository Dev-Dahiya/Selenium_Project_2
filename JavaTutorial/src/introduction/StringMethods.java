package introduction;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "This is the test string.";
		String str2 = str1.concat(" Another string.");
		
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "Welcome ";
		String str6 = "     spaces    all    around       ";
		
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(6));
//		System.out.println(str1.charAt(60));
		System.out.println(str1.concat(" This is new string."));
		System.out.println(str2);
		// Note below method takes a string argument
		System.out.println(str1.contains("T"));
		System.out.println(str1.contains("i"));
		System.out.println(str1.contains("test"));
		System.out.println(str1.contains("tst"));
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.startsWith("this"));
		System.out.println(str1.startsWith("is"));
		System.out.println(str1.endsWith("string."));
		System.out.println(str1.endsWith("String."));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str1.indexOf('s'));
		System.out.println(str1.indexOf("the"));
		System.out.println(str1.indexOf('x'));
		System.out.println(str1.indexOf("xy"));
		System.out.println(str1.indexOf("is"));
		System.out.println(str1.isEmpty());
		System.out.println(str3.replace('l', 'x'));
		System.out.println(str2.replace("string", "king"));
		System.out.println(str6.trim());
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 10));
//		System.out.println(str1.substring(10, 5));
		char[] charArray = str1.toCharArray();
		for(int i=0; i<charArray.length; i++){
			System.out.println(charArray[i]);
		}
		System.out.println(str5.concat(str6.trim()));

		

	}

}
