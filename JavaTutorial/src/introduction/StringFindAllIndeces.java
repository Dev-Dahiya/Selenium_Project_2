package introduction;

public class StringFindAllIndeces {

	public static void main(String[] args) {
		String str = "This is the is test string";
		
//		int i = str.indexOf("is");
//		
//		while(i >= 0) {
//			System.out.println(i);
//			i = str.indexOf("is", i+1);
//		}
		
		int i = str.indexOf('i');
		int count = 0;
		
		while(i >= 0) {
			i = str.indexOf('i', i+1);
			count++;
		}
		System.out.println(count);

	}

}
