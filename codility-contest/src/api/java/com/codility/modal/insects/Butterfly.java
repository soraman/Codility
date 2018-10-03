package com.codility.modal.insects;

import com.codility.base.modal.Insect;

public class Butterfly extends Insect {
	
	// Constructor
	public Butterfly(){
		this.ActionWalk = true;
		this.ActionFly = true;
		this.ActionSwim = false;
		this.ActionSing = false;
		this.strSoundText = "";	
	}

}
