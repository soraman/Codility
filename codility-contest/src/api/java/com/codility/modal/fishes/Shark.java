package com.codility.modal.fishes;

import com.codility.base.modal.Fish;

public class Shark extends Fish {
	
	// Constructor
	public Shark(){
		this.Size ="Large";
		this.Color ="Grey";
		this.makeJokes = false;
		this.eatOtherFish = true;
	}
	
	@Override
	public String toString() {
		return "Shark [ActionWalk=" + this.ActionWalk + ",ActionFly="+ this.ActionFly 
				+",ActionSwim="+ this.ActionSwim + ",ActionSing="+ this.ActionSing 
				+",Size="+ this.Size + ",Color=" + this.Color+ ",makeJokes="+ this.makeJokes
				+ ",eatOtherFish="+ this.eatOtherFish +"]";
	}

}
