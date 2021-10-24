package task1;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

public class Main {

	public static void main(String[] args) {
		
		q1();
	}

	public static void q1() {
		// Format output as columns
		String frmt = "%-30s%-20s\n";
		String linespace = String.format("%40s\n", "");
		String dashline = linespace.replace(" ", "-");

		// Display formatted output
		System.out.printf(frmt, "Escape Sequence", "Description");
		System.out.printf(dashline);
		System.out.printf(frmt, "\\n", "Newline Character");
		System.out.printf(frmt, "\\t", "Horizontal Tab Character");
		System.out.printf(frmt, "\\\"", "Double Quote Character");
		System.out.printf(frmt, "\\b", "Backspace Character");

	}
}
