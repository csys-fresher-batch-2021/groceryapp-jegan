package in.jegan.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.jegan.exception.DBExceptions;


public class CloseUtil {
	
	private CloseUtil()
	{
		//default constructor
	}
	
	public static void close(PreparedStatement pst, Connection con)
	{
		try {
			if(pst!=null && con != null)
			{
				pst.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBExceptions("Can't close connection");
		}
		
	}

}
