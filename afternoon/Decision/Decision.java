package com.thought_focus.Afternoon.Decision;

public class Decision {
	public void ifStatement() {
		int i = 0;
		if (i == 0) {
			System.out.println("false");
		}
	}

	public void ifElse() {
		int i = 6;
		if (i % 2 == 0) {
			System.out.println(i + " is even");
		} else
			System.out.println(i + " is odd");
	}

	public void ifElseIf() {
		int a = 6, b = 5, c = 7;
		if (a == b) {
			System.out.println("a is equal to b");
		} else if (a == c) {
			System.out.println("a is equal to c");
		} else if (b == c) {
			System.out.println("b is equal to c");
		} else
			System.out.println("a,b and c are not equal");
	}

	public void nestedIf() {
		int a = 8, b = 6, c = 4;
		if (a > b) {
			if (a > c) {
				System.out.println("a is the largest of the three");
			} else if (b > c) {
				System.out.println("b is the largest of the three");
			} else
				System.out.println("c is the largest of the three");

		}
	}
}
