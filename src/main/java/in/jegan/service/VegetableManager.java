package in.jegan.service;

import java.util.ArrayList;

import in.jegan.model.Vegetable;
import in.jegan.validater.VegetableManagerValidater;


public class VegetableManager {

	public  static ArrayList<Vegetable> vegetableList = new ArrayList<Vegetable>();

	/**
	 * This method is used to add vegetables and returns true only the given conditions are true otherwise returns false
	 * @param vegetable
	 * @return
	 */
	public static boolean addVegetables(Vegetable vegetable)
	{
		boolean added = false;
		try {
			if(VegetableManagerValidater.checkForNullandEmpty(vegetable) && VegetableManagerValidater.checkNotNumeric(vegetable)  && VegetableManagerValidater.checkForPriceInvalidNumandNull(vegetable) && VegetableManagerValidater.checkForQuantityInvalidNumandNull(vegetable))
			{
				vegetableList.add(vegetable);
				 added=true;
			}
		} catch (Exception e) {
			added=false;
		}

		return added;
	}


}
