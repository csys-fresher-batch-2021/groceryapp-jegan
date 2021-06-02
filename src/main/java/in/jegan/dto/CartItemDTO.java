package in.jegan.dto;

public class CartItemDTO {

	private String vegetableName;
	private Integer vegetablePrice ;
	private Integer vegetableQuantity ;
	private  Integer totalPrice;

	@Override
	public String toString() {
		return "CartItemDTO [vegetableName=" + vegetableName + ", vegetablePrice=" + vegetablePrice
				+ ", vegetableQuantity=" + vegetableQuantity + ", totalPrice=" + totalPrice + "]";
	}
	public String getVegetableName() {
		return vegetableName;
	}
	public Integer getVegetablePrice() {
		return vegetablePrice;
	}
	public Integer getVegetableQuantity() {
		return vegetableQuantity;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public CartItemDTO(String vegetableName, Integer vegetablePrice, Integer vegetableQuantity, Integer totalPrice) {
		super();
		this.vegetableName = vegetableName;
		this.vegetablePrice = vegetablePrice;
		this.vegetableQuantity = vegetableQuantity;
		this.totalPrice = totalPrice;
	}
	
}
