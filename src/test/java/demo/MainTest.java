package demo;


import java.lang.Exception;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import io.testproject.sdk.drivers.ios.IOSDriver;


import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MainTest {
	

	 
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		    By by;

			IOSDriver<MobileElement> driver;
			driver = new IOSDriver<>("0bVtGvPXm06pe5wzYqKf5oNUGCRaAKiztWlqbAeZ9Ik", getCapabilities(), "Aparth Pandey");
			// driver.navigate().to("https://example.testproject.io/web/");
			// IOSDriver<MobileElement> driver = new IOSDriver<>(getCapabilities());
			  driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
			  
		    // 1. Reset App
		    //    Clear application data and restart (Auto-generated)
		    GeneratedUtils.sleep(500);
		    driver.resetApp();

		    // 2. Click 'Search'
		    GeneratedUtils.sleep(500);
		    by = MobileBy.AccessibilityId("Search");
		    driver.findElement(by).click();

		    // 3. Type 'Kate' in 'Search'
		    GeneratedUtils.sleep(500);
		    by = MobileBy.AccessibilityId("Search");
		    driver.findElement(by).sendKeys("Kate");

		    // 4. Click 'John Appleseed'
		    GeneratedUtils.sleep(500);
		    by = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
		    driver.findElement(by).click();

		    // 5. Does '(555) 564-8583' contain '(555) 564-8583'?
		    GeneratedUtils.sleep(500);
		    by = MobileBy.AccessibilityId("(555) 564-8583");
		    boolean passed =driver.findElement(by).getText().contains("(555) 564-8583");
		    if (passed) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }

	        driver.quit();

	}
	  
	  public static DesiredCapabilities getCapabilities() {
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		    capabilities.setCapability(MobileCapabilityType.UDID, "2B940AF5-F9B5-4C0D-B6F3-0FE2E90D3F83");
		    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
		    capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.MobileAddressBook");
		  
		    return capabilities;
		  }
	  
	
	private MainTest() {};

}
