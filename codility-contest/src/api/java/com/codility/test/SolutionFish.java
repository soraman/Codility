package com.codility.test;

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

public class SolutionFish {
	
	public static void main(String[] args) {
		
			System.out.println("\n Section-B \n");
			System.out.println("\n Question-1 \n");
			Fish fish = new Fish();
			System.out.println(fish.toString());
			System.out.println("\n Question-2 \n");
			Shark shark = new Shark();
			System.out.println(shark.toString());
			Clownfish clownfish = new Clownfish();
			System.out.println(clownfish.toString());
			System.out.println("\n Question-3 \n");
			Dolphin dolphin = new Dolphin();
			System.out.println(dolphin.toString());
		}

}
