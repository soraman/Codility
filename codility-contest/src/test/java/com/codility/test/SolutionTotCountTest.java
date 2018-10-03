package com.codility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.base.modal.Animal;
import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;
import com.codility.base.modal.Fish;
import com.codility.factory.GenericBirdFactory;
import com.codility.factory.GenericFishFactory;
import com.codility.factory.GenericInsectFactory;
import com.codility.interfaces.CountActions;
import com.codility.interfaces.CountActionsImpl;
import com.codility.modal.birds.Chicken;
import com.codility.modal.birds.Duck;
import com.codility.modal.birds.Parrot;
import com.codility.modal.birds.Rooster;
import com.codility.modal.fishes.Clownfish;
import com.codility.modal.fishes.Dolphin;
import com.codility.modal.fishes.Shark;
import com.codility.modal.insects.Butterfly;
import com.codility.modal.items.Phone;
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionTotCountTest {

	public static Animal[] animals = new Animal[]{
			new Bird(),
			new Duck(),
			new Chicken(),				
			new GenericBirdFactory<String>("ROOSTER"),
			new Parrot(),
			new Fish(),
			new Shark(),
			new Clownfish(),				
			new GenericFishFactory<String>("DOLPHIN"),				
			new GenericInsectFactory<String>("FROG"),
			new Dog(),
			new Butterfly(),
			new Cat()
	};
	
	public static CountActions objCountActions = new CountActionsImpl();
	
	public static String strAnimalsFly = " Bird Parrot Butterfly";
	public static String strAnimalsCannotFly = " Duck Chicken ROOSTER Fish Shark Clownfish DOLPHIN FROG Dog Cat";
	public static String strAnimalsWalk = " Bird Duck Chicken ROOSTER Parrot FROG Dog Butterfly Cat";
	public static String strAnimalsCannotWalk = " Fish Shark Clownfish DOLPHIN";
	public static String strAnimalsSing = " Bird Duck Chicken ROOSTER Parrot FROG Dog Cat";
	public static String strAnimalsCannotSing = " Fish Shark Clownfish DOLPHIN Butterfly";
	public static String strAnimalsSwim = " Duck Fish Shark Clownfish DOLPHIN FROG Dog Cat";
	public static String strAnimalsCannotSwim = " Bird Chicken ROOSTER Parrot Butterfly";

	// Question - 1
	@Test
	public void testActionFly(){		
		String[] strArrayobj = objCountActions.countActions(animals, "ActionFly");
		assertEquals(strArrayobj[0],"3");
		assertEquals(strArrayobj[2], strAnimalsFly);
		assertEquals(strArrayobj[1], "10");
		assertEquals(strArrayobj[3], strAnimalsCannotFly);		
	}
	
	// Question - 2
	@Test
	public void testActionWalk(){
		String[] strArrayobj = objCountActions.countActions(animals, "ActionWalk");
		assertEquals(strArrayobj[0],"9");
		assertEquals(strArrayobj[2], strAnimalsWalk);
		assertEquals(strArrayobj[1],"4");
		assertEquals(strArrayobj[3], strAnimalsCannotWalk);
	}
	
	// Question - 3
	@Test
	public void testActionSing(){
		String[] strArrayobj = objCountActions.countActions(animals, "ActionSing");
		assertEquals(strArrayobj[0],"8");
		assertEquals(strArrayobj[2], strAnimalsSing);
		assertEquals(strArrayobj[1],"5");
		assertEquals(strArrayobj[3], strAnimalsCannotSing);
	}
	
	// Question - 4
	@Test
	public void testActionSwim(){
		String[] strArrayobj = objCountActions.countActions(animals, "ActionSwim");
		assertEquals(strArrayobj[0],"8");
		assertEquals(strArrayobj[2], strAnimalsSwim);
		assertEquals(strArrayobj[1],"5");
		assertEquals(strArrayobj[3], strAnimalsCannotSwim);
	}
	
}
