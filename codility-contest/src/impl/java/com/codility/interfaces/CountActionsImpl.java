package com.codility.interfaces;

import com.codility.base.modal.Animal;
import com.codility.factory.GenericBirdFactory;

public class CountActionsImpl implements CountActions {
	
	//Actions -	strAction :: ActionWalk, ActionFly, ActionSwim, ActionSing
	public String[] countActions(Animal[] animals, String strAction){
		//	Return type: True count, False Count, True Matching Animals, False Matching Animals
		String[] strActions = new String[4];
		int intTrueCount = 0;
		int intFalseCount = 0;
		String strTrueMatchAnimals = "";
		String strFalseMatchAnimals = "";
		try {
			//for each animals
			for(Animal obj:animals){				
				// check for conditions
				if(Animal.class.getMethod("is"+strAction).invoke(obj).toString()
							.equalsIgnoreCase("true") ){
					intTrueCount += 1;
					if(obj.getClass().getSimpleName().contains("Generic")) {						
						strTrueMatchAnimals += " "+ obj.getName();
					} else {	
						strTrueMatchAnimals += " "+ obj.getClass().getSimpleName();					
					}
				} else {
					intFalseCount += 1;
					if(obj.getClass().getSimpleName().contains("Generic")) {	
						strFalseMatchAnimals += " "+ obj.getName();
					} else {
						strFalseMatchAnimals += " "+ obj.getClass().getSimpleName();
					}	
				}				
			}			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Assign to Array
		strActions[0] =   Integer.toString(intTrueCount);
		strActions[1] =   Integer.toString(intFalseCount);
		strActions[2] =   strTrueMatchAnimals;
		strActions[3] =   strFalseMatchAnimals;
		return strActions;		
	}	
}
