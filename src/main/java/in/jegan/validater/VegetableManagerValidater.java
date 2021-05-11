package in.jegan.validater;

import in.jegan.model.Vegetable;

public class VegetableManagerValidater {
	
	public static boolean checkForNullandEmpty(Vegetable vegetable) {
		return (!vegetable.vegetableName.equals(null) && vegetable.vegetableName.trim() !="");
	}
	
	public static boolean checkNotNumeric(Vegetable vegetable) {
		return vegetable.vegetableName.matches("^[a-zA-Z]*$");
	}
    
	public static boolean checkForPriceInvalidNumandNull(Vegetable vegetable)
	{
		return vegetable.price > 0 && vegetable.price != 0;
	}
	
	public static boolean checkForQuantityInvalidNumandNull(Vegetable vegetable)
	{
		return vegetable.quantity > 0 && (!vegetable.quantity.equals(null));
	}
}
