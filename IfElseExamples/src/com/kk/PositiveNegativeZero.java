package com.kk;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number;
System.out.println("enter you number to check if it isn zero, negative or possitive number");
number = input.nextInt();
if(number > 0) {
	System.out.println("your number is positive");
}
else if(number < 0) {
	System.out.println("your number is negative");
}
else {
	System.out.println("your number is neither positive nor zero, its a zero. aur kya haal hai Hero");
}
	}

}
