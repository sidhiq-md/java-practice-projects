package com.kk;

import java.util.Scanner;

public class AreaRTriangle {

	public static void main(String[] args) {
double base;
double height;
double area;
System.out.println("all input should be in cm!");
System.out.println("enter base : ");
Scanner input = new Scanner(System.in);
base = input.nextDouble();
System.out.println("enter height : ");
height =input.nextDouble();
area = 0.5 * base * height;
System.out.println("the area is :" + area);

	}

}
