package com.codility.test;

import com.codility.base.modal.Animal;
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
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionTotCount {
	
	public static void main(String[] args) {
		System.out.println("\n Section-E \n");
		
		Animal[] animals = new Animal[]{
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
		
		// Call functions - SolutionTotCount
		CountActions objCountActions = new CountActionsImpl();
		System.out.println("\n Question-1a :: ActionFly \n");
		String[] strArrayobj = objCountActions.countActions(animals, "ActionFly");
		System.out.println("No of Animals which can fly: " + strArrayobj[0]);
		System.out.println("Animals which can fly: " + strArrayobj[2]);
		System.out.println("No of Animals which cannot fly: " + strArrayobj[1]);
		System.out.println("Animals which cannot fly: " + strArrayobj[3]);
		
		System.out.println("\n Question-1b :: ActionWalk \n");
		strArrayobj = objCountActions.countActions(animals, "ActionWalk");
		System.out.println("No of Animals which can walk: " + strArrayobj[0]);
		System.out.println("Animals which can walk: " + strArrayobj[2]);
		System.out.println("No of Animals which cannot walk: " + strArrayobj[1]);
		System.out.println("Animals which cannot walk: " + strArrayobj[3]);
		
		System.out.println("\n Question-1c :: ActionSing \n");
		strArrayobj = objCountActions.countActions(animals, "ActionSing");
		System.out.println("No of Animals which can sing: " + strArrayobj[0]);
		System.out.println("Animals which can sing: " + strArrayobj[2]);
		System.out.println("No of Animals which cannot sing: " + strArrayobj[1]);
		System.out.println("Animals which cannot sing: " + strArrayobj[3]);
		
		System.out.println("\n Question-1d :: ActionSwim \n");
		strArrayobj = objCountActions.countActions(animals, "ActionSwim");
		System.out.println("No of Animals which can swim: " + strArrayobj[0]);
		System.out.println("Animals which can swim: " + strArrayobj[2]);
		System.out.println("No of Animals which cannot swim: " + strArrayobj[1]);
		System.out.println("Animals which cannot swim: " + strArrayobj[3]);
		
	}

}
