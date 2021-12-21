package com.thought_focus.Afternoon.Method_Chaining.NonStaticMethod;

public class NonStaticMethod {
	void method1() {
		this.method2();
		System.out.println("Method1");
	}

	void method2() {
		this.method3();
		System.out.println("Method2");
	}

	void method3() {
		System.out.println("Method3");
	}

	public static void main(String[] args) {
		NonStaticMethod nsm = new NonStaticMethod();
		nsm.method1();
	}

}
