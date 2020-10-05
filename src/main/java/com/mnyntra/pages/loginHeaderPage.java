package com.mnyntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.keywords.Constants;
import com.keywords.Keyword;

public class loginHeaderPage extends Keyword {
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	private WebElement mouse;

	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	private WebElement signIn;

	@FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	private WebElement logo;

	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	private WebElement mobileTextField;

	@FindBy(xpath = "//div[@class='submitBottomOption']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	private WebElement logInPasswordEnter;
	
	@FindBy(xpath="//button[contains(@class,'lg block submitButton')]")
	private WebElement clickOnLoginBtn;

	public void mouseHoverOnProfile() {
		Actions action = new Actions(Constants.driver);
		action.moveToElement(mouse).perform();

	}

	public void clickOnSignBtn() {
		signIn.click();
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();

	}

	public void logIn() {
		mobileTextField.sendKeys("7387503935");
	}

	public void clickOnContinueBtn() {
		continueBtn.click();
	}

	public void logInPasswordEnter() {
		logInPasswordEnter.sendKeys("@Shailesh$1234");
	}
	public void clickOnLogInBtn() {
		clickOnLoginBtn.click();

	}
	



}
