package task3;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import static java.lang.System.out;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		q3();
	}

	public static void q3() {
		// Takes user score as input
		// Output a grade based on score
		out.print("Enter a score: ");
		double score = Double.parseDouble(input.nextLine());
		if (score <= 100 && score >= 80) {
			out.print("The score grade is A");
		} else if (score < 80 && score >= 70) {
			out.print("The score grade is B");
		} else if (score < 70 && score >= 50) {
			out.print("The score grade is C");
		} else if (score < 50 && score >= 0) {
			out.print("The score grade is D");
		} else { 
			// Display error message if score falls outside 0-100
			out.print("There is no grade for the score");
		}
	}
}
