package com.listener.testcases;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestCasesListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
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
		
			//ImageIO.write(img, "PNG", new File("D:\\screenshot/screenshootlisteners"+ System.currentTimeMillis()+".PNG"));
			ImageIO.write(img, "PNG", new File("\\testingshastra\\FirstProject\\src\\test\\resources\\Reports/screenshoot"+ "_"+ System.currentTimeMillis()+".PNG"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
