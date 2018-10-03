package com.codility.modal.fishes;

import com.codility.base.modal.Fish;

public class Clownfish extends Fish {
	
	// Constructor
	public Clownfish(){
		this.Size ="Small";
		this.Color ="Orange";
		this.makeJokes = true;
		this.eatOtherFish = false;
	}
	
	@Override
	public String toString() {
		return "Clownfish [ActionWalk=" + this.ActionWalk + ",ActionFly="+ this.ActionFly 
				+",ActionSwim="+ this.ActionSwim + ",ActionSing="+ this.ActionSing 
				+",Size="+ this.Size + ",Color=" + this.Color+ ",makeJokes="+ this.makeJokes
				+ ",eatOtherFish="+ this.eatOtherFish +"]";
	}

}
