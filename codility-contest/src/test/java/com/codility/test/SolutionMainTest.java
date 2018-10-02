package com.codility.test;

import org.junit.Test;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;

public class SolutionMainTest {
	
	// @Autowired
	// private Bird bird;
	
    // Question - 1
	@Test
    public void testSing() {
    	Bird bird = new Bird();
    	assert bird != null; // not null check
    	assert bird.sing() != ""; // not empty string check
    	assert bird.sing() == AppConstants.SINGTEXT; // Check for the exact string match
    }

}
