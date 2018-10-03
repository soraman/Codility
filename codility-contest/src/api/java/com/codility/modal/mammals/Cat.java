package com.codility.modal.mammals;

import com.codility.base.modal.Animal;
import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;

public class Cat  extends Animal {
	
	public static String SOUNDTEXT = AppConstants.CATSOUND;
	
	// Constructor
	public Cat() {
		this.ActionWalk = true;
		this.ActionFly = false;
		this.ActionSwim = true;
		this.ActionSing = true;
		this.strSoundText = SOUNDTEXT;
	}

}
