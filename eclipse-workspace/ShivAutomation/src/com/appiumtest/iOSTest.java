package com.appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class iOSTest {
	
	@Test
	 public void testsample() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.UDID, "5B86B7C5-5AD8-4201-B604-60B260830AC9");
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ "/Apps/REALTrans.app");
	
		AppiumDriver<MobileElement> appium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Click on Username and password
		
		//appium.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Vendorly\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeTextField\n")).click();
		//appium.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Vendorly\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeSecureTextField")).click();
		
		//appium.findElement(ByAccessibilityId.id("Password")).click();
		
		// Alternate Method Below
		//MobileElement Password = appium.findElement(ByAccessibilityId.id("Password"));
		//Password.click();
		
		MobileElement User_Name = appium.findElement(By.className("XCUIElementTypeTextField"));
		User_Name.setValue("qa.rt2013+240916@gmail.com");
		MobileElement Password = appium.findElement(By.className("XCUIElementTypeSecureTextField"));
		Password.setValue("Password@2");
		appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"LOGIN\"]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

}
