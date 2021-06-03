package in.jegan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.jegan.dto.CartItemDTO;
import in.jegan.exception.DBExceptions;
import in.jegan.util.CloseUtil;
import in.jegan.util.ConnectionUtil;

public class OrderDetailsDAO {
	
	public void save(CartItemDTO cartItems)
	{
		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtil.getConnection();
			
			String sql ="insert into order_details(vegetableName,price,quantity,totalPrice) values(?,?,?,?)";
			
			pst = connection.prepareStatement(sql);
			
			pst.setString(1, cartItems.getVegetableName());
			pst.setInt(2, cartItems.getVegetablePrice());
			pst.setInt(3, cartItems.getVegetableQuantity());
			pst.setInt(4, cartItems.getTotalPrice());
			
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DBExceptions("unable to add orderDetails");
		}finally
		{
			CloseUtil.close(pst, connection);
		}
		
		
	}

}
