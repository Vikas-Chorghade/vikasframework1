package com.keywords;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.keywords.testcases.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {

	private static Logger log = Logger.getLogger(Keyword.class);

	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			break;
		case "HtmlUnit":
			HtmlUnitDriver html = new HtmlUnitDriver();
			Constants.driver = new HtmlUnitDriver();
			break;
		default:
			System.out.println("Invalid browser is selected");
			break;
		}
	}

	public static void clearCookies() {
		Constants.driver.manage().deleteAllCookies();

	}

	public static WebElement getWebelement(String locatorType, String locatorValue) {
		WebElement element = null;
		switch (locatorType) {
		case "XPATH":
			element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			element = Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS":
			element = Constants.driver.findElement(By.className(locatorValue));
			break;
		default:
			break;
		}
		return element;

	}

	public static void openUrl(String urlName) {
		Constants.driver.get(urlName);
		log.info("URl is opened");
	}

	public static void maximizeBrowser() {
		Constants.driver.manage().window().maximize();
	}

	public static void navigateBack() {
		Constants.driver.navigate().back();

	}

	public static void navigateForword() {
		Constants.driver.navigate().forward();

	}
	public void moveToParentWindow() {
		String parent=Constants.driver.getWindowHandle();
		Constants.driver.switchTo().window(parent);
	}
	public static void pageLoadTimeOut() {
		Constants.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	public static void implictWait() {
		log.info("wait for 3 seconds");
		Constants.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public static void explicitWait(int duration, String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);

		Object wait = new FluentWait(Constants.driver).withTimeout(duration, TimeUnit.SECONDS)
				.pollingEvery(duration, TimeUnit.SECONDS).withMessage("element is not clickable at this moment")
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void waitForElementToInteractable(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		WebDriverWait wait = new WebDriverWait(Constants.driver, 10);
		element = wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void pageScroll() {
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript("window.scrollBy(0,700)");
	}

	public static String getScreenshort(String testcasename) {
		
		//String basepath=System.getProperty("user.dir")+ "\\TestcaseScreenshot\\" + "_" + System.currentTimeMillis()+ ".PNG";
		//String basepath="/testingshastra/FirstProject/src/main/resources/TestcaseScreenshot" + System.currentTimeMillis() + ".PNG";
		String basepath = "\\testingshastra\\FirstProject\\src\\test\\resources\\Reports/" + testcasename + "_" + System.currentTimeMillis() + ".PNG";
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {
			e1.printStackTrace();
		}

		Rectangle rect = new Rectangle();

		rect.setRect(0, 0, 1600, 700);
		BufferedImage img = robot.createScreenCapture(rect);
		try {

			ImageIO.write(img, "PNG", new File(basepath));

		} catch (IOException e) {

			e.printStackTrace();
		}
		return basepath;

	}

	

	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebelement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public static void clickOnElement(String locatorType, String locatorValue) {
		getWebelement(locatorType, locatorValue).click();
	}

	public static void selectValueFromDropdown(String locatorType, String locatorValue, String textToEnter) {
		WebElement element = getWebelement(locatorType, locatorValue);
		Select select = new Select(element);
		select.selectByVisibleText(textToEnter);

	}

	public static WebElement isLogoVisible(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		return element;

	}

	public static void mouseHover(String locatorType, String locatorValue) {
		WebElement element = getWebelement(locatorType, locatorValue);
		System.out.println(element);
		Actions act = new Actions(Constants.driver);
		act.moveToElement(element).build().perform();
	}

	public static WebElement getTextOfElement(String locatorType, String locatorValue) {
		WebElement element1 = getWebelement(locatorType, locatorValue);
		return element1;

	}

	public static List<WebElement> getListOfWebelements(String locatorType, String locatorValue) {
		List<WebElement> element = null;
		switch (locatorType) {
		case "XPATH":
			element = Constants.driver.findElements(By.xpath(locatorValue));
			break;
		case "CSS":
			element = Constants.driver.findElements(By.cssSelector(locatorValue));
			break;
		case "ID":
			element = Constants.driver.findElements(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			element = Constants.driver.findElements(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element = Constants.driver.findElements(By.partialLinkText(locatorValue));
			break;
		case "CLASS":
			element = Constants.driver.findElements(By.className(locatorValue));
			break;
		default:
			break;
		}
		return element;

	}

	public static int displayList(String locatorType, String locatorValue) {
		List<WebElement> element = getListOfWebelements(locatorType, locatorValue);
		for (WebElement ele : element) {
			ele.getSize();
			Constants.count++;
		}
		return Constants.count;

	}

}
