package introduction;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("hello");
		buffer.append(" world");
//		System.out.println(buffer);
		
		buffer.insert(1, 'x');
//		System.out.println(buffer);
		
		buffer.delete(1, 2);
//		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("hi");
		builder.append(" world");
		System.out.println(builder);
		
		builder.insert(1, "xyz");
		System.out.println(builder);
		
		builder.delete(1, 4);
		System.out.println(builder);

	}

}
