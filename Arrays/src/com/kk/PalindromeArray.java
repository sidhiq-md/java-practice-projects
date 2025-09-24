package com.kk;

public class PalindromeArray {

	public static void main(String[] args) {

		int[] myArr = ArrayUtility.arrayInput();
		if(isPalindromeArray(myArr)){
			System.out.println("your array is PALINDROME ARAY ");
		}
		else {
			System.out.println("your array is not PALINDROME ARRAY");
		}
	}

	public static boolean isPalindromeArray(int[] numArr) {
		int i =0;
		while(i < numArr.length / 2) {
			if(numArr[i] != (numArr[numArr.length-1 -i])) {
				return false;
			}
			i++;
		}
		return true;
	}
	
}
