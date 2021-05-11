package in.jegan.Tester;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.jegan.model.Vegetable;
import in.jegan.service.VegetableManager;


public class AddVegetableManagerTest {

	@Test
	public void testWithValidInput() {
		
		Vegetable vegetable1=new Vegetable("Tomato",50,25);
		Vegetable vegetable2=new Vegetable("Potato",30,15);
		boolean validVegetable1 = VegetableManager.addVegetables(vegetable1);
		boolean validVegetable2 = VegetableManager.addVegetables(vegetable2);
		assertTrue(validVegetable1);
		assertTrue(validVegetable2);
	}
	
	/**
	 * This method is used to check invalid null input list
	 */
	@Test
	public void testWithNullInvalidInput()
	{
		Vegetable vegetable = new Vegetable(null, 50, 25);
		boolean added=VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test empty invalid input in list
	 */
	@Test
	public void testWithInvalidEmptyInput()
	{
		Vegetable vegetable = new Vegetable(" ", 50, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test not numeric value in vegetable name
	 */
	@Test
	public void testForNotNumericInput()
	{
		Vegetable vegetable = new Vegetable("Tomato345", 50, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);

	}
	
	/**
	 * This method is used to test invalid price
	 */
	@Test
	public void testForInvalidPriceInput()
	{
		Vegetable vegetable = new Vegetable("Tomato", -1, 25);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);
	}
	
	/**
	 * This method is used to test invalid quantity value
	 */
	@Test
	public void testForInvalidquantityInput()
	{
		Vegetable vegetable = new Vegetable("Tomato", 50, -1);
		boolean added= VegetableManager.addVegetables(vegetable);
		assertFalse(added);

	}
	
	}


	

