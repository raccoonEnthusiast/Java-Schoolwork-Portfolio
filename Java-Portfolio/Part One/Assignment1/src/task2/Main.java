package task2;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import static java.lang.System.out;
import java.util.Scanner;


public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		q2();
	}

	public static void q2() {
		// Take user input for the radius of a circle
		// Calculate and display circle area and perimeter
		out.print("Enter circle radius: ");
		double radius = Double.parseDouble(input.nextLine());

		double area = Math.pow(radius, 2) * Math.PI;
		double diameter = radius * 2;
		double perimeter = diameter * Math.PI;

		// Format output as columns
		// Round up results as 2 decimal points
		String fmt = "%-20s%-20s%-20s\n";
		String numfmt = "%-20.1f%-20.2f%-20.2f";
		
		out.printf(fmt, "Radius", "Perimeter", "Area");

		String linespace = String.format("%45s\n", "");
		String dashline = linespace.replace(" ", "-");
		
		System.out.printf(dashline);

		// Display results
		out.printf(numfmt, radius, perimeter, area);
	}

}
