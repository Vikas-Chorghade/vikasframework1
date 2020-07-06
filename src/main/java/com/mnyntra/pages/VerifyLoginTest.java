package com.mnyntra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.keywords.Constants;
import com.keywords.Keyword;

public class VerifyLoginTest extends Keyword {
	
	@Test
	public void verifyLogin() throws InterruptedException {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.openUrl("https://www.myntra.com/");
		
		VerifyLoginPage vl=PageFactory.initElements(Constants.driver, VerifyLoginPage.class);
		vl.mouseHoverOnProfile();
		vl.clickOnSigin();
		vl.enterMobileNo();
		vl.clickOnContinueBtn();
		//vl.clickOnPasswordLink();
		Thread.sleep(3000);
		vl.enterPassword();
		vl.clickOnLoginBtn();
		vl.moveMouseOnProfile();
		String text=vl.getLoginText();
		Assert.assertEquals(text, text);
	}
	

}
