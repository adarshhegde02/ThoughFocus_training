package com.thought_focus.Morning.object_class_methods.clone;

public class CloneMethodTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Shoes puma = new Shoes("Puma", 2000);
		Shoes copy = (Shoes) puma.clone();

		System.out.println(puma.equals(copy));
	}

}
