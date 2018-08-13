package com.appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest {
	
	@Test
	 public void testsample() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//capabilities.setCapability(MobileCapabilityType.UDID, "5B86B7C5-5AD8-4201-B604-60B260830AC9");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ "/Apps/Android_v2.6.19.apk");
		capabilities.setCapability("appActivity", "com.as.fieldinspector.ui.activity.SplashActivity");
		AppiumDriver<MobileElement> appium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
}