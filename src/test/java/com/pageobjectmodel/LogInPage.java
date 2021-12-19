package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
public WebDriver driver;
public LogInPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='email']")
WebElement login;


public void getLogin() {
	login.click();

login.sendKeys("glinto.elinjikkadan@gmail.com");}



@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")

WebElement passcode;

public void getpasscode() {
	passcode.sendKeys("nopasscode");
	
}

@FindBy(xpath="//button[@name='login']")
WebElement button;
public void getbutton() {
	button.click();
	
}
}