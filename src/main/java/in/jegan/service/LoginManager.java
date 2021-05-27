package in.jegan.service;

import in.jegan.dao.LoginDAO;
import in.jegan.exception.ServiceException;

public class LoginManager {
	private LoginManager() {
		// default constructor
	}

	public static boolean login(String email, String password) {

		boolean loginDao;
		
		try {
			LoginDAO dao = new LoginDAO();
			loginDao = dao.loginDao(email, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("unable to login");
		}
		
        return loginDao;
	}
}
