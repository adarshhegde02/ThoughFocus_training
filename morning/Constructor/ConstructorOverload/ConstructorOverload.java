package com.thought_focus.Morning.Constructor.ConstructorOverload;

public class ConstructorOverload {
	public static void main(String[] args) {
		Fruit fruit = new Fruit();

		System.out.println("Name: " + fruit.name);
		System.out.println("Price: " + fruit.price);

		Fruit apple = new Fruit("Apple", 100.00);

		System.out.println("Name: " + apple.name);
		System.out.println("Price: " + apple.price);

	}

}
