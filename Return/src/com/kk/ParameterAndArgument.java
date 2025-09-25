package com.kk;

public class ParameterAndArgument {

	public static void main(String[] args) {

System.out.println(addTwoNumbers(10, 50));
System.out.println(addTwoNumbers(10, 200));
System.out.println(addTwoNumbers(10, 501));
System.out.println(addTwoNumbers(10, 50));
	}
	public static int addTwoNumbers(int num1, int num2) {
		int addition = num1+num2;
		return addition;
	}

}
