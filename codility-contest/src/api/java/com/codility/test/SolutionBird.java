package com.codility.test;

import com.codility.base.modal.Bird;
import com.codility.factory.GenericBirdFactory;
import com.codility.modal.birds.Duck;
import com.codility.modal.birds.Parrot;
import com.codility.modal.birds.Rooster;
import com.codility.modal.items.Phone;
import com.codility.modal.mammals.Cat;
import com.codility.modal.mammals.Dog;

public class SolutionBird {
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		System.out.println("\n Section-A \n");
		System.out.println("\n Question-1 \n");
		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing());		
	
		System.out.println("\n Question-2 \n");
		GenericBirdFactory<String> duck = new GenericBirdFactory<String>("DUCK");
		System.out.println(duck.sing());
		GenericBirdFactory<String> chicken = new GenericBirdFactory<String>("CHICKEN");
		System.out.println(chicken.sing());
	        // sgs.printType();
	       
		System.out.println("\n Question-3 \n");
		Rooster objRooster = new Rooster();
		System.out.println("ROOSTER");
		System.out.println(objRooster.sing());   
		
		
		System.out.println("\n Question-4 \n");
		System.out.println("Parrot Lives near Dog");
		Parrot objParrot = new Parrot(new Dog());
		System.out.println(objParrot.sing());  
		
		System.out.println("Parrot Lives near Cat");
		objParrot = new Parrot(new Cat());
		System.out.println(objParrot.sing());   				
		
		System.out.println("Parrot Lives near Rooster");
		objParrot = new Parrot(new Rooster());
		System.out.println(objParrot.sing());   		
		
		System.out.println("Parrot Lives near Duck");
		objParrot = new Parrot(new Duck());
		System.out.println(objParrot.sing());   
		
		System.out.println("Parrot Lives near Phone that rings frequently");
		objParrot = new Parrot(new Phone());
		System.out.println(objParrot.sing());   
		
		
		}

}
