package com.codility.base.modal;

public class AppConstants {
	
	// Declare all constants required for the project
	
	public static String WALKTEXT ="I am walking";
	public static String FLYTEXT = "I am flying";
	public static String SINGTEXT = "I am singing";	
	
	public static String DUCKSOUND ="Quack, quack";
	public static String CHICKENSOUND = "Cluck, cluck";
	public static String ROOSTERSOUND = "Cock-a-doodle-doo";
	public static String DOGSOUND = "Woof, woof";
	public static String CATSOUND = "Meow";
	public static String PHONESOUND = "Tring, Tring";
	
	//  ActionWalk,  ActionFly,  ActionSwim,  ActionSing, strSoundText
	public static Bird DUCK = new Bird(true,true,true,true,"Quack, quack"); 
	public static Bird CHICKEN = new Bird(true,false,false,true,"Cluck, cluck");
	public static Bird ROOSTER = new Bird(true,false,false,true,"Cock-a-doodle-doo");
	public static Insect CATERPILLAR = new Insect(true,false,false,false,"");
	public static Insect BUTTERFLY = new Insect(true,true,false,false,"");
	public static Fish DOLPHIN = new Fish(false,false,true,false,"");
	public static Insect FROG = new Insect(true,false,true,true,"");
}
