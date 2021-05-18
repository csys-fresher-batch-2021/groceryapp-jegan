package in.jegan.test;



import static org.junit.Assert.assertNull;

import org.junit.Test;

import in.jegan.model.Vegetable;
import in.jegan.service.VegetableManager;

public class ShowVegetableManagerTest {

	/**
	 * This method is used test display vegetable list
	 */
	@Test
	public void showVegetables()
	{
		Vegetable vegetable1 = new Vegetable("Tomato", 50, 25);
		Vegetable vegetable2 = new Vegetable("Potato",30,15);
		VegetableManager.addVegetables(vegetable1);
		VegetableManager.addVegetables(vegetable2);
	    VegetableManager.showVegetable();
	   	assertNull(null);	
	}
}
