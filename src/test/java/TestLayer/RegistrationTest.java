package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterUserClass;

public class RegistrationTest extends BaseClass {

	protected static RegisterUserClass registerUserClass;
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateRegistrationFunctionality()
	{
		 registerUserClass = new RegisterUserClass();
		 registerUserClass.validationRegistration("anishka@gmail.com", "Anishka", "Dahile", "Ravet", "Chinchwad",
				 "Pune", "401501", "India", "Mahashatra");
		
	}
	
	@AfterTest
	public void tearDwon()
	{
		//driver.quit();
	}
}
