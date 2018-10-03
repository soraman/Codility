package com.codility.factory;

import java.lang.reflect.Field;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Fish;


public class GenericFishFactory<T> extends Fish{
	//declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public GenericFishFactory(T param){
    	try {
    		this.objReff = param;    		
    		Fish obj = new Fish();
    		Field field= AppConstants.class.getDeclaredField(param.toString());
    		field.setAccessible(true);
    		obj = (Fish) field.get(obj);
    		this.setActionWalk(obj.isActionWalk());
    		this.setActionFly(obj.isActionFly());
    		this.setActionSwim(obj.isActionSwim());
    		this.setActionSing(obj.isActionSing());
    		this.setStrSoundText(obj.getStrSoundText());
    		this.setName(param.toString());
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
