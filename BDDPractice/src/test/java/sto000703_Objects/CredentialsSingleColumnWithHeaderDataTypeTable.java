package sto000703_Objects;
public class CredentialsSingleColumnWithHeaderDataTypeTable 
{
	private String userName;
	private String password;
	public CredentialsSingleColumnWithHeaderDataTypeTable(String userName, String password) 
	{
		this.userName=userName;
		this.password=password;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}	
}