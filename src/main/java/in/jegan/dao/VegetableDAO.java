package in.jegan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.jegan.exception.VegetableManagerException;
import in.jegan.model.Vegetable;
import in.jegan.util.CloseUtil;
import in.jegan.util.ConnectionUtil;

public class VegetableDAO {
	/**
	 * This method is used to add vegetables in database
	 * @param vegetable
	 */
	
	public void addVegetable(Vegetable vegetable)
	 
     {	
			Connection connection = null;
			PreparedStatement pst = null;
			try {
				connection = ConnectionUtil.getConnection();
				
				String sql = "insert into vegetables(VegetableName,price,quantity) values (?,?,?)";
				
				pst = connection.prepareStatement(sql);
				
				pst.setString(1, vegetable.getVegetableName());
				pst.setInt(2, vegetable.getPrice());
				pst.setInt(3, vegetable.getQuantity());
				pst.executeUpdate();
			} catch (SQLException  | ClassNotFoundException e) {
				e.printStackTrace();
				throw new VegetableManagerException("Unable to add vegetable");
			}finally {
				CloseUtil.close(pst, connection);	
		}
     }
	
	/**
	 * This method is used to show vegetables in database
	 * @return
	 */
	public List<Vegetable> showVegetable()
	{
		List<Vegetable> vegetableList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;

		try {
			connection = ConnectionUtil.getConnection();
			String sql = "Select* from vegetables";
			pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				String vegetableName = rs.getString("vegetablename");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				
				Vegetable vegetable = new Vegetable(vegetableName,price,quantity);
				vegetableList.add(vegetable);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally
		{
			CloseUtil.close(pst, connection);
		}
		return vegetableList;
		
	}
	
	/**
	 * This method is used to remove vegetables from database
	 * @param vegetable
	 */
	public void deleteVegetable(Vegetable vegetable)
	{
		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtil.getConnection();
			
			String sql = "delete from vegetables where vegetablename=? AND price=? AND quantity=?";
			
			pst = connection.prepareStatement(sql);
			

			pst.setString(1, vegetable.getVegetableName());
			pst.setInt(2, vegetable.getPrice());
			pst.setInt(3, vegetable.getQuantity());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new VegetableManagerException("Unable to add vegetable");
		} finally
		{
			CloseUtil.close(pst, connection);
		}
	}
}
 
