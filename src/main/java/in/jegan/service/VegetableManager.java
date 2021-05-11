package in.jegan.service;

import java.util.ArrayList;
import java.util.List;

import in.jegan.model.Vegetable;
import in.jegan.validater.VegetableManagerValidater;


public class VegetableManager {

	private  static List<Vegetable> vegetableList = new ArrayList<Vegetable>();
    
	static
	{
		vegetableList.add(new Vegetable("Tomato", 50, 35));
		vegetableList.add(new Vegetable("Carrot", 35, 25));
		vegetableList.add(new Vegetable("Potato", 25, 15));

		
	}
	
	public static List<Vegetable> getVegetableList() {
		return vegetableList;
	}
    
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
