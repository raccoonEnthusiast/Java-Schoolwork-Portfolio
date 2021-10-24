package task4;

import static java.lang.System.*;

public class Employee {
	private String ID;

	public String getID() {

		return ID;
	}

	public void setID(String ID) {

		this.ID = ID;
	}

	public double getSalary() {

		return salary;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}

	private double salary;

	public Employee(String ID, double salary) {
		this.setID(ID);
		this.setSalary(salary);
	}

	public void displayEmployee() {
		out.printf("%-30s %-15.2f\n", this.getID(), this.getSalary());
	}
}
