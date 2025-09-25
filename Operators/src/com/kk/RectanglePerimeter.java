package com.kk;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
System.out.println("welcome to calculate rectangle permeter! \n\n");
Scanner input = new Scanner(System.in);
System.out.println("enter values of four sides in cm: ");
double a = input.nextDouble();
double b = input.nextInt();
double c = input.nextInt();
double d = input.nextInt();
double perimeter;
perimeter = a + b + c+ d;
System.out.println("the perimeter is: " + perimeter);
	}

}
