package com.quest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import quest.BasePage;

public class QuestLoginPage extends BasePage{
	
	public static final String PAGE_TITLE = "Quest";
	public static final String PAGE_URL = "https://test.questkm.com";
	
	@FindBy(id = "inputEmail" ) WebElement field_Email;
	@FindBy(id = "inputPassword" ) WebElement field_Password;
	@FindBy(css = ".btn.btn-lg.btn-primary.btn-block.btn-login" ) WebElement btn_login;
	
	//String field_Email = "#inputEmail";
	//String field_Password = "#inputPassword";
	//String btn_login = ".btn.btn-lg.btn-primary.btn-block.btn-login";
	
	
	WebDriver driver;
	
	public QuestLoginPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void setText_emaillogin (String text)
	{
		setElementText(field_Email,text);

	}
	
	public void setText_passowrd (String text)
	{
	
	 setElementText(field_Password,text);
	}
	
	public void click_buttonLogin()
	{
		clickButton(btn_login);
		
		
	}
}
