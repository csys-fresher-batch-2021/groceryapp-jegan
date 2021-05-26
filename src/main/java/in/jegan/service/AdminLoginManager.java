package in.jegan.service;

import java.util.HashMap;
import java.util.Map;

import in.jegan.validator.AdminManagerValidator;

public class AdminLoginManager {
	private AdminLoginManager()
	{
		//default constructor
	}
	
	private static final Map<String, String> adminDetail = new HashMap<>();
	static {
		adminDetail.put("jegan@gmail.com", "Admin@123");
		adminDetail.put("john@gmail.com", "Admin@123");
	}

	/**
	 * This method is used to check whether mobile number and password are correct
	 * 
	 * @param mobileNumber
	 * @param password
	 * @return
	 */

	public static boolean adminLogin(String email, String password) {
		boolean validLogin = false;
		if (AdminManagerValidator.validateUserEmail(email) && AdminManagerValidator.validateUserPassWord(password)
				&& adminDetail.containsKey(email)) {
			String adminPassword = adminDetail.get(email);
			if (adminPassword.equals(password)) {
				validLogin = true;
			}
		}
		return validLogin;
}
}


