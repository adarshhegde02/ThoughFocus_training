package com.thought_focus.Afternoon.Looping;

public class Looping {
	public static void forLoop(int n) {
		System.out.println("ForLoop....");
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}

	public static void forEach(int n[]) {
		System.out.println("ForeachLoop....");
		for (int i : n) {
			System.out.println(i);
		}
	}

	public static void whileLoop(int n) {
		int i = 0;
		System.out.println("WhileLoop....");
		while (i < n) {
			System.out.println(i);
			i++;
		}
	}

	public static void doWhileLoop(int n) {
		int i = 0;
		System.out.println("DowhileLoop....");
		do {
			System.out.println(i);
			i++;
		} while (i < n);
	}

	public static void main(String args[]) {
		forLoop(5);
		int a[] = { 1, 2, 3, 4, 5 };
		forEach(a);
		whileLoop(5);
		doWhileLoop(5);
	}
}
