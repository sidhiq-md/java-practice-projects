package com.kk;

import java.util.Scanner;

public class ArrayItterationSearch {

	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8,9,10};
Scanner input = new Scanner(System.in);
System.out.println("enter your number ");
int num = input.nextInt();
boolean isFound = isFound(myList, num);
if(isFound == true) {
	System.out.println("the number is found ");
}
else {
	System.out.println("Thodlyo!!  not found");
}

	}
	
	public static boolean isFound(int []myList, int num) {
		int index = 0;
		while(index < myList.length) {
			if(myList[index] == num) {
				return true;
				
			}
			index++;
		}	
				return false;
	}
}
