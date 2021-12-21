package com.thought_focus.Morning.Blocks.InstanceBlocks;

public class Fish {
	String name;
	double price;

	static {
		System.out.println("Static block called...");
	}

	{
		name = "Goldfish";
		price = 500.00;
		System.out.println("Instance block called...");
	}

}
