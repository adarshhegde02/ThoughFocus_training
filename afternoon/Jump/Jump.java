package com.thought_focus.Afternoon.Jump;

public class Jump {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.println("Unable to print " + i);
				continue;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.println("Unable to print");
				break;
			}
			System.out.println(i);
		}
	}

}
