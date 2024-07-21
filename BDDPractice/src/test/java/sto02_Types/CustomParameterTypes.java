package sto02_Types;
import io.cucumber.java.ParameterType;
import sto02_Objects.Product_Shoes;
public class CustomParameterTypes 
{
	// There should not be any spaces between two values
	@ParameterType("\"Blue Shoes\"|\"Red Shoes\"")
	public Product_Shoes productValues(String name)
	{
		return new Product_Shoes(name);
	}
}