package com.thought_focus.Afternoon.EvenOdd;

public class EvenOdd {
	public static void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is an even number.");
		} else {
			System.out.println(a + " is an odd number.");
		}
	}

	public static void main(String args[]) {
		int a = 26;
		evenOdd(a);
	}

}
