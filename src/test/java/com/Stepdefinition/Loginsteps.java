package com.Stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.LogInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends Base {
	
	LogInPage lp;

@Given("I am on facebook page")
public void i_am_on_facebook_page() {
   getDriver();
   
   lp=PageFactory.initElements(driver, LogInPage.class);
}

@When("I enter user name")
public void i_enter_user_name() {
    lp.getLogin();
}

@When("I enter password")
public void i_enter_password() {
    lp.getpasscode();
}

@Then("I successfully logged in")
public void i_successfully_logged_in() {
    lp.getbutton();
}



}
