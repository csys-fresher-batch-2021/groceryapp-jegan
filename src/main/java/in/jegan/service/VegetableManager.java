package in.jegan.service;
import java.util.ArrayList;
import java.util.List;
import in.jegan.model.Vegetable;
import in.jegan.validator.VegetableManagerValidator;


public class VegetableManager {
	private VegetableManager()
	{
		//defaultconstructor
	}

	private  static final List<Vegetable> vegetableList = new ArrayList<>();
    
	
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
			if(VegetableManagerValidator.checkForNullandEmpty(vegetable) && VegetableManagerValidator.checkNotNumeric(vegetable)  && VegetableManagerValidator.checkForPriceInvalidNumandNull(vegetable) && VegetableManagerValidator.checkForQuantityInvalidNumandNull(vegetable))
			{
				
				vegetableList.add(vegetable);
				 added=true;
			}
			else {
				System.out.println("Validation Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return added;
	}
	
	/**
	 * This method is used for display the vegetableList
	 * @return 
	 */
	public static List<Vegetable> showVegetable()
	{
		return vegetableList;
	}

}
