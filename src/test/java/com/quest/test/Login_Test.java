package com.quest.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.quest.test.QuestLoginPage;

@Test
public class Login_Test {
	
	public WebDriver driver;
	public QuestLoginPage questLoginPage;
	public QuestNewRequestPage questNewRequestPage;
	
	@BeforeClass
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		questLoginPage = PageFactory.initElements(driver,QuestLoginPage.class);
		questNewRequestPage = PageFactory.initElements(driver,QuestNewRequestPage.class);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	@BeforeMethod
	
	@AfterMethod
	
	//@Test
	//public void pageLoads()
     //{
		//driver.get(questLoginPage.PAGE_URL);
		//AssertJUnit.assertEquals(driver.getTitle(),questLoginPage.PAGE_TITLE);
     //}
	
	//@Test
	
	//public void filloutEmailFld() throws Exception
    // {
		//driver.get(questLoginPage.PAGE_URL);
		//questLoginPage.setText_emaillogin("za.katie@gmail.com");
		//Thread.sleep(10000L);
		
     //}
	
	//@Test
	
	public void login() throws Exception
     {
		driver.get(questLoginPage.PAGE_URL);
		questLoginPage.setText_emaillogin("za.katie@gmail.com");
		questLoginPage.setText_passowrd("876321Za");
		questLoginPage.click_buttonLogin();
		
		
     }
	
@Test
	
	public void createRequest() throws Exception
     {
       
	login();
	questNewRequestPage.click_NewRequestBtn();
	questNewRequestPage.setText_NewRequestitle("Title");
		
		
     }

    

}
