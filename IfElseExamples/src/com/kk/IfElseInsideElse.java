package com.kk;

public class IfElseInsideElse {
public static void main(String[] args) {
	boolean isMale = true;
	boolean isFemale = false;
	boolean isAdult= false;
	
	if(isMale) {
		if(isAdult) {
		System.out.println("person is a male adult");
		}
		else {
			System.out.println("person is male juvenile");
		}
	}	
	
	else {
		if(isFemale) {
			System.out.println("person is female");
			}
		else {
			System.out.println("person is neither female nor male, it is officialy a gmail ");
		}
	}
}
}
