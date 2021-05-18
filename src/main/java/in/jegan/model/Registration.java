package in.jegan.model;

public class Registration {
	
	private String userName;
	private String passWord;
	private Long mobileNumber;
	private String userEmail;
	

	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getpassWord()
	{
		return passWord;
	}
	
	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
    
	public Long getMobileNumber()
	{
		return mobileNumber;
	}
	
	public void setMobileNumber(Long mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	
	public String getUserEmail()
	{
		return userEmail;
	}
	
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	
	public Registration(String userName , String passWord , Long mobileNumber , String userEmail)
	{
		this.userName = userName;
		this.passWord = passWord;
		this.mobileNumber = mobileNumber;
		this.userEmail= userEmail;
	}
	
	public String toString()
	{
		return "UserName : "+ userName +" PassWord : "+ passWord + " MobileNumber : "+mobileNumber + " UserEmail : "+userEmail;
	}

}
