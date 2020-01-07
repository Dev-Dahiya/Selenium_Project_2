package oopconcepts;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 2;
		
		while(i <= 10) {
			System.out.println(i);
			i = i+2;
			if(i==8) {
				i = i+2;
				continue;
			}

		}

	}

}
