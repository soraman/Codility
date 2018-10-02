package com.codility.modal.birds;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.codility.base.modal.Bird;

public class Parrot extends Bird{
	
	// Constructor
	public Parrot() {
		this.ActionWalk = true;
		this.ActionFly = true;
		this.ActionSwim = false;
		this.ActionSing = true;
		this.strSoundText = "";
	}
	
	// Constructor
	public Parrot(Object obj) {
		try {
				this.ActionWalk = true;
				this.ActionFly = true;
				this.ActionSwim = false;
				this.ActionSing = true;
				// get sound of passed mammal / bird / item
				Class<? extends Object> c1 = obj.getClass();				
			    Field field = c1.getDeclaredField("SOUNDTEXT");
		        field.setAccessible(true);
			    this.strSoundText = (String) field.get(obj);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
