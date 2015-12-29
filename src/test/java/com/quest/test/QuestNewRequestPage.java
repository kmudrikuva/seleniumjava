package com.quest.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import quest.BasePage;

public class QuestNewRequestPage extends BasePage{
	
	
	
	
	@FindBy(css = ".control.control-newrequest.ng-binding" ) WebElement newrequestBtn;
	@FindBy(css = ".form-control.ng-pristine.ng-untouched.ng-valid" ) WebElement newrequestTitle;
	@FindBy(css = ".f-placeholder.froala-view.froala-element.not-msie.f-basic" ) WebElement newrequestComment;
	
	//String newrequestBtn = ".control.control-newrequest.ng-binding";
	//String newrequestTitle = ".form-control.ng-pristine.ng-untouched.ng-valid";
	//String newrequestComment = ".f-placeholder.froala-view.froala-element.not-msie.f-basic";
	String newrequestResource = "";
	String btnCreate = ".btn.btn-primary.big";
	
     WebDriver driver;
	
	public QuestNewRequestPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setText_NewRequestitle (String text)
	{
		setElementText(newrequestTitle,text);

	}
	
	public void click_NewRequestBtn ()
	{
		clickButton(newrequestBtn);

	}


}
