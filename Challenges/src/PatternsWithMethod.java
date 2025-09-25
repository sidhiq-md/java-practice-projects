import java.util.Scanner;

public class PatternsWithMethod {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter your number of rows");
int n = input.nextInt();
rightHalfPyramid(n);
reverseRightHalfPyramid(n);
	}
	
	public static void rightHalfPyramid(int n) {
		int i = 0;
		while(i < n) {
			System.out.print("*");
			
			int j=0;
			while(j<i) {
				System.out.print(" *");
				j++;
			}
			i++;
			System.out.println();
		}
		
	}
	
	public static void reverseRightHalfPyramid(int n) {
		System.out.println("\n");
		int i =n;
		while(i > 0) {
			System.out.print("*");
			int j = 1;
			while(j < i) {
				System.out.print(" *");
				j++;
			}
			
			i--;
			System.out.println();
		}
	
		
	}

}
