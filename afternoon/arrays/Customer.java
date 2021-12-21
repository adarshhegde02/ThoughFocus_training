package com.thought_focus.Afternoon.arrays;

public class Customer {
	CustomerDetails[] details = new CustomerDetails[10];
	int index = 0;

	public void addElements(CustomerDetails dt) {
		details[index] = dt;
		index++;
		System.out.println("Customer is added...");
	}

	public void display() {
		for (int i = 0; i < details.length; i++) {
			System.out.println(details[i].getName());
			System.out.println(details[i].getId());
			System.out.println(details[i].getAddress());
		}
	}

	public void update(int id, String name) {
		for (int i = 0; i < details.length; i++) {
			if (details[i].getId() == id) {
				details[i].setName(name);
			}
		}
	}

}
