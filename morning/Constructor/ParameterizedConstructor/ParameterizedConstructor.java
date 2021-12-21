package com.thought_focus.Morning.Constructor.ParameterizedConstructor;

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung", 15000.00);

		System.out.println("Name: " + mobile.brand);
		System.out.println("Price: " + mobile.price);
	}

}
