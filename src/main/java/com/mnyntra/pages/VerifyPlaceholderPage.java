package com.mnyntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyPlaceholderPage {
	
	@CacheLookup
	@FindBy(how=How.CSS,using = "[class=\"desktop-searchBar\"]")
	private WebElement verifymagnifier;
	
	@CacheLookup
	@FindBy(css = "[class=\"myntraweb-sprite desktop-iconSearch sprites-search\"]")
	private WebElement clcikonmagnifier;
	
	
	@FindBy(how=How.XPATH,using = "//span[contains(text(),\"Shoes & Footwear\")]")
	private WebElement getshoestxt;
	
	
	public void enterInMagnifier() {
		verifymagnifier.sendKeys("shoes");
	}
	public void clcikOnMagnifier() {
		clcikonmagnifier.click();
	}
	
	public String getEnteredText()
	{
		String text=getshoestxt.getText();
		return text;
	}
	
	public void enterFormalShoesInMagnifier() {
		verifymagnifier.sendKeys("formal shoes");
		
	}
	
	public void clickOnMagnifierForFromalShoes() {
		clcikonmagnifier.click();
	}
}


