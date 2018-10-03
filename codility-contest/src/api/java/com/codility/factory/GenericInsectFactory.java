package com.codility.factory;

import java.lang.reflect.Field;

import com.codility.base.modal.AppConstants;
import com.codility.base.modal.Insect;

public class GenericInsectFactory<T> extends Insect{
	//declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public GenericInsectFactory(T param){
    	try {
    		this.objReff = param;    		
    		Insect obj = new Insect();
    		Field field= AppConstants.class.getDeclaredField(param.toString());
    		field.setAccessible(true);
    		obj = (Insect) field.get(obj);
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
    
    // process - metamorphosis
    // Caterpillar has become Butterfly
    public void metamorphosis(){
    	try {
	    	Insect obj = new Insect();
	    	Field field= AppConstants.class.getDeclaredField("BUTTERFLY");
			field.setAccessible(true);
			obj = (Insect) field.get(obj);
			this.setActionFly(obj.isActionFly());
    	} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
