package com.kk;

public class ReverseArray {

	public static void main(String[] args) {
		int[] myArray = ArrayUtility.arrayInput();
		reverseArray(myArray);
		ArrayUtility.printArray(myArray); 
		
	}
	
	public static void reverseArray(int[] array) {
		int i = 0;
	 while(i < array.length / 2) {
		 int swap = array[i];
		 array[i] = array[(array.length - 1) - i];
		 array[(array.length-1)-i] = swap;
		 i++;
	 }
	}

}
