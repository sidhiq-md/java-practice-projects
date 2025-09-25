package com.kk;

import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int num1;
int num2;
int num3;

System.out.println("enter your 3 numbers one after other");
num1 = input.nextInt();
num2 = input.nextInt();
num3 = input.nextInt();

if(num1 > num2 && num1 > num3) {
	System.out.println(num1 + "  is greatest");
}
else if(num2 > num1 && num2 > num3) {
	System.out.println(num2 +"  is greates");
}
else {
	System.out.println(num3 +"  is greatest");
}
	}

}
