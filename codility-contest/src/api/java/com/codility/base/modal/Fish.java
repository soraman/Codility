package com.codility.base.modal;

public class Fish extends Animal {
	
	private String Size;
	
	private String Color;
	
	private boolean makeJokes;
	
	private boolean eatOtherFish;
	
	// Constructor
	public Fish() {
		this.ActionWalk = false;
		this.ActionFly = false;
		this.ActionSwim = true;
		this.ActionSing = false;
		this.strSoundText = "";		
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public boolean isMakeJokes() {
		return makeJokes;
	}

	public void setMakeJokes(boolean makeJokes) {
		this.makeJokes = makeJokes;
	}

	public boolean isEatOtherFish() {
		return eatOtherFish;
	}

	public void setEatOtherFish(boolean eatOtherFish) {
		this.eatOtherFish = eatOtherFish;
	}
	
}
