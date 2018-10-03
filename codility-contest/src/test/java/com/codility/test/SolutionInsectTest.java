package com.codility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;
import com.codility.base.modal.Fish;
import com.codility.factory.GenericBirdFactory;
import com.codility.factory.GenericInsectFactory;
import com.codility.modal.birds.Duck;
import com.codility.modal.birds.Parrot;
import com.codility.modal.birds.Rooster;
import com.codility.modal.fishes.Clownfish;
import com.codility.modal.fishes.Dolphin;
import com.codility.modal.fishes.Shark;
import com.codility.modal.items.Phone;
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionInsectTest {

	// Question - 1
	@Test
    public void testBUTTERFLY() {
		GenericInsectFactory<String> obj1 = new GenericInsectFactory<String>("BUTTERFLY");
		assertEquals(obj1.isActionFly(),true);	
		assertEquals(obj1.isActionSing(),false);
	}	
	
	// Question - 2
	@Test
    public void testSharkClownfish() {
		GenericInsectFactory<String> obj2 = new GenericInsectFactory<String>("CATERPILLAR");
		assertEquals(obj2.isActionWalk(),true);
		assertEquals(obj2.isActionFly(), false);
		obj2.metamorphosis();
		System.out.println("After Metamorphsis Process");
		assertEquals(obj2.isActionWalk(), true);
		assertEquals(obj2.isActionFly(), true);
	}	
	
	
}
