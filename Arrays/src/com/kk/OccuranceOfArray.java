package com.kk;

import java.util.Scanner;

public class OccuranceOfArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] myArr = ArrayUtility.arrayInput();
		System.out.println("enter no whose occurance u want to count");
		int num = input.nextInt();				
		int count = countOfOccurance(num, myArr);
		System.out.println("the occurance of " + num+ " is " + count + " times");
	}
	
	public static int countOfOccurance(int num, int[]myArr) {
		int count = 0;
		int i=0;
		while(i < myArr.length) {
			if(myArr[i] == num) {
				count ++;
			}
			i++;
		}
		return count;
	}
	

}
