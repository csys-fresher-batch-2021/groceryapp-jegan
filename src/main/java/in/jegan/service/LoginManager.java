package in.jegan.service;

import java.util.List;

import in.jegan.model.Registration;

public class LoginManager {
	private LoginManager() {
		// default constructor
	}

	private static final List<Registration> userList = RegistrationManager.getUserList();

	public static boolean login(String email, String password) {

		boolean isValidUser = false;
		for (Registration user : userList) {
			if (user.getUserEmail().equals(email) && user.getpassWord().equals(password)) {
				isValidUser = true;
				break;
			}
		}
		return isValidUser;

	}
}
