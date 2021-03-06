package in.jegan.validator;



import in.jegan.model.Vegetable;


public class VegetableManagerValidator {
	private VegetableManagerValidator()
	{
		//defaultconstructor
	}
	
	public static boolean checkForNullandEmpty(Vegetable vegetable) {
		return (vegetable.getVegetableName()!=null && !vegetable.getVegetableName().trim().equals(""));
	}
	
	public static boolean checkNotNumeric(Vegetable vegetable) {
		return vegetable.getVegetableName().matches("^[a-zA-Z]*$");
	}
    
	public static boolean checkForPriceInvalidNumandNull(Vegetable vegetable)
	{
		return vegetable.getPrice() > 0 && vegetable.getPrice() != 0;
	}
	
	public static boolean checkForQuantityInvalidNumandNull(Vegetable vegetable)
	{
		return (vegetable.getQuantity() > 0 && vegetable.getQuantity() != 0);
	}
}
