package com.thought_focus.Morning.multipleinheritence;

public class Mobile implements VideoPlayer, MusicPlayer {
	public void play() {
		System.out.println("Playing Video...");
	}

}
