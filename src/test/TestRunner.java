package test;

import measurement.Printer;

public class TestRunner {

	//create repo github called MachineTemperatureSensor
	public static void main(String[] args) {
		double testCase1[] = {35, 27.4, 43.5, 54.8};
		double testCase2[] = {41.5, 40.4, 24.7, 39.1, 35.2, 53.4, 43};
		double testCase3[] = {22.6, 55, 49.4, 40.6, 45.2, 19.6, 54};
		double testCase4[] = {26.8, 41.8, 47.3, 20.9, 34.7};
		double testCase5[] = {19.6, 39.8, 49.7, 31.1, 55.2, 45.2, 41.8};
		Printer printAnArray = new Printer();

		System.out.println("Test Case 1");
		System.out.println(printAnArray.printAllMachineTemperatures(testCase1));
		
		System.out.println("Test Case 2");
		System.out.println(printAnArray.printAllMachineTemperatures(testCase2));

		System.out.println("Test Case 3");
		System.out.println(printAnArray.printAllMachineTemperatures(testCase3));
		
		System.out.println("Test Case 4");
		System.out.println(printAnArray.printAllMachineTemperatures(testCase4));
		
		System.out.println("Test Case 5");
		System.out.println(printAnArray.printAllMachineTemperatures(testCase5));
	}

}
