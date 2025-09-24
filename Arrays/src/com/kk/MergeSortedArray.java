package com.kk;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = ArrayUtility.arrayInput();
		int[] arr2 = ArrayUtility.arrayInput();
		int[] mergedArray = merge(arr1, arr2);
		ArrayUtility.printArray(mergedArray);
	}
	
	public static int[] merge(int[] array1, int[] array2) {
		int mergedArraySize = array1.length + array2.length;
		int[] mergedArray =new int[mergedArraySize];
		int i=0, j=0 ,k=0, l=0;
		while(i < array1.length || j < array2.length) {
			if(j >= array2.length || (i < array1.length && array1[i] < array2[j])) {
				mergedArray[k] = array1[i];
				i++;
				k++;
			}
				else {
				mergedArray[k] = array2[j];
				j++;
				k++;
				}
			}
		return mergedArray;
		}
	
	}


