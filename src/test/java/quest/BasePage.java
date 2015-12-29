package quest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BasePage {
	

	public String PAGE_URL;
	public String PAGE_TITLE;
	
	public void loadPage()
	{
		
	}
	
	public void setElementText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
		Assert.assertEquals(element.getAttribute("value"), text);
	
	}
	
	public void clickButton(WebElement element)
	{
		element.click();
	
	}
	

}
