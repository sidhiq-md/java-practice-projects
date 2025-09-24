package com.kk;

public class MinMaxInArray {

	public static void main(String[] args) {
int[] myArr = ArrayUtility.arrayInput();
int maxElement = Maximum(myArr);
System.out.println("the maximum element in the array is " + maxElement);
int minElement = minimum(myArr);
System.out.println("the min element is " + minElement);
	}
	
	// using different methods(approaches) for max and min both are good but max is much appreciated
	
	public static int Maximum(int[] myArray) {
		int max = Integer.MIN_VALUE;
		 int i =0;
		 while(i < myArray.length) {
			 if(max < myArray[i]) {
				 max = myArray[i];
   			 }			 
			 i++;
		 }
		 return max;
	}
	
	public static int minimum(int[] myArray) {
		int min = myArray[0];
		int i = 1;
		while (i < myArray.length) {
			if(min > myArray[i]) {
				min = myArray[i];
			}
			i++;
		}
		return min;
	}

}
