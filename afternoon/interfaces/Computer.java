package com.thought_focus.Afternoon.interfaces;

public class Computer implements VLCPlayer, Game {
	@Override
	public void play() {
		System.out.println("Music is playing...");

	}

	@Override
	public void pause() {
		System.out.println("Music is paused...");
	}

	@Override
	public void rewind() {
		System.out.println("Music is rewinded...");
	}

	@Override
	public void start() {
		System.out.println("Game is started...");
	}

	@Override
	public void resume() {
		System.out.println("Game is resumed...");
	}

	@Override
	public void restart() {
		System.out.println("Game is restarted...");
	}

}
