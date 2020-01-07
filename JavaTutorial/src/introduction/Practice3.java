package introduction;

public class Practice3 {
	public static void main(String[] args){
//		System.out.println(Counter.count);

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
//		System.out.println(Counter.count);
		String name = new String("Dev");
	}

}

class Counter {
	 int count;
	
	public Counter() {
//		count++;
		count = count+1;
		System.out.println(count);
	}
}