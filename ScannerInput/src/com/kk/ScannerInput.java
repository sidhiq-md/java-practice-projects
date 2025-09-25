package com.kk;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		int age;
		String name;
		float salary;
		double increament;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your name");
		 name = input.nextLine();
		System.out.println("good morning mr/ miss : " + name );
		System.out.println("please enter your age");
		 age = input.nextInt();
		System.out.println("the age of " + name + " is " + age);
		System.out.println("please enter your monthly salary");
		salary=input.nextFloat();
		System.out.println("salary of " + name + " at the age of " + age + " is " + salary);
		System.out.println("please enter your monthly increament");
		increament = input.nextDouble();
		System.out.println("all details as above and the increament every year is " + increament);
		
	}

}
