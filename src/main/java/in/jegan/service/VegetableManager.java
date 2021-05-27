package in.jegan.service;
import java.util.ArrayList;
import java.util.List;

import in.jegan.dao.VegetableDAO;
import in.jegan.exception.DBExceptions;
import in.jegan.exception.ServiceException;
import in.jegan.exception.VegetableManagerException;
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
				VegetableDAO dao=new VegetableDAO();
				dao.addVegetable(vegetable);
				 added=true;
			}
		} catch (DBExceptions | VegetableManagerException e) {
			e.printStackTrace();
			throw new ServiceException("unable to add vegetables");
		}
		return added;
	}
	
	/**
	 * This method is used for display the vegetableList
	 * @return 
	 */
	public static List<Vegetable> showVegetable()
	{
		VegetableDAO dao = new VegetableDAO();
		return dao.showVegetable();
	}
	
	public static boolean deleteVegetable(String vegtableName)
	{
		boolean isDeleted = false;
		Vegetable searchVegetable = null;
	    try {
			VegetableDAO dao = new VegetableDAO();
			List<Vegetable> vegetable = dao.showVegetable();
			for(Vegetable vegetableName : vegetable)
			{
				if(vegetableName.getVegetableName().equalsIgnoreCase(vegtableName))
						
				{
					searchVegetable = vegetableName;
					break;
				}
			}
			if(searchVegetable != null)
			{
				dao.deleteVegetable(searchVegetable);
				vegetableList.remove(searchVegetable);
				isDeleted = true;
			}
			else
			{
				throw new ServiceException("unable to delete vegetable from database");
			}
		} catch (DBExceptions e) {
			e.printStackTrace();
			throw new ServiceException("unable to delete vegetable from database");
		}
		return isDeleted;
	}

}
