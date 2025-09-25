// covers logical operator as well as if-else

package com.kk;

import java.util.Scanner;

public class LogicalOperator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age;
	boolean isFemale;
	
	System.out.println("enter tyour age here :");
	age = input.nextInt();
	System.out.println("are u a ladies? answear in true or false only");
	isFemale = input.nextBoolean();
	
	//condition if male and underage  50% discount
	if(age < 18 && !isFemale) {
		System.out.println("discount 50 %");
	}
	else if(age < 18 && isFemale) {
		System.out.println("your ticket is free");
	}
	else if(age > 18 && !isFemale) {
		System.out.println("no discount for you, pay full price");
		}
	else if(age > 18 && isFemale) {
		System.out.println("discount 25%");
	}
	}
}
