package com.codility.base.modal;

public class Bird extends Animal {
		
	// Constructor
	public Bird() {
		this.ActionWalk = true;
		this.ActionFly = true;
		this.ActionSwim = false;
		this.ActionSing = true;
		this.strSoundText = "";		
	}
	// Constructor
	public Bird(boolean ActionWalk, boolean ActionFly, boolean ActionSwim, boolean ActionSing, 
			String strSoundText) {
		this.ActionWalk = ActionWalk;
		this.ActionFly = ActionFly;
		this.ActionSwim = ActionSwim;
		this.ActionSing = ActionSing;
		this.strSoundText = strSoundText;
	}
		
	// Method - fly
	// Input - NA
	// Output - String Text
	public String fly() {		
		return AppConstants.FLYTEXT;
		}
	
	// Method - sing
	// Input - NA
	// Output - String Text
	public String sing() {	
		if(this.getStrSoundText()!= null)
		{		
			return this.getStrSoundText();
		} else {
			return AppConstants.SINGTEXT;
		}	
	}
}
