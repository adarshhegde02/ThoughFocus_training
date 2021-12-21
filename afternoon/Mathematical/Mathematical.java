package com.thought_focus.Afternoon.Mathematical;

public class Mathematical {

	public static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum= " + sum);
	}

	public static void subtraction(int a, int b) {
		int total = a - b;
		System.out.println("Total= " + total);
	}

	public static void multiplication(int a, int b) {
		int product = a * b;
		System.out.println("Product= " + product);
	}

	public static void division(int a, int b) {
		int result = a / b;
		System.out.println("Result= " + result);
	}

	public static void main(String args[]) {
		int a = 10, b = 5;
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);
	}
}
