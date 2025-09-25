package com.kk;

import java.util.Scanner;

public class ArithmeticCalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("welcome to your arithmetic calculator!\n\n");
	int num1;
	int num2;
	System.out.println("enter first number");
	num1 = input.nextInt();
	System.out.println("enter your second number");
	num2 = input.nextInt();
	
	int sum =num1 + num2;
	int diff =num1 - num2;
	int multy = num1 * num2;
	int div = num1 / num2;
	int mod  =num1 % num2;
	
	System.out.println("the sum is = " + sum);
	System.out.println("the difference is = " + diff);
	System.out.println("the multiplication is = " + multy);
	System.out.println("the division is = " + div);
	System.out.println("the modulus is = " + mod);

}
}
