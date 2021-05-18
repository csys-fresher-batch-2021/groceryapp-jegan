package in.jegan.validator;

import java.util.regex.Pattern;

import in.jegan.model.Registration;



public class RegistrationManagerValidator {
	private RegistrationManagerValidator()
	{
		//default constructor
	}
	
	/**
	 * This method is used for validating userName 
	 * @param registration
	 * @return
	 */
	public static boolean validateUserName(Registration registration)
	{
		boolean added= false;
		int noOfCharactersInUserName = 25;
		try
		{
			int userNamelength = getLength(registration.getUserName());
			if(registration.getUserName() != null  && !registration.getUserName().trim().equals("") && userNamelength <= noOfCharactersInUserName)
			{
				added = true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return added;	
	}
    
	/**
	 * This method is used for getting the length of particular String
	 * @param string
	 * @return
	 */
	private static int getLength(String string) {
		return string.length();
	}
    
	/**
	 * This method is used for validating user password
	 * @param registration
	 * @return
	 */
	public static boolean validateUserPassWord(Registration registration)
	{
		boolean checkPassWord = false;
		try
		{
			String passWordType = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=])(?=\\S+$).{8,}$";
			boolean checkPassWordType = Pattern.matches(passWordType, registration.getpassWord());
			if(registration.getpassWord() != null && !registration.getpassWord().trim().equals("") && checkPassWordType)
			{
			    checkPassWord = true;
			   
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return checkPassWord;
		
	}
	
	/**
	 * This method is used for validating user mobileNumber
	 * @param registration
	 * @return
	 */
    public static boolean validateUserMobileNumber(Registration registration)
    {
    	boolean checkMobileNumber = false;
    	try
    	{
    		String mobileNumber = Long.toString(registration.getMobileNumber());
    		String mobileNumberType = "[[0][91]]{1,2}[6-9]{2}[0-9]{8}";
   
    		boolean checkMobileNumberType = Pattern.matches(mobileNumberType, mobileNumber);
    		if(registration.getMobileNumber() != null && !registration.getMobileNumber().toString().trim().equals("") && checkMobileNumberType)
    		{
    			checkMobileNumber = true;
    			
    		}
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
		return checkMobileNumber;
    	
    }
    
    /**
     * This method is used for validating user email
     * @param registration
     * @return
     */
	public static boolean validateUserEmail(Registration registration)
	{
		boolean checkEmail = false;
		try
		{
			String emailType = "^[a-zA-Z0-9_+&]+@(?:[a-zA-Z0-9-]*+\\.)+[a-zA-Z]{2,7}$";
			boolean checkEmailType = Pattern.matches(emailType,  registration.getUserEmail());
			if(registration.getUserEmail() != null && !registration.getUserEmail().trim().equals("") && checkEmailType)
			{
				checkEmail = true;
			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return checkEmail;
		
	}
	

}
