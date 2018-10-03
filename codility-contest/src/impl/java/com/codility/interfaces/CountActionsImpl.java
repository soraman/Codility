package com.codility.interfaces;

import com.codility.base.modal.Animal;

public class CountActionsImpl implements CountActions {
	
	//Actions -	strAction :: ActionWalk, ActionFly, ActionSwim, ActionSing
	public String[] countActions(Animal[] animals, String strAction){
		//	Return type: True count, False Count, True Matching Animals, False Matching Animals
		String[] strActions = new String[4];
		try {
				
			int intTrueCount = 0;
			int intFalseCount = 0;
			String strTrueMatchAnimals = "";
			String strFalseMatchAnimals = "";
			
			//for each animals
			for(Animal obj:animals){				
				System.out.println(Animal.class.getMethod("is"+strAction).invoke(obj));				
			}			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strActions;		
	}	
}
