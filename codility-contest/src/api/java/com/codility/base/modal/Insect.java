package com.codility.base.modal;

public class Insect extends Animal {

	// Constructor
	public Insect(){
		this.ActionWalk = true;
		this.ActionFly = false;
		this.ActionSwim = false;
		this.ActionSing = false;
		this.strSoundText = "";	
	}
	
	// Constructor
	public Insect(boolean ActionWalk, boolean ActionFly, boolean ActionSwim, boolean ActionSing, 
				String strSoundText) {
			this.ActionWalk = ActionWalk;
			this.ActionFly = ActionFly;
			this.ActionSwim = ActionSwim;
			this.ActionSing = ActionSing;
			this.strSoundText = strSoundText;
		}
	
	
	@Override
	public String toString() {
		
		return "Insect [ActionWalk=" + this.ActionWalk + ",ActionFly="+ this.ActionFly 
				+",ActionSwim="+ this.ActionSwim + ",ActionSing="+ this.ActionSing 
				+"]";
	}
	
	
}
