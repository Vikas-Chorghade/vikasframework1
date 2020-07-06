package com.mnyntra.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.keywords.Constants;

public class UniversalHeaderPage {
	@FindBy(css = "a[class=\"myntraweb-sprite desktop-logo sprites-headerLogo\"]")
	private WebElement verifyMyntralogo;

	@FindBy(css = "a[data-group=\"men\"]")
	private WebElement verifymenlink;

	@FindBy(how = How.CSS, using = "a[style=\"color:#ee5f73;\"]")
	private List<WebElement> countofmenlink;

	@FindBy(css = "a[data-group=\"women\"]")
	private WebElement verifywomenlink;
	
	@FindBy(how=How.CSS,using="[style=\"color:#fb56c1;\"]")
	private List<WebElement> countwomenlink;
	
	@CacheLookup
	@FindBy(how=How.CSS,using="a[data-group=\"kids\"]")
	private WebElement verifykidslink;
	
	@FindBy(how=How.CSS,using="[style=\"color:#f26a10;\"]")
	private List<WebElement> countkidslink; 

	@FindBy(css = "[data-group=\"home-&-living\"]")
	private WebElement verifyhomeandlivinglink;
	
	@FindBy(how=How.CSS,using = "[style=\"color:#f2c210;\"]")
	private List<WebElement> counthomeandlivinglink;
	
	@FindBy(css = "a[data-group=\"essentials\"]")
	private WebElement verifyessentiallink;
	
	@FindBy(how=How.CSS,using = "[style=\"color:#0db7af;\"]")
	private List<WebElement> countessentiallink;
	
    public boolean isLogoDisplayed() {
		return verifyMyntralogo.isDisplayed();

	}

	public void verifyMenLink() {
		Actions action = new Actions(Constants.driver);
		action.moveToElement(verifymenlink).build().perform();

	}

	public int countMenLink() {
		List<WebElement> element = countofmenlink;
		for (WebElement ele : element) {
			ele.getSize();
			Constants.count++;
		}
		return Constants.count;

	}

	public void verifyWomenLink() {
		Actions action=new Actions(Constants.driver);
		action.moveToElement(verifywomenlink).build().perform();

	}
	
	public int countwomenlink() {
		List<WebElement> element = countwomenlink;
		for (WebElement ele : element) {
			ele.getSize();
			Constants.count++;
		}
		return Constants.count;

	}
	
	public void verifyKidsLink() {
		Actions action=new Actions(Constants.driver);
		action.moveToElement(verifykidslink).build().perform();
		
	}
	
	public int  countKidsLink() {
		List<WebElement> element=countkidslink;
		for(WebElement ele:element)
		{
			ele.getSize();
			Constants.count++;
		}
		return Constants.count;

	}
	
	public void verifyHomeAndLivingLink() {
		Actions actions=new Actions(Constants.driver);
		actions.moveToElement(verifyhomeandlivinglink).build().perform();
	}
	
	public int countHomeAndLivingLink() {
		List<WebElement> element=counthomeandlivinglink;
		for(WebElement ele:element)
			{
			ele.getSize();
			Constants.count++;
			}
		return Constants.count++;
				
	}
	
	public void verifyEssentialLink() {
		Actions actions=new Actions(Constants.driver);
		actions.moveToElement(verifyessentiallink);
	}
	public int countEssentialLink() {
		List<WebElement> ele=countessentiallink;
		for(WebElement element:ele)
		{
			element.getSize();
			Constants.count++;
		}
		return Constants.count;
		
		
	}
	
	
}
