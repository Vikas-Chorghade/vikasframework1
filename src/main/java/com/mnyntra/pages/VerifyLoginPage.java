package com.mnyntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.keywords.Constants;

public class VerifyLoginPage {
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	private WebElement mousehoveronprofile;
	
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	private WebElement mousemoveonprofile;
	
	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	private WebElement signIn;

	
	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	private WebElement mobileTextField;

	@FindBy(xpath = "//div[@class='submitBottomOption']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//div[@class=\"bottomeLink\"]//span[contains(text(),\"Password\")]")
	private WebElement clickonpwdlink;
	
	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	private WebElement logInPasswordEnter;
	
	@FindBy(xpath="//button[contains(@class,'lg block submitButton')]")
	private WebElement clickOnLoginBtn;
	
	@FindBy(css ="[class=\"desktop-infoTitle\"]")
	private WebElement logintext;
	
	
	public void mouseHoverOnProfile() {
		Actions action = new Actions(Constants.driver);
		action.moveToElement(mousehoveronprofile).build().perform();

	}
	
	public void clickOnSigin() {
		signIn.click();
		
	}
	public void enterMobileNo() {
		mobileTextField.sendKeys("9921194982");
	}
	
	public void clickOnContinueBtn() {
		continueBtn.click();
		
	}
	
	public void clickOnPasswordLink() {
		clickonpwdlink.click();

	}
	public void enterPassword() {
		logInPasswordEnter.sendKeys("Vikas@12345");
	}
	
	public void clickOnLoginBtn() {
		clickOnLoginBtn.click();

	}
	public void moveMouseOnProfile() {
		Actions action = new Actions(Constants.driver);
		action.moveToElement(mousemoveonprofile).build().perform();

	}
	
	public String getLoginText() {
		String text=logintext.getText();
		return text;
		
	}
	

}
