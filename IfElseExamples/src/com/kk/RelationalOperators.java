// covers relational operator as well as if-else
package com.kk;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	int age;
	System.out.println("enter your age to check eligibility to apply for driving license");
	age = input.nextInt();
	if(age > 17) {
		System.out.println("congrats!  you are eligibleto apply for driving license ");
	}
	else {
		System.out.println(" sorry! you are not eligible to apply for driving license, you can apply once you have reached 18 years of age");
	}
	}
}
