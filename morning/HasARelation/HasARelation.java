package com.thought_focus.Morning.HasARelation;

public class HasARelation {
	public static void main(String[] args) {
		Human human = new Human();
		human.heart = new Heart();

		human.name = "Rajesh";
		human.age = 28;
		human.profession = "Driver";

		human.heart.condition = "Healthy";
		human.heart.beating(human.name);
	}

}
