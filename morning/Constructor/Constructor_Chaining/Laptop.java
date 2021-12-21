package com.thought_focus.Morning.Constructor.Constructor_Chaining;

public class Laptop {
	String brand;
	double price;

	public Laptop() {
		this("Dell");
		System.out.println("Calling Default Constructor...");
	}

	public Laptop(String brand) {
		this(40000.00);
		this.brand = brand;
	}

	public Laptop(double price) {
		this.price = price;
	}

	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

}
