package in.jegan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.jegan.exception.DBExceptions;
import in.jegan.util.CloseUtil;
import in.jegan.util.ConnectionUtil;

public class LoginDAO {
	
	/**
	 * This method is used to login using email and password
	 * @param userEmail
	 * @param password
	 * @return
	 */
	public boolean loginDao(String userEmail,String password)
	{
		boolean valid = false;
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection=ConnectionUtil.getConnection();
			String sql="select * from user_details where userEmail=? AND password=?";
			pst=connection.prepareStatement(sql);
			pst.setString(1, userEmail);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				valid = true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DBExceptions("unable to fetch details from database"+e.getMessage());
		}
		 finally {
				CloseUtil.close(pst, connection);
		}
		return valid;

		
	}
	

}
