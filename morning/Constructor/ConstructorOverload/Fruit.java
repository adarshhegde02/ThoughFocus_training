package com.thought_focus.Morning.Constructor.ConstructorOverload;

public class Fruit {
	String name;
	double price;

	public Fruit() {
		System.out.println("This is Default constructor.....");
	}

	public Fruit(String name1, double price1) {
		name = name1;
		price = price1;
	}

}
