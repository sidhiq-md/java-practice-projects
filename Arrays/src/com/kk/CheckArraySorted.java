package com.kk;

public class CheckArraySorted {

	public static void main(String[] args) {
	int[] myArray = ArrayUtility.arrayInput();
	boolean isIncreasing = isIncreasing(myArray);
	boolean isDecreasing = isDecreasing(myArray);
	//System.out.println("increse" + isIncreasing);
	//System.out.println("decreasing" + isDecreasing);
	if(isIncreasing) {
		System.out.println("the array is sorted in increasing");
	}
	else if (isDecreasing) {
		System.out.println("the array is sorted in decreasing");
	}
	
	else
	{
		System.out.println("the array is not sorted ");
	}
	}
	public static boolean isIncreasing(int[] myArr) {
		int i=1;
		while(i < myArr.length) {
			if(myArr[i] < myArr[i-1]) {
				return false;
			}
			i++;
		}
		 return true;
		
	}
	
	
	public static boolean isDecreasing(int[] myArr) {
		int i =1;
		while(i < myArr.length) {
			if(myArr[i] > myArr[i-1]) {
				return false;
			}
			i++;
			
		}
		return true;
	}

}
