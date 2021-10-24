package task4;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		String txtfile = "data/data.txt";
		try {
			SalaryApp salaryapp = new SalaryApp(txtfile);
			salaryapp.printAll();
			System.out.println();
			out.printf("Max salary: %.2f\n", salaryapp.getMaxSalary());
			out.printf("Employee ID with min salary: %s\n", salaryapp.getMinSalaryID());
			salaryapp.promoteSalary();
			System.out.println("=======After salary promotion=====");
			salaryapp.printAll();
			System.out.println();
			double total = recursiveTotalSalary(salaryapp.getPeople(), 0);
			out.printf("Total salary: %.2f\n", total);
		} catch (IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n", new Main().getClass().getPackage().getName(), txtfile);
		}
	}

	// Recursive method to calculate and return the total of all salaries
	public static double recursiveTotalSalary(List<Employee> list, double accum) {
		if (list != null && list.size() > 0) {
			accum += list.get(0).getSalary();
			List<Employee> sublist = list.subList(1, list.size());
			return recursiveTotalSalary(sublist, accum);
		} else {
			return accum;
		}
	}
}
