package com.codility.modal.birds;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;

public class Duck  extends Bird {
	
	public static String SOUNDTEXT = AppConstants.DUCKSOUND;
	
	// Constructor
	public Duck() {
		this.ActionWalk = true;
		this.ActionFly = false;
		this.ActionSwim = true;
		this.ActionSing = true;
		this.strSoundText = SOUNDTEXT;
	}

}
