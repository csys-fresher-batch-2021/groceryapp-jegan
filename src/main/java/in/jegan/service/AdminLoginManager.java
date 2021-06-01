package in.jegan.service;




import in.jegan.dao.LoginDAO;
import in.jegan.exception.ServiceException;

public class AdminLoginManager {
	private AdminLoginManager()
	{
		//default constructor
	}
	
	

	/**
	 * This method is used for admin login
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */

	public static boolean adminlogin(String email, String password) {

		boolean loginDao;
		
		try {
			LoginDAO dao = new LoginDAO();
			loginDao = dao.adminLoginDao(email, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("unable to login");
		}
		
        return loginDao;
	}

}



