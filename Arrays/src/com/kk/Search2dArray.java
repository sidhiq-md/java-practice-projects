package com.kk;

import java.util.Scanner;

public class Search2dArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] myArray = ArrayUtility.input2dArray();
		//ArrayUtility.print2dArray(myArray);
		System.out.println("enter the numer you want to search");
		int num = input.nextInt();
		if (isFound(myArray, num)) {
			System.out.println("element FOUND");
		}
		else {
			System.out.println(" element NOT FOUND");
		}
	}
	public static boolean isFound(int[][] myArray, int num) {
		int i = 0;
		while(i < myArray.length) {
			int j = 0;
			while(j < myArray[i].length) {
				if(myArray[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
			
		}
		return false;
	}

}
