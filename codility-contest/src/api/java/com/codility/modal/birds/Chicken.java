package com.codility.modal.birds;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;

public class Chicken  extends Bird {
	
	public static String SOUNDTEXT = AppConstants.CHICKENSOUND;
	
	// Constructor
	public Chicken() {
		this.ActionWalk = true;
		this.ActionFly = false;
		this.ActionSwim = false;
		this.ActionSing = true;
		this.strSoundText = SOUNDTEXT;
	}

}
