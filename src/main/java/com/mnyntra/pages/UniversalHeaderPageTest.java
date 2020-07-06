package com.mnyntra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.keywords.Constants;
import com.keywords.Keyword;

public class UniversalHeaderPageTest extends Keyword {
	@BeforeTest
	public void launchBrowser() {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.openUrl("https://www.myntra.com/");
	}
		@Test
		public void verifyLogo()
		{
		UniversalHeaderPage uh = PageFactory.initElements(Constants.driver, UniversalHeaderPage.class);
		if (uh.isLogoDisplayed()) {
			System.out.println("logo is visible");
		} else {
			System.err.println();
		}
		Assert.assertTrue(uh.isLogoDisplayed(), "logo is not visible");

	}

	@Test
	public void verifyMenLinkAll() {
		UniversalHeaderPage uh = PageFactory.initElements(Constants.driver, UniversalHeaderPage.class);
		uh.verifyMenLink();
		int list = uh.countMenLink();
		Assert.assertTrue(list >= 14, "Link is less than 15");
	}
	@Test
	 public void verifyWomenLink() {
		UniversalHeaderPage uh=PageFactory.initElements(Constants.driver, UniversalHeaderPage.class);
		uh.verifyWomenLink();
		int count=uh.countwomenlink();
		Assert.assertTrue(count>=14, "Less than 15");
		}
	
	@Test
	public void VerifyKidsLink() {
	
		UniversalHeaderPage uh=PageFactory.initElements(Constants.driver, UniversalHeaderPage.class);
		uh.verifyKidsLink();
		int count=uh.countKidsLink();
		Assert.assertTrue(count>=8, "Equal to 8");
		
	}
	@Test
	public void VerifyHomeandLivingLink() {
		UniversalHeaderPage uh=PageFactory.initElements(Constants.driver,UniversalHeaderPage.class);
		uh.verifyHomeAndLivingLink();
		int count=uh.countHomeAndLivingLink();
		Assert.assertTrue(count>=10, "Equal to 10");
		
	}
	
	@Test
	public void VerifyEssentialLink() {
		UniversalHeaderPage uh=PageFactory.initElements(Constants.driver, UniversalHeaderPage.class);
		uh.verifyEssentialLink();
		int count=uh.countEssentialLink();
		Assert.assertTrue(count>=9, "Equal to 9");
	}

}
