package com.codility.modal.insects;

import com.codility.base.modal.Insect;

public class Caterpillar extends Insect{
	
	// Constructor
	public Caterpillar(){
		this.ActionWalk = true;
		this.ActionFly = false;
		this.ActionSwim = false;
		this.ActionSing = false;
		this.strSoundText = "";	
	}

}
