package com.mnyntra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.keywords.Constants;
import com.keywords.Keyword;


public class logInHeaderTest {
	@Test
	public void signInTest() {
		Keyword.openBrowser("Chrome");
		Keyword.openUrl("https://www.myntra.com/");
		Keyword.maximizeBrowser();
		Keyword.implictWait();

		loginHeaderPage ph = PageFactory.initElements(Constants.driver, loginHeaderPage.class);
		ph.isLogoDisplayed();
		Assert.assertTrue(ph.isLogoDisplayed(), "Logo not visible");

		ph.mouseHoverOnProfile();
		ph.clickOnSignBtn();
		ph.logIn();
		ph.clickOnContinueBtn();
		ph.logInPasswordEnter();
		ph.clickOnLogInBtn();
		
		

	}


}
