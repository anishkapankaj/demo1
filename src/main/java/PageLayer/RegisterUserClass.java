package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WaitClass;

public class RegisterUserClass extends BaseClass{
	
	@FindBy(name="register[email]")
	private WebElement email;
	
	@FindBy(name="register[first_name]")
	private WebElement name;

	@FindBy(name="register[last_name]")
	private WebElement lname;
	
	@FindBy(name="register[address1]")
	private WebElement add1;
	
	@FindBy(name="register[address2]")
	private WebElement add2;
	
	@FindBy(name="register[city]")
	private WebElement city;
	
	@FindBy(name="register[postal_code]")
	private WebElement code;
	
	@FindBy(name="register[country]")
	private WebElement country;
	
	@FindBy(name="register[state]")
	private WebElement state;
	
	
	public RegisterUserClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validationRegistration(String Email, String Fristname, String Lastname, String Add1,
			String Add2,String City, String Code, String Country, String State)
	{
		WaitClass.sendKeys(email,Email);
		WaitClass.sendKeys(name,Fristname);
		WaitClass.sendKeys(lname, Lastname);
		WaitClass.sendKeys(add1, Add1);
		WaitClass.sendKeys(add2, Add2);
		WaitClass.sendKeys(city, City);
		WaitClass.sendKeys(code, Code);
		WaitClass.sendKeys(country, Country);
		WaitClass.sendKeys(state, State);
		
	}
}
