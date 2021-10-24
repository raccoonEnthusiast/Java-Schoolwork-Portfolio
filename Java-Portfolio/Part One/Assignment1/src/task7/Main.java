package task7;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		q7();
	}
	
	/*
	 * Prompt the user for the number of sensors deployed
	 * Number of sensors must be greater than zero
	 * Read user temperature inputs for each sensor
	 * Calculate and display average and maximum temperature
	 * Count and display number of temperatures between 10 and 20 degrees
	 * Allow user to query a sensor by number
	 */
	public static void q7() {
		
		int numSensors;
		
		out.println("==Collecting Temperatures==");
		while(true) {
			out.print("How many sensors in use: ");
			numSensors = input.nextInt();
			if(numSensors <= 0) {
				out.print("Invalid Input: please try again\n");
			}else {
				break;
			}
		}
		collectTemps(numSensors);
	}
	//Get user temperatures and display average, max and count of between 10 and 20 degrees
	public static void collectTemps(int num) {
		
		double[] sensorArr = new double[num];
		
		for(int i=0; i < sensorArr.length; i++) {
			out.printf("Enter temperature #%d: ", (i+1));
			sensorArr[i] = input.nextDouble();
			}
		
		out.println("\n==Display Statistics==");
		out.printf("Average temperature: %.2f\n", getAverage(sensorArr));
		out.printf("Maximum temperature: %.2f\n", getMax(sensorArr));
		out.printf("Number of temperature between 10-20: %d\n", getBetween(sensorArr));
		
		queryTemps(sensorArr);
	}
	//Query temperatures by sensor number
	public static void queryTemps(double[] tempArr) {
		
		out.println("\n==Query Sensor Temperature==");
		int indexSearch;
		while(true) {
			out.printf("Enter sensor number (1-%d): ", tempArr.length);
			indexSearch = input.nextInt();
			if(indexSearch > tempArr.length || indexSearch <= 0) {
				out.println("Sensor does not exist. Enter Again.");
			} else {
				break;
			}
		}
		//indexSearch has 1 subtracted from it to compensate for array index starting from 0
		out.printf("Temperature for sensor #%d: %.2f", indexSearch, tempArr[indexSearch-1]);
		
	}
	//Calculate and return average temperature
	public static double getAverage(double[] tempArr) {
		
		double avg = 0;
		double total = 0;
		
		for(int i=0; i < tempArr.length; i++) {
			total += tempArr[i];
		}
		avg = total / tempArr.length;
		return avg;
	}
	//Calculate and return max temperature
	public static double getMax(double[] tempArr) {
		
		double maxNum = tempArr[0];
		
		for(int i=0; i < tempArr.length; i++) {
			if(tempArr[i] > maxNum) {
				maxNum = tempArr[i];
			}
		}
		return maxNum;
	}
	//Count and return number of temperatures between 10 and 20 degrees
	public static int getBetween(double[] tempArr) {
		
		int betweenCount = 0;
		
		for(int i=0; i < tempArr.length; i++) {
			if(tempArr[i] <= 20 && tempArr[i] >= 10) {
				betweenCount ++;
			}
		}
		return betweenCount;
	}

}

