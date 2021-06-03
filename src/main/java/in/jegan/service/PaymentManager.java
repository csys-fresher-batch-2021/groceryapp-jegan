package in.jegan.service;

import java.util.List;

import in.jegan.dao.OrderDetailsDAO;
import in.jegan.dto.CartItemDTO;

public class PaymentManager {

	
	public int calculateGrossTotal(List<CartItemDTO> cartItems)
	{
		int grossTotal = 0;
		for(CartItemDTO item: cartItems)
		{
			grossTotal = grossTotal + item.getTotalPrice() ;
			OrderDetailsDAO dao = new OrderDetailsDAO();
			dao.save(item);
		}
		return grossTotal;
	}
}
