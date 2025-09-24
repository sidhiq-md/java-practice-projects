package com.kk;

public class SumAverageOf2dArray {

	public static void main(String[] args) {
		int[][] MyArray = ArrayUtility.input2dArray();
		double sum = sum(MyArray);
		double avg = avg(MyArray);
		System.out.println("the sum is " + sum);
		System.out.println("the avg is " + avg);
		

	}
	public static double sum(int[][] numArray) {
		int sum = 0;
		int i = 0;
		while( i< numArray.length) {
			int j = 0;
			while(j < numArray[i].length) {
				sum+= numArray[i][j];
				j++;
			}
			i++;
		
			
		}
		return sum;
	}
	
	public static double avg(int[][] numArray) {
		double  avg = sum(numArray) / (numArray.length * numArray[0].length);
				return avg;
	}

}
