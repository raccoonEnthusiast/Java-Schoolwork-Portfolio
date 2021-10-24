package task6;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import static java.lang.System.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		q6();
	}

	public static void q6() {
		/*
		 * Prompt user to guess the country named based on a randomly selected capital city
		 * User is allowed to input up to three guesses in one comma separated line
		 * If user makes more than three guesses then output game over message
		 * Else output message depending on if their guess matches with the correct random country
		 */
		String[] country = {"New Zealand", "India", "Germany", "Thailand", "Greece", "Netherlands"};
		String[] capital = {"Wellington", "New Delhi", "Berlin", "Bangkok", "Athens", "Amsterdam"};
		

		int random = getRandomNum(0, capital.length);
		String randomcountry = country[random];
		String randomcapital = capital[random];

		String[] guessarr;
		while (true) {
			out.printf("Which country has the capital city of %s?\n", randomcapital);
			out.print("Enter up to three names, comma separated: ");
			String playerguess = input.nextLine();

			guessarr = playerguess.split(",");

			if (guessarr.length > 3) {
				out.println("Too many names. Game Over");
			} else {
				break;
			}
		}

		List<String> guesslist = Arrays.asList(guessarr);

		boolean correctguess = guesslist.stream().anyMatch(randomcountry::equalsIgnoreCase);
		if (!correctguess) {
			out.print("Your answer is incorrect");
		} else {
			out.print("Your answer is correct. Well Done");
		}
	}

	//Return a random number that will be the array index number of the correct country
	//Take the first index 0 as the lower bound and the array length as the upper bound
	public static int getRandomNum(int lower, int upper) {
		int randomnum = ThreadLocalRandom.current().nextInt(lower, upper);
		return randomnum;
	}

}
