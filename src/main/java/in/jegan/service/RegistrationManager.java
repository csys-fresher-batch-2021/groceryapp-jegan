package in.jegan.service;

import java.util.ArrayList;
import java.util.List;

import in.jegan.model.Registration;
import in.jegan.validator.RegistrationManagerValidator;


public class RegistrationManager {
	
	private RegistrationManager()
	{
		//default constructor
	}
	

	private static final List<Registration> userDetails = new ArrayList<>();
	
	public static List<Registration> getUserList() {
		return userDetails;
	}
    
	
	/**
	 * Adding userDetails to the userDetails list
	 * @param registration
	 * @return
	 */
	public static boolean addUser(Registration registration) {
		boolean validUser = false;
		boolean validUserName = RegistrationManagerValidator.validateUserName(registration);
		boolean validPassword = RegistrationManagerValidator.validateUserPassWord(registration);
		boolean validMobileNumber = RegistrationManagerValidator.validateUserMobileNumber(registration);
		boolean validEmail = RegistrationManagerValidator.validateUserEmail(registration);

		try {
			if (validUserName && validPassword && validEmail && validMobileNumber) 
			{
				userDetails.add(registration);
				validUser = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return validUser;
	}
}
