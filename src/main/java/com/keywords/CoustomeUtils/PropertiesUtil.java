package com.keywords.CoustomeUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.keywords.Constants;

public class PropertiesUtil {
	
	static Properties prop = new Properties();

	public static String getProperty(String locatorName) {
		String value = null;
		try {
			String basepath = System.getProperty("user.dir");
			System.out.println("AbsolutePath:"+basepath);
			Constants.fis = new FileInputStream(
					"/testingshastra/FirstProject/src/test/resources/ObjectRepository.properties");
			Constants.prop.load(Constants.fis);
			value = (String) prop.getProperty(locatorName);
			// value = Constants.prop.getProperty(locatorName);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load properties files");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Object Repository not found");
			e.printStackTrace();
		}
		return value;

	}

	public static String[] getLocator(String key) {
		String[] values = null;

		try {
			Constants.fis = new FileInputStream(
					"/testingshastra/FirstProject/src/test/resources/ObjectRepository.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			String part = Constants.prop.getProperty(key);
			values = part.split("##");
			//System.out.println("Locator Type: " + values[0]);
			//System.out.println("Locator Value: " + values[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}
		return values;

	}

	/*public static void main(String[] args) {

		getLocator("email");
	}*/

}
