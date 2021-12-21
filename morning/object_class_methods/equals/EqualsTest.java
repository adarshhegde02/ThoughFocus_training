package com.thought_focus.Morning.object_class_methods.equals;

public class EqualsTest {

	public static void main(String[] args) {
		Pencil apsara = new Pencil("Apsara", 5);
		Pencil natraj = new Pencil("Apsara", 5);

		System.out.println(apsara.equals(natraj));

	}

}
