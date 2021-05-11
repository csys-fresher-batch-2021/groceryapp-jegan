package in.jegan.model;

public class Vegetable {

	public String vegetableName;
	public Integer price;
	public Integer quantity;
	
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
