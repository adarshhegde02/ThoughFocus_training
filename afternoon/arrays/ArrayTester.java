package com.thought_focus.Afternoon.arrays;

public class ArrayTester {
	public static void main(String[] args) {
		CustomerDetails details = new CustomerDetails("adarsh", 101, "Bangalore");
		CustomerDetails details1 = new CustomerDetails("pramod", 102, "Bangalore");
		CustomerDetails details2 = new CustomerDetails("prasad", 103, "Bangalore");
		CustomerDetails details3 = new CustomerDetails("amrutha", 104, "Bangalore");
		CustomerDetails details4 = new CustomerDetails("sunitha", 105, "Bangalore");
		CustomerDetails details5 = new CustomerDetails("raju", 106, "Bangalore");
		CustomerDetails details6 = new CustomerDetails("suresh", 107, "Bangalore");
		CustomerDetails details7 = new CustomerDetails("mahesh", 108, "Bangalore");
		CustomerDetails details8 = new CustomerDetails("rajesh", 109, "Bangalore");
		CustomerDetails details9 = new CustomerDetails("akash", 110, "Bangalore");

		Customer customer = new Customer();
		customer.addElements(details);
		customer.addElements(details1);
		customer.addElements(details2);
		customer.addElements(details3);
		customer.addElements(details4);
		customer.addElements(details5);
		customer.addElements(details6);
		customer.addElements(details7);
		customer.addElements(details8);
		customer.addElements(details9);
		customer.display();
		customer.update(106, "Swathi");
		customer.display();
	}
}
