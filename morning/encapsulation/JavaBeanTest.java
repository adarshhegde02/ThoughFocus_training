package com.thought_focus.Morning.encapsulation;

public class JavaBeanTest {
	public static void main(String[] args) {

		Camera camera = new Camera();
		camera.setBrand("Sony");
		camera.setPrice(20000.00);
		camera.setMemoryCapacity(4);
		camera.setType("Digital");

		System.out.println("Name: " + camera.getBrand());
		System.out.println("Price: " + camera.getPrice());
		System.out.println("Memory Capacity: " + camera.getMemoryCapacity() + "gb");
		System.out.println("Type:" + camera.getType());

	}

}
