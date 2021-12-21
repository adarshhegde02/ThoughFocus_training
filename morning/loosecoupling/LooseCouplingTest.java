package com.thought_focus.Morning.loosecoupling;

public class LooseCouplingTest {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		Axis axis = new Axis();

		Atm atm = new Atm();
		atm.reader(axis);

	}

}
