package com.kk;

import java.util.Scanner;
public class Add2Numbers {
	public static void main (String [] args) {

int num1;
int num2;
int sum;
Scanner input = new Scanner(System.in);
System.out.println("aao ma calculator me tumara mu leko");
System.out.println("pehla number dalo ma");
num1 = input.nextInt();
System.out.println("ab dusra number bi dalo ma");
num2 = input.nextInt();
sum = num1 + num2;
System.out.println("dekho ma tumare numbers ka sum ye: " + sum);
System.out.println("ab ankhya ku dikhna nai bete");

}
}