package com.te.factorymethod;

import java.util.Scanner;

public class BillClass {

	public static void main(String[] args) {

		GetPlan plan = new GetPlan();

		System.out.println("Enter the name for which the bill has to be generated");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("Enter the total number of units");
		int units = Integer.parseInt(sc.nextLine());

		Plan newPlan = plan.getPlan(str);

		System.out.println("Bill amount for " + str + " of " + units + " units is:");

		newPlan.setRate();
		newPlan.generateBill(units);

	}

}
