package in.jegan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private ConnectionUtil() {
		// default constructor
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driverClass = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/groceryapp_db";
		String username = "postgres";
		String password = "jegan123";
		Class.forName(driverClass);
		return DriverManager.getConnection(url, username, password);
	}

}
