package com.codility.test;

import com.codility.factory.GenericInsectFactory;

public class SolutionInsect {
	
	public static void main(String[] args) {
		
		System.out.println("\n Section-D \n");
		System.out.println("\n Question-1 \n");
		GenericInsectFactory<String> obj1 = new GenericInsectFactory<String>("BUTTERFLY");
		System.out.println("isActionFly=" + obj1.isActionFly());	
		System.out.println("isActionSound=" + obj1.isActionSing());
		
		System.out.println("\n Question-2 \n");
		GenericInsectFactory<String> obj2 = new GenericInsectFactory<String>("CATERPILLAR");
		System.out.println("isActionWalk=" + obj2.isActionWalk());
		System.out.println("isActionFly=" + obj2.isActionFly());
		obj2.metamorphosis();
		System.out.println("After Metamorphsis Process");
		System.out.println("isActionWalk=" + obj2.isActionWalk());
		System.out.println("isActionFly=" + obj2.isActionFly());
	}

}
