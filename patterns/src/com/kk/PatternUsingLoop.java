package com.kk;

public class PatternUsingLoop {
	
	/*
	 * i = 0             		*
	 * i=1  j=o					* *
	 * i=2	j=0	j=1				* * *
	 * i=3	j=0	j=1	j=2			* * * *
	 * i=4	j=0	j=1	j=2	j=3		* * * * *
	 *  
	 */
	
	public static void main(String[] args) {
		patternWithLOop();

	}
	
	public static void patternWithLOop() {
		int i = 0;
		while(i < 5) {
			System.out.print("*");
						
			int j=0;
			while(j < i) {
				System.out.print(" *");
				j++;
				
			}
			i++;
			System.out.println();
		}
	}

}
