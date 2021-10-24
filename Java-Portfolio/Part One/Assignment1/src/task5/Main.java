package task5;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import java.util.*;
import static java.lang.System.out;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		q5();
	}

	public static void q5() {
	/*
		* Get two lines of comma separated numbers from user
		* Each user line is split into an array by each comma
		* The array is converted into a linked list
		* Total for each line is updated by adding up the list items
		*/
		out.print("Enter first line: ");
		String line1 = input.nextLine();

		int total1 = 0;
	
		String[] strarr1 = line1.split(",");
		List<Integer> firstlist = new LinkedList<>();
		for (int i = 0; i < strarr1.length; i++) {
			firstlist.add(Integer.parseInt(strarr1[i]));
		}
		for (Integer i : firstlist) {
			total1 += i;
		}

		out.print("Enter second line: ");
		String line2 = input.nextLine();
		input.close();

		int total2 = 0;
		
		String[] strarr2 = line2.split(",");
		List<Integer> secondlist = new LinkedList<>();
		for (int i = 0; i < strarr2.length; i++) {
			secondlist.add(Integer.parseInt(strarr2[i]));
		}
		for (Integer i : secondlist) {
			total2 += i;
		}

		// Display output
		out.printf("First line total: %d\n", total1);
		out.printf("Second line total: %d\n", total2);

		getOverlap(firstlist, secondlist);
	}

	public static void getOverlap(List<Integer> list1, List<Integer> list2) {
		// Count and display the number of overlapping values
		int overlap = 0;
		
		for (Integer i : list1) {
			for (Integer j : list2) {
				if (i.equals(j)) {
					overlap++;
				}
			}
		}

		out.printf("Number of overlapping values: %d\n", overlap);

	}
}
