package task4;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import static java.lang.System.out;
import java.util.Scanner;


public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		q4();
	}
	//Get user input and determine if it is a valid season name
	//If season is valid output an appropriate season's greeting
	//Otherwise keep prompting for re-entry until season is valid
	public static void q4() {
		String season;
		
		boolean done = false;
		while (done == false) {
			out.print("Enter season name: ");
			season = input.nextLine();
			
			switch (season.toUpperCase()) {
			case "SUMMER":
				out.println("Summer is an oil painting");
				done = true;
				break;
			case "SPRING":
				out.println("Spring is a water colour");
				done = true;
				break;
			case "WINTER":
				out.println("Winter is an etching");
				done = true;
				break;
			case "AUTUMN":
				out.println("Autumn is a mosaic of them all");
				done = true;
				break;
			default:
				out.print("Invalid season name, ");
				break;
			}
		}
	}
}