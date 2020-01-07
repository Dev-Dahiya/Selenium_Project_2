package oopconcepts;

public class AddingMethods {

	public static void main(String[] args) {
		String grade;
		String studendName;
		
		studendName = "John";
		grade = findGrades(92);
		displayGrades(studendName, grade);
		
		studendName = "Tom";
		displayGrades(studendName, findGrades(80));
		
//		findGrades("Tom", 80);
//		findGrades("Sam", 75);
//		findGrades("Kon", 40);

	}
	
	public static String findGrades(int score){
		String grade;
		if(score >= 90 && score <= 100){
			grade = "A";
		}
		else if(score >= 80 && score < 90 ){
			grade = "B";
		}
		else if(score >= 70 && score < 80){
			grade = "C";
		}
		else grade = "D";
		return grade;
	}
	
	public static void displayGrades(String studentName, String grade){
		System.out.println("Grade of " + studentName + " is: " + grade);

	}

}
