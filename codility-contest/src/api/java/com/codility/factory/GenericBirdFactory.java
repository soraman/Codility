package com.codility.factory;

import java.lang.reflect.Field;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Bird;

public class GenericBirdFactory<T> extends Bird{
	//declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public GenericBirdFactory(T param){
    	try {
    		this.objReff = param;
    		System.out.println(param.toString());
    		Bird obj = new Bird();
    		Field field= AppConstants.class.getDeclaredField(param.toString());
    		field.setAccessible(true);
    		obj = (Bird) field.get(obj);
    		this.setActionWalk(obj.isActionWalk());
    		this.setActionFly(obj.isActionFly());
    		this.setActionSwim(obj.isActionSwim());
    		this.setActionSing(obj.isActionSing());
    		this.setStrSoundText(obj.getStrSoundText());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }	
}
