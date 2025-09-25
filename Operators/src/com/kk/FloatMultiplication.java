package com.kk;

import java.util.Scanner;

public class FloatMultiplication {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter your first floating point number ");
float num1 = input.nextFloat();
System.out.println("enter your secon floating point numer");
float num2 = input.nextFloat();

float multi = num1* num2;
System.out.println(multi);
	}

}
