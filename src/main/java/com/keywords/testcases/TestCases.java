package com.keywords.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.xpath.compiler.Keywords;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.keywords.Constants;
import com.keywords.Keyword;
import com.keywords.CoustomeUtils.PropertiesUtil;

public class TestCases {
	private static Logger log = Logger.getLogger(TestCases.class);
	public static String[] parts;
	public static String parent;

	@BeforeTest
	public static void launchBrowser()   {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.clearCookies();
		Keyword.openUrl("https://www.shopclues.com/");
		Keyword.pageLoadTimeOut();
		log.info("Chrome Browser is opened");
		

	}

	@Test(priority = 0)
	public static void verifyLogo() {
		parts=PropertiesUtil.getLocator("verifylogo");
		//Keyword.explicitWait(5,parts[0], parts[1]);
	Constants.webelement=Keyword.isLogoVisible(parts[0], parts[1]);
	if(Constants.webelement.isDisplayed())
	{
		log.info("Brand logo is visible");
	}
	else {
		log.info("Brand logo is not visible");
	}
	Assert.assertTrue(Constants.webelement.isDisplayed(), "Brand logo is visible");
	
	}
	/*
	 * @Test(priority = 4) public static void verify(List<WebElement> element) {
	 * parts = PropertiesUtil.getLocator("headerlist");
	 * Keyword.displayList(parts[0], parts[1]); List<WebElement> al = element; for
	 * (WebElement ele : al) {
	 * 
	 * System.out.println("\t" + ele.getText()); }
	 * 
	 * }
	 */

	

	@Test(priority = 1)
	public void registerToShop() throws InterruptedException   {
		//Thread.sleep(5000);
		parts = PropertiesUtil.getLocator("registerorsigin");
		//Keyword.explicitWait(3,parts[0], parts[1]);
		Keyword.clickOnElement(parts[0], parts[1]);
		//Thread.sleep(5000);
		//Keyword.explicitWait(10);
		//parts = PropertiesUtil.getLocator("cilckonregister");
		//Keyword.clickOnElement(parts[0], parts[1]);
		//Thread.sleep(5000);
		parts = PropertiesUtil.getLocator("entermobno");
		//Keyword.explicitWait(5,parts[0], parts[1]);
		Keyword.enterText(parts[0], parts[1],"9921194982");
		parts = PropertiesUtil.getLocator("enterpwd");
		Keyword.enterText(parts[0], parts[1],"Vikas@1216");
		parts = PropertiesUtil.getLocator("login");
		Keyword.clickOnElement(parts[0], parts[1]);
		//Keyword.explicitWait(5,parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("logintext");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		//Keyword.explicitWait(15,parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), "Hi vikascho");
		
	}
	/*@Test
	public void getShareText() throws InterruptedException {
		Thread.sleep(5000);
		//Keyword.explicitWait(5000);
		parts = PropertiesUtil.getLocator("abc");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		System.out.println(Constants.webelement.getText());
		log.info(Constants.webelement.getText());

	}*/
	
	
	@Test(priority = 2)
	public void closeNotificaton() throws InterruptedException  {
		parts = PropertiesUtil.getLocator("notification");
		//Keyword.explicitWait(5,parts[0], parts[1]);
		Keyword.clickOnElement(parts[0], parts[1]);

	}

	/*@Test(priority = 2)
	public void displayListOfDailyEssential() {
		parts = PropertiesUtil.getLocator("Daily");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("listofdailyessentials");

	}*/

	/*@Test(priority = 3)
	public void searchForProduct() {
		parts = PropertiesUtil.getLocator("searchcomponent");
		Keyword.enterText(parts[0], parts[1], "TShirts");
		parts = PropertiesUtil.getLocator("clickonsearch");
		Keyword.clickOnElement(parts[0], parts[1]);

	}*/

}
