package com.codility.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;
import com.codility.factory.GenericBirdFactory;
import com.codility.modal.birds.Duck;
import com.codility.modal.birds.Parrot;
import com.codility.modal.birds.Rooster;
import com.codility.modal.items.Phone;
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionBirdTest {
	
    // Question - 1
	@Test
    public void testSing() {
    	Bird bird = new Bird();
    	assert bird != null; // not null check
    	assert bird.sing() != ""; // not empty string check
    	assertEquals(bird.sing(), AppConstants.SINGTEXT);// Check for the exact string match
    }
	
	// Question - 2
	@Test
	public void testDuckChickenSound(){  
		GenericBirdFactory<String> duck = new GenericBirdFactory<String>("DUCK");		
		assert duck.sing() == AppConstants.DUCKSOUND;
		assertEquals(duck.sing(), AppConstants.DUCKSOUND);
		GenericBirdFactory<String> chicken = new GenericBirdFactory<String>("CHICKEN");
		assertEquals(chicken.sing(),AppConstants.CHICKENSOUND);
	}	
	
	// Question-3
	@Test
	public void testRoosterSound(){  
		Rooster objRooster = new Rooster();		
		assertEquals(objRooster.sing(),AppConstants.ROOSTERSOUND);
	}	
	
	// Question-4
	@Test
	public void testParrotDifferentSound(){
		Parrot objParrot = new Parrot(new Dog());
		assertEquals(objParrot.sing(), AppConstants.DOGSOUND);
		
		objParrot = new Parrot(new Cat());
		assertEquals(objParrot.sing(), AppConstants.CATSOUND); 				
				
		objParrot = new Parrot(new Rooster());
		assertEquals(objParrot.sing(), AppConstants.ROOSTERSOUND);  		
		
		objParrot = new Parrot(new Duck());
		assertEquals(objParrot.sing(), AppConstants.DUCKSOUND);  
				
		objParrot = new Parrot(new Phone());
		assertEquals(objParrot.sing(),AppConstants.PHONESOUND); 
	}
}
