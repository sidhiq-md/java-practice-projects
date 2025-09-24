package com.kk;

public class ArraySumAverage {

	public static void main(String[] args) {
int[] numArray = ArrayUtility.arrayInput();
long sumArray = sumOfArray(numArray);
System.out.println(sumArray);

double avgArray =avgOfArray(numArray);
System.out.println("the average is " +avgArray);

	}
	
	public static long sumOfArray(int[] numArray) {
		int sum =0;
		int i=0;
		while(i < numArray.length) {
			sum += numArray[i];
			i++;
		}
		return sum;
	}

	public static double avgOfArray(int[] numArray) {
		double sum = sumOfArray(numArray);
		double avg = sum/numArray.length;
		
		return avg;
	}
}
