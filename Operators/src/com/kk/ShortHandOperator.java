package com.kk;

import java.util.Scanner;

public class ShortHandOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("enter your number");
int x1 = input.nextInt();
System.out.println("entered number is" + x1 );

x1 += 4;
System.out.println("after changes the number is " + x1);
float y1 = 20;
y1 -=10;
System.out.println(y1);
double z1 = 30;
z1 *= 30;
System.out.println(z1);

int a1 = 40;
a1 /=2;
System.out.println(a1);
float q1 = 10;
 q1 += y1;
 System.out.println(q1);
 
 int s1= 0;
 s1 += q1; 
 System.out.println("s1= " +s1);
 
	}

}
