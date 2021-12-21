package com.thought_focus.Afternoon.interfaces.interfaceexample;

public class Tester {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int ch = 3;
		switch (ch) {
		case 1:
			calculator.addition();
			break;
		case 2:
			calculator.subtraction();
			break;
		case 3:
			calculator.multiplication();
			break;
		case 4:
			calculator.division();
			break;
		case 5:
			calculator.squareRoots();
			break;
		case 6:
			calculator.percentages();
			break;
		case 7:
			calculator.clearScreen();
			break;
		default:
			System.out.println("Invalid Entry...");
		}

	}

}
