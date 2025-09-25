package com.kk;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double p;
double t;
double r;

System.out.println("enter values for \"p\" , \"t\" , \"r\" ");
p = input.nextDouble();
t = input.nextDouble();
r = input.nextDouble();
double SI = (p*t*r)/100;
System.out.println("the calculated SI is : " + SI);

//Calculating compound interest also here only

double CI = p* Math.pow((1+(r/100)), t) ;
System.out.println("the calcuated CI is " + CI );
	}

}
