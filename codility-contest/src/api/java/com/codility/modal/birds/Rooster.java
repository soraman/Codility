package com.codility.modal.birds;

import com.codility.base.modal.AppConstants;

public class Rooster {
	
	private boolean ActionWalk;  
	private boolean ActionFly; 
	private boolean ActionSwim; 
	private boolean ActionSing; 
	private String strSoundText; 
	
	public static String SOUNDTEXT = AppConstants.ROOSTERSOUND;
	
	
	public boolean isActionWalk() {
		return ActionWalk;
	}

	public void setActionWalk(boolean actionWalk) {
		ActionWalk = actionWalk;
	}

	public boolean isActionFly() {
		return ActionFly;
	}

	public void setActionFly(boolean actionFly) {
		ActionFly = actionFly;
	}

	public boolean isActionSwim() {
		return ActionSwim;
	}

	public void setActionSwim(boolean actionSwim) {
		ActionSwim = actionSwim;
	}

	public boolean isActionSing() {
		return ActionSing;
	}

	public void setActionSing(boolean actionSing) {
		ActionSing = actionSing;
	}

	public String getStrSoundText() {
		return strSoundText;
	}

	public void setStrSoundText(String strSoundText) {
		this.strSoundText = strSoundText;
	}

	// Constructor 
	// Rooster - has Chicken properties. Except the sound.
	public Rooster() {		
		Chicken chicken = new Chicken();
		this.ActionWalk = chicken.isActionWalk();
		this.ActionFly = chicken.isActionFly();
		this.ActionSwim = chicken.isActionSwim();
		this.ActionSing = chicken.isActionSing();
		this.strSoundText = SOUNDTEXT;		
	}
	
	public String sing() {
			return this.getStrSoundText();
	}

}
