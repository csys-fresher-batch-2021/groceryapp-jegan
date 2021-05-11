package in.jegan.model;

public class Vegetable {

	private String vegetableName;
	private Integer price;
	private Integer quantity;
	
	public String getVegetableName()
	{
		return vegetableName;
	}
	
	public void setVegetableName(String vegetableName)
	{
		this.vegetableName = vegetableName;
	}
	
	public Integer getPrice()
	{
		return price;
	}
	
	public void setPrice(Integer price)
	{
		this.price = price;
	}
	
	public Integer getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(Integer quantity)
	{
		this.quantity = quantity;
	}
	public Vegetable(String vegetableName , Integer price , Integer quantity)
	{
		this.vegetableName=vegetableName;
		this.price=price;
		this.quantity=quantity;
	}
    /**
     * This method returns the name of vegetable , price of vegetable and quantity of vegetable
     */
	public String toString()
	{
		return "Vegetable Name : " + vegetableName + " price : "+ "Rs." +price+ " quantity : " + quantity;
	}

}
