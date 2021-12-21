package com.thought_focus.Morning.object_class_methods.getclass;

public class GetClassTest {
	public static void main(String[] args) {
		Pizza pizza = new Pizza("Margherita", 200.00);
		System.out.println(pizza.getClass().getSimpleName());
	}

}
