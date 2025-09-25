package com.kk;

import java.util.Scanner;

public class Swap2Numbers {
public static void main (String[] args) {
	int num1;
	int num2;
	int num;
	Scanner input =new Scanner(System.in);
	System.out.println("hi! welcome to number  \"swaping game\"\n\n");
	System.out.println("enter your 1st number");
	num1 = input.nextInt();
	System.out.println("now enter you 2nd number");
	num2 = input.nextInt();
	num = num1;
	num1 = num2;
	num2 = num;
	System.out.println("after swaping the numbers are \n num1 = "+ num1 + "\n num2 = " + num2);
	System.out.println("please dont play again");
	
}
}
