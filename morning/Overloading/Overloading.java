package com.thought_focus.Morning.Overloading;

public class Overloading {
	public static void main(String args[]) {
		Friend friend = new Friend();
		Unknown unknown = new Unknown();

		Human adarsh = new Human();

		adarsh.speak(friend);
		adarsh.speak(unknown);

	}

}
