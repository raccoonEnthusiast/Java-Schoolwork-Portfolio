package task4;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import static java.lang.System.*;

public class SalaryApp {

	List<Employee> people;

	public List<Employee> getPeople() {
		return people;
	}

	public SalaryApp(String filename) throws IOException {
		readData(filename);
	}

	// Reads data from a file, splits each line by comma
	// Assigns split data into people list as new employee instances
	public void readData(String filename) throws IOException {
		people = new LinkedList<>();
		List<String> lines = Files.readAllLines(Paths.get(filename));
		for (String line : lines) {
			String[] items = line.split(",");
			String ID = items[0];
			double salary = Double.parseDouble(items[1]);
			people.add(new Employee(ID, salary));
		}
	}

	// Print all employee information
	public void printAll() {
		String linespace = String.format("%40s\n", "");
		String dashline = linespace.replace(" ", "-");

		out.printf("%-30s%-20s\n", "ID", "Salary");
		out.printf(dashline);
		for (Employee e : people) {
			e.displayEmployee();
		}
	}

	// Get the ID of the employee with lowest salary
	public String getMinSalaryID() {
		if (people == null || people.size() == 0) {
			return "No employee found";
		}
		Employee minSal = people.get(0);
		for (Employee e : people) {
			if (e.getSalary() < minSal.getSalary()) {
				minSal = e;
			}
		}
		return minSal.getID();
	}

	// Get the salary of the employee with the highest salary
	public double getMaxSalary() {
		if (people == null || people.size() == 0) {
			return 0;
		}
		Employee maxSal = people.get(0);
		for (Employee e : people) {
			if (e.getSalary() > maxSal.getSalary()) {
				maxSal = e;
			}
		}
		return maxSal.getSalary();
	}

	// Raise the salary of every employee by 2000
	// If employee salary is greater than 100K it will be capped to 100000
	public void promoteSalary() {
		for (Employee e : people) {
			e.setSalary(e.getSalary() + 2000);
			if (e.getSalary() > 100000) {
				e.setSalary(100000);
			}
		}

	}
}
