package com.thought_focus.Morning.Blocks.StaticBlocks;

public class Fish {
	static String name;
	static double price;

	static {
		System.out.println("Static block called...");
	}

	static void print() {
		System.out.println("Printing fish price...");
	}

	public Fish() {
		name = "Goldfish";
		price = 500.00;
	}

}
