package com.kk;

public class MultiDimensionArrayWithLoop {

	public static void main(String[] args) {
		int[][] arrayList = {{1,2,3}, {4,5,6}, {7,8,9}};
		int i = 0;
		while(i < arrayList.length) {
			int j = 0;
			while(j< arrayList[i].length) {
				System.out.print(arrayList[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
