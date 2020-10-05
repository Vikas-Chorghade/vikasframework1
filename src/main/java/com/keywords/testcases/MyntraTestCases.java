package com.keywords.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.keywords.Constants;
import com.keywords.Keyword;
import com.keywords.CoustomeUtils.PropertiesUtil;
import com.userexception.UserDefinedexception;
@Listeners({com.listener.testcases.TestCasesListener.class})
public class MyntraTestCases {

	private static Logger log = Logger.getLogger(MyntraTestCases.class);
	public static String[] parts;
	public static String parent;
	 UserDefinedexception obj=new UserDefinedexception();
	 
	@BeforeTest
	public static void launchBrowser() {
		Keyword.openBrowser("Chrome");
		Keyword.maximizeBrowser();
		Keyword.clearCookies();
		Keyword.openUrl("https://www.myntra.com/");
		Keyword.pageLoadTimeOut();
		log.info("Chrome Browser is opened");

	}

	@Test(priority = 0)
	public static void verifyLogo()  {
		parts = PropertiesUtil.getLocator("verifyMyntralogo");
		// Keyword.explicitWait(5, parts[0], parts[1]);
		Constants.webelement = Keyword.isLogoVisible(parts[0], parts[1]);
		if (Constants.webelement.isDisplayed()) {
			log.info("Brand logo is visible");
		} else {
			log.info("Brand logo is not visible");
		}
		//Keyword.getScreenshort("verifyLogo");
		//Assert.assertEquals("hello", "hi");
		Assert.assertTrue(Constants.webelement.isDisplayed(), "Brand logo is visible");
		
	}
	
	
	/*@Test(priority = 1)
	public void loginOrSignup() throws InterruptedException {
		parts = PropertiesUtil.getLocator("clickonprofile");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("login");
		Keyword.clickOnElement(parts[0], parts[1]);
		
		parts = PropertiesUtil.getLocator("mobileno");
		Keyword.enterText(parts[0], parts[1], "9921194982");
		parts = PropertiesUtil.getLocator("submit");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonpwdlink");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.enterText("XPATH", PropertiesUtil.getProperty("enterpassword"), "Vikas@12345");
		//Keyword.enterText("XPATH", "//input[@class='form-control has-feedback']", "Vikas@12345");
		//parts =PropertiesUtil.getLocator("enterpassword");
		//Keyword.enterText(parts[0], parts[1], "@Shailesh$1234");
		parts = PropertiesUtil.getLocator("clickonloginbtn");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts=PropertiesUtil.getLocator("logintext");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		System.out.println(Constants.webelement.getText());
		
		Assert.assertEquals(Constants.webelement.getText(), "Hi vikascho");
	}

/*	@Test
	public void verifySearch() {
		parts = PropertiesUtil.getLocator("verifymagnifier");
		Keyword.enterText(parts[0], parts[1], "shoes");
		parts = PropertiesUtil.getLocator("clickonmagnifier");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getshoestxt");
		Constants.webelement = Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), "Shoes & Footwear");
		
		}*/

	/*	@Test(priority = 1)
		public void verifyMenLink() {
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("countofmenlink");
		Constants.count = Keyword.displayList(parts[0], parts[1]);
		//Assert.assertTrue(Constants.count < 15, "is less than 15");

	}

	@Test(priority = 2)
	public void verifyWomenLink() {
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("countwomenlink");
		Constants.count = Keyword.displayList(parts[0], parts[1]);
		Assert.assertTrue(Constants.count >= 15, "is equal to 14");
	}

	@Test(priority = 3)
	public void verifyKidsLink() {
		parts = PropertiesUtil.getLocator("verifykidslink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("countkidslink");
		Constants.count = Keyword.displayList(parts[0], parts[1]);
		Assert.assertTrue(Constants.count >= 8, "is equal to 8");

	}

	@Test(priority = 4)
	public void verifyhomeAndLivingLink() {
		parts = PropertiesUtil.getLocator("home&livinglink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("counthomelink");
		Constants.count = Keyword.displayList(parts[0], parts[1]);
		Assert.assertTrue(Constants.count >= 10, "is  equal to 10");
	}

	@Test(priority = 5)
	public void verifyEssentialsLink() {
		parts = PropertiesUtil.getLocator("verifyessentialslink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("countessentiallink");
		Constants.count = Keyword.displayList(parts[0], parts[1]);
		Assert.assertTrue(Constants.count >= 9, "is equal to 9");

	}*/

	/*@Test
	public void verifyMenFilterCategoriesCheckbox() {
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickontshirt");
		Keyword.waitForElementToInteractable(3, parts[0], parts[1]);
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickoncheckbox");
		Keyword.waitForElementToInteractable(3, parts[0], parts[1]);
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getcounttext");
		Constants.webelement = Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());

	}*/

	/*@Test
	public void verifyMenFilterSelectBrand() {
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickontshirt");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clickonpumabrand");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getcounttext");
		Constants.webelement = Keyword.getTextOfElement(parts[0], parts[1]);
		System.out.println(Constants.webelement.getText());
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());

	}*/
	
	/*@Test
	public void  verifyMenFilterSelectPrice() {
		int price=179;
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickontshirt");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clickonprice");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("pricecount");
		Constants.count=Keyword.displayList(parts[0], parts[1]);
		Assert.assertTrue(Constants.count>price,"should be greater than 179");
	
	}
	@Test
	public void verifyMenFilterSelectColour() {
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickontshirt");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clickoncolor");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("gettextblack");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());
		
		}
	
	@Test
	public void verifyMenFilterSelectDiscount() throws InterruptedException {
		parts = PropertiesUtil.getLocator("verifymenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickontshirt");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clickondiscount");
		Keyword.clickOnElement(parts[0], parts[1]);
		
		/*
		  parts = PropertiesUtil.getLocator("gettextblack");
		  Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		 Assert.assertEquals(Constants.webelement.getText(),
		  Constants.webelement.getText());
		 */
	
		/*}*/
	/*@Test
	public void verifyWomenFilterSelectCategeories() {
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtasandsuites");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtachkbx");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getkurtistxt");
		Constants.webelement= Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());
	}
	
	@Test
	public void verifyWomenFilterSelectBrand() {
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtasandsuites");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clkonAnoukbrand");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getanouktext");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());
		
	}
	@Test
	public void verifyWomenFilterSelectPrice() {
		int price=15805;
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtasandsuites");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clkonprice");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("gettxtofprc");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertTrue(Constants.count>=price,"should be greater than  or equal to 15805");
		
	}
	@Test
	public void verifyWomenFilterSelectColour(){
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtasandsuites");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("clkoncolor");
		Keyword.clickOnElement(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("getcolorcnttxt");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());
		
	}
	@Test
	public void verifyWomenFilterSelectDiscount() {
		parts = PropertiesUtil.getLocator("verifywomenlink");
		Keyword.mouseHover(parts[0], parts[1]);
		parts = PropertiesUtil.getLocator("clickonkurtasandsuites");
		Keyword.clickOnElement(parts[0], parts[1]);
		Keyword.pageScroll();
		parts = PropertiesUtil.getLocator("getdicounttxt");
		Constants.webelement=Keyword.getTextOfElement(parts[0], parts[1]);
		Assert.assertEquals(Constants.webelement.getText(), Constants.webelement.getText());
		
	}*/
	@Test
	public void EnterIn() {
		// TODO Auto-generated method stub

	}

}
