package studentgraing;
import java.util.Scanner;

public class Studentgrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int totalGrades = 0;
	        int grade;
	        int numberOfGrades = 0;

	        while (true) {
	            System.out.print("Enter grade (or -1 to finish): ");
	            grade = scanner.nextInt();
	            
	            if (grade == -1) {
	                break;
	            }
	            
	            totalGrades += grade;
	            numberOfGrades++;
	        }
	        
	        if (numberOfGrades > 0) {
	            double average = (double) totalGrades / numberOfGrades;
	            System.out.println("Average grade: " + average);
	        } else {
	            System.out.println("No grades entered.");
	        }
	}

}
