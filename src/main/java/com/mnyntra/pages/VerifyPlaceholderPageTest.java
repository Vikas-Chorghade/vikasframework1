package com.mnyntra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.keywords.Constants;
import com.keywords.Keyword;



public class VerifyPlaceholderPageTest extends Keyword {
	@BeforeTest
	public void launchBrowser() {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.openUrl("https://www.myntra.com/");
	}
	@Test(priority = 2)
	public void waitfor() {
		try
		{
		Thread.sleep(3000);
		}
		catch (Exception e) {
		 System.out.println(e);	
		}
	}
	@Test(priority = 1)
	public void verifyMagnifier() {
		VerifyPlaceholderPage vl=PageFactory.initElements(Constants.driver, VerifyPlaceholderPage.class);
		vl.enterInMagnifier();
		vl.clcikOnMagnifier();
		String text=vl.getEnteredText();
		Assert.assertEquals(text, text);
		
	}
	@Test(priority = 3)
	public void checkfunck() {
		VerifyPlaceholderPage vl=PageFactory.initElements(Constants.driver, VerifyPlaceholderPage.class);
		vl.enterFormalShoesInMagnifier();
		vl.clickOnMagnifierForFromalShoes();
		
	}
		

}
