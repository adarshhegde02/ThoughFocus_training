package com.thought_focus.Morning.encapsulation;

public class Camera {

	private String brand;
	private double price;
	private String type;
	private int memoryCapacity;

	public Camera() {

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

}
