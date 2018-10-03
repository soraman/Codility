package com.codility.modal.fishes;

import com.codility.base.modal.Fish;

public class Dolphin {
	
	// Clone the property of fishes
	private Fish fish;
		
	// Constructor
	public Dolphin(){					
		try {			
			//clone
			fish = (Fish) (new Fish().clone());
			fish.setSize("Mid-Sized");
			fish.setColor("Black&Grey");
			fish.setEatOtherFish(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Dolphin [ActionWalk=" + this.fish.isActionFly() + ",ActionFly="+ this.fish.isActionFly() 
				+",ActionSwim="+ this.fish.isActionSwim() + ",ActionSing="+ this.fish.isActionSing() 
				+",Size="+ this.fish.getSize() + ",Color=" + this.fish.getColor() 
				+ ",makeJokes="+ this.fish.isMakeJokes() + ",eatOtherFish="+ this.fish.isEatOtherFish() +"]";
	}
	
	
}
