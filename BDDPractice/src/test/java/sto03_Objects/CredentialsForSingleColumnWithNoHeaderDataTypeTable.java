package sto03_Objects;
public class CredentialsForSingleColumnWithNoHeaderDataTypeTable 
{
	private String userName;
	private String password;
	public CredentialsForSingleColumnWithNoHeaderDataTypeTable(String userName, String password) 
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