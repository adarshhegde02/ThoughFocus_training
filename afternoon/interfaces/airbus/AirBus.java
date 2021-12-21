package com.thought_focus.Afternoon.interfaces.airbus;

public class AirBus implements Plane,Bus {
	@Override
	public void takeOff() {
		System.out.println("AirBus is taking off...");
		
	}
	@Override
	public void landing() {
		System.out.println("AirBus is landing...");
		
	}
	@Override
	public void seatings() {
		System.out.println("AirBus seatings...");
		
	}
	@Override
	public void breaks() {
		System.out.println("Applying Breaks...");
		
	}

}
