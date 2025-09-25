package com.kk;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {
int num1;
int num2;
int sum;
greet();
num1 = readInput();
num2 = readInput();

sum = num1 + num2;
System.out.println("the sum is : " + sum);
 }
	public static int readInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number :");
		int number = input.nextInt();
		return number;
	}
	
	public static void greet() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name");
		String name = input.next();
		System.out.println("good morning " + name);
	}

}
