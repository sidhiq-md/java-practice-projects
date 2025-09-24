package com.kk;

import java.util.Scanner;

public class ArrayUtility {


		public static int[] arrayInput() {
			Scanner input = new Scanner(System.in);
			int size;
			System.out.println("enter the size of array");
			size = input.nextInt();
			int[] myArr = new int[size];
			int i=0;
			while(i < size) {
				System.out.println("enter " + (i+1) + "th element of the array ");
				myArr[i] = input.nextInt();
				i++;
			}
			return myArr;
		}
		
		public static void printArray(int[] myArr) {
			int i=0;
			while(i < myArr.length) {
				System.out.print(myArr[i]);
				i++;
			}
			
		}
	public static int[][] input2dArray(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = input.nextInt();
		System.out.println("enter numer of coloumns");
		int coloumn = input.nextInt();
		int[][] myArr = new int[rows][coloumn];
		int i=0;
		while(i < rows) {
			int j = 0;
			while(j < coloumn) {
				System.out.println("enter " + (i+1) + " and "+  (j+1) + " th term of th 2d array ");
				myArr[i][j] = input.nextInt() ;
				j++;
				
			}
			i++;
		}
		return myArr;
	}
	
	public static void print2dArray(int[][] myArray) {
		int i =0;
		while(i < myArray.length) {
			int j = 0;
			while(j < myArray[i].length) {
				System.out.print(myArray[i][j]);
				j++;
			}
			i++;
		}
	}
		
	}


