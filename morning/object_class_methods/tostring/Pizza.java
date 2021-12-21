package com.thought_focus.Morning.object_class_methods.tostring;

public class Pizza {

	String name;
	double price;

	public Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + "]";
	}

}
