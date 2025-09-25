package com.kk;

import java.util.Scanner;

public class BitwiseAnd {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int num1;
int num2;

System.out.println("enter the first number");
num1 = input.nextInt();
System.out.println("enter your second number");
num2 = input.nextInt();

int result = num1 & num2;
 System.out.println("the bitwise AND for the given numbers is " + result);
	}

}
