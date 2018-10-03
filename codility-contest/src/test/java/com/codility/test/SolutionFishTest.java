package com.codility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;
import com.codility.base.modal.Fish;
import com.codility.factory.GenericBirdFactory;
import com.codility.modal.birds.Duck;
import com.codility.modal.birds.Parrot;
import com.codility.modal.birds.Rooster;
import com.codility.modal.fishes.Clownfish;
import com.codility.modal.fishes.Dolphin;
import com.codility.modal.fishes.Shark;
import com.codility.modal.items.Phone;
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionFishTest {
	
	public static String strFish = "Fish [ActionWalk=false,ActionFly=false,ActionSwim=true,ActionSing=false]";
	public static String strSharkAttributes = "Shark [ActionWalk=false,ActionFly=false,ActionSwim=true,ActionSing=false,Size=Large,Color=Grey,makeJokes=false,eatOtherFish=true]";
	public static String strClownfish = "Clownfish [ActionWalk=false,ActionFly=false,ActionSwim=true,ActionSing=false,Size=Small,Color=Orange,makeJokes=true,eatOtherFish=false]";
	public static String strDolphin = "Dolphin [ActionWalk=false,ActionFly=false,ActionSwim=true,ActionSing=false,Size=Mid-Sized,Color=Black&Grey,makeJokes=false,eatOtherFish=true]";
   
    // Question - 1
	@Test
    public void testFish() {
		Fish fish = new Fish();
		assertEquals(fish.toString(),strFish);
	}	
	
	// Question - 2
	@Test
    public void testSharkClownfish() {
		Shark shark = new Shark();
		assertEquals(shark.toString(),strSharkAttributes);
		Clownfish clownfish = new Clownfish();
		assertEquals(clownfish.toString(),strClownfish);
	}	
	
	// Question-3
	@Test
    public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		assertEquals(dolphin.toString(),strDolphin);
	}
	
}
