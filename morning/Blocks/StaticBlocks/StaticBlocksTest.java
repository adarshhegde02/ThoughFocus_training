package com.thought_focus.Morning.Blocks.StaticBlocks;

public class StaticBlocksTest {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Fish.print();

		System.out.println("Name: " + fish.name);
		System.out.println("Price: " + fish.price);
	}

}
