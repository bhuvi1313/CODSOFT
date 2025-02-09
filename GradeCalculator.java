package javapackage;
import java.util.Scanner;

	public class GradeCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Take marks obtained in each subject
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        int[] marks = new int[numSubjects];
	        int totalMarks = 0;

	        // Input marks for each subject
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }

	        // Calculate Average Percentage
	        double averagePercentage = (double) totalMarks / numSubjects;

	        // Grade Calculation
	        String grade = calculateGrade(averagePercentage);

	        // Display Results
	        System.out.println("\n--- Results ---");
	        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }

	    // Method to calculate grade based on average percentage
	    public static String calculateGrade(double percentage) {
	        if (percentage >= 90) {
	            return "A+";
	        } else if (percentage >= 80) {
	            return "A";
	        } else if (percentage >= 70) {
	            return "B+";
	        } else if (percentage >= 60) {
	            return "B";
	        } else if (percentage >= 50) {
	            return "C";
	        } else if (percentage >= 40) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }
	}


