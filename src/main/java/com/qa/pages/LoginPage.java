package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	
	
	
	@FindBy(xpath="//span[contains(text() , 'Country Code *')]")
	WebElement CountryCode;
	
	
	@FindBy(xpath="//span[contains(text() , ' India +91 ')]")
	WebElement Code;
	
	@FindBy(xpath="//input[@name = 'mentor_phone']")
	WebElement mentorphone;
	
	@FindBy(xpath="//button[@name = 'Submit']")
	WebElement Submit;
	
	@FindBy(name="verifyCode")
	WebElement verifyCode;
	
	
	@FindBy(xpath="//button[@name = 'Verify']")
	WebElement Verify;
	
	@FindBy(xpath="//a[@class = 'navbar-brand']")
	WebElement skilLogo;
	
//	@FindBy(xpath="//span[contains(text() , 'Country Code *')]")
//	WebElement CountryCode;
//	
//	@FindBy(xpath="//span[contains(text() , 'Country Code *')]")
//	WebElement CountryCode;
//	
	//Initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean validateSkilImage() {
		return skilLogo.isDisplayed();
	}
	
	
	public void loginPage() {
		CountryCode.click();
		Code.click();
		mentorphone.sendKeys("9704017543");
		Submit.click();
		verifyCode.sendKeys("1234");
		Verify.click();
		
		
		
	}
	
	
	
//	public LoginPage clickonCountryCode()
//	CountryCode.click();
		
	}
	
	
	

