package com.thought_focus.Afternoon.arrays;

public class CustomerDetails {
	private String name;
	private String address;
	private int id;

	public CustomerDetails(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}