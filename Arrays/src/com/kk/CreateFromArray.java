package com.kk;

import java.util.Scanner;

public class CreateFromArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myArray = ArrayUtility.arrayInput();
		System.out.println("enter the number you want to delete");
		int num = input.nextInt();
		int[] newArray = newArray(myArray, num);
		System.out.println("previously ur array was ");
		ArrayUtility.printArray(myArray);
		System.out.println("\n after deleting the entered value the array is ");
		ArrayUtility.printArray(newArray);
		
	}
	
	public static int[] newArray(int[] myArray, int numToDelete) {
		int countOfNumberToDelete = OccuranceOfArray.countOfOccurance(numToDelete, myArray);
		int newArraySize = myArray.length-countOfNumberToDelete;
		int[] newArayAfterDeletingNum = new int[newArraySize];
		int i=0 , j=0;
		while(i < myArray.length) {
			if(myArray[i] != numToDelete) {
				newArayAfterDeletingNum[j] = myArray[i];
				j++;
			}
			i++;
		}
		return newArayAfterDeletingNum;
		
	}

}
