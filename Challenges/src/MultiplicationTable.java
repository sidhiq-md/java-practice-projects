import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number whose multiplication table you want to print");
		int num = input.nextInt();
		printMultiplicationTable(num);
	}
	
	public static void printMultiplicationTable(int num) {
		int i = 1;
		while(i<=10) {
			int multi = num* i;
			System.out.println(num + " x " + i + " = " + multi );
			i++;
		}
			
	}
	

}
