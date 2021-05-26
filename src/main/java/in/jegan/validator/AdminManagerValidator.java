package in.jegan.validator;

import java.util.regex.Pattern;


public class AdminManagerValidator {
	
	private AdminManagerValidator()
	{
		//default constructor
	}
	
	/**
	 * This method is used to validate Email
	 * @param email
	 * @return
	 */
	public static boolean validateUserEmail(String email)
	{
		boolean checkEmail = false;
		try
		{
			String emailType = "^[a-zA-Z0-9_+&]+@(?:[a-zA-Z0-9-]*+\\.)+[a-zA-Z]{2,7}$";
			boolean checkEmailType = Pattern.matches(emailType,email);
			if(email != null && !email.trim().equals("") && checkEmailType)
			{
				checkEmail = true;
			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return checkEmail;
		
	}
	
	/**
	 * This method is used to validate password
	 * @param password
	 * @return
	 */
	
	public static boolean validateUserPassWord(String password)
	{
		boolean checkPassWord = false;
		try
		{
			String passWordType = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=])(?=\\S+$).{8,}$";
			boolean checkPassWordType = Pattern.matches(passWordType, password);
			if(password != null && !password.trim().equals("") && checkPassWordType)
			{
			    checkPassWord = true;
			   
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return checkPassWord;
		
	}
	

}
