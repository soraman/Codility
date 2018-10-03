package com.codility.test;

import com.codility.base.modal.Animal;
import com.codility.base.modal.Bird;
import com.codility.base.modal.Fish;
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
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionTotCount {
	
	public static void main(String[] args) {
		System.out.println("\n Section-E \n");
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				// new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				//new Dolphin(),
				//new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
		
		// Call functions
		CountActions objCountActions = new CountActionsImpl();
		objCountActions.countActions(animals, "ActionWalk");
	}

}
