package com.thought_focus.Afternoon.Method_Chaining.Static_Method;

public class StaticMethodChaining {
	static void method1() {
		System.out.println("Method1");
		method2();
	}

	static void method2() {
		System.out.println("Method2");
		method3();
	}

	static void method3() {
		System.out.println("Method3");
	}

	public static void main(String[] args) {
		StaticMethodChaining.method1();
	}

}
