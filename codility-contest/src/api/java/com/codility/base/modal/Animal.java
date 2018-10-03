package com.codility.base.modal;

public class Animal {
	
	protected boolean ActionWalk = true; 
	protected boolean ActionFly = false; 
	protected boolean ActionSwim = false; 
	protected boolean ActionSing = true;
	protected String strSoundText; 
	private String name;
	

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
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	// Method - Walk
	// Input - NA
	// Output - String Text
	public String walk(){
		return AppConstants.WALKTEXT;
		}
}
