package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	public static void selectByVisibleText(WebElement wb, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel = new Select(waitwb);
		
		sel.selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement wb, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel = new Select(waitwb);
		
		sel.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement wb, int value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel = new Select(waitwb);
		
		sel.selectByIndex(value);
	}
	
	public static void getOptions(WebElement wb)
	{
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	     
	     WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
	     
	     Select sel = new Select(waitwb);
	     
	     List<WebElement> ls= sel.getOptions();
		
	     for(WebElement wb1:ls)
	     {
	    	String a =  wb1.getText();
	    	System.out.println(a);
	     }
	}
	
	public static int size(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel = new Select(waitwb);
		
		List<WebElement> ls = sel.getOptions();
		
		int i = ls.size();
		
		return i;
	}
	
//Create static method to select drop down without Select and with WebElement  String argument 	
	public static void selectDropDown(WebElement wb , String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		List<WebElement> waitwb = wait.until(ExpectedConditions.visibilityOfAllElements(wb));
		
		for(WebElement wb1 : waitwb)
		{
			String a = wb1.getText();
			if(a.equalsIgnoreCase(value))
			{
				wb1.click();
				break;
			}
		}	
	}
	
	// create static getFirstSelectedOption() method with WebElement 
	public static String getFirstSelectedOption(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel = new Select(waitwb);
		
		WebElement selwb = sel.getFirstSelectedOption();
		
		String a = selwb.getText();
		
		return a;
	}
}
