package stepdefinitions;
import io.cucumber.java.en.When;
public class CodeReusabilitySteps 
{
	//Cucumber Get Other Steps From Out First Program File So those Steps are Mentioned In Console
	//As we pass String Value in our Feature File Thats why {String}  Mentioned Here
	@When("User login into the application with username {string} and password {string}")
	public void user_login_into_the_application_with_username_and_password(String username, String password) {
	    System.out.println("UserName is: "+username);
	    System.out.println("Password Is: "+password);
	    
	    System.out.println("-----------------------------------");
	}
}
