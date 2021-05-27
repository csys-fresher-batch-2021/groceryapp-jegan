package in.jegan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.jegan.exception.RegistrationManagerException;
import in.jegan.model.Registration;
import in.jegan.util.CloseUtil;
import in.jegan.util.ConnectionUtil;

public class RegistrationDAO {
	
	/**
	 * This method is used to add user in database
	 * @param registration
	 */
	public void addUser(Registration registration)
	{

		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtil.getConnection();
			
			String sql = "insert into user_details(userName,password,userMobileNumber,userEmail) values (?,?,?,?)";
			
			pst = connection.prepareStatement(sql);
			
			pst.setString(1, registration.getUserName());
			pst.setString(2, registration.getpassWord());
			pst.setLong(3, registration.getMobileNumber());
			pst.setString(4, registration.getUserEmail());
            pst.executeUpdate();

		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
			throw new RegistrationManagerException("unable to add userdetails");
		} finally
		{
			CloseUtil.close(pst, connection);
		}
	}

}
