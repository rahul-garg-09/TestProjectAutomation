
package demo;

import java.lang.Exception;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.Keys;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import io.appium.java_client.MultiTouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class NewSprinklrtest {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		// set timeout for driver actions (similar to step timeout)
		IOSDriver<MobileElement> driver;
		driver = new IOSDriver<>("0bVtGvPXm06pe5wzYqKf5oNUGCRaAKiztWlqbAeZ9Ik", getCapabilities(), "Aparth Pandey");
	 //   driver.navigate().to("https://example.testproject.io/web/");
		// IOSDriver<MobileElement> driver = new IOSDriver<>(getCapabilities());
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		By by;
		boolean booleanResult;
	   
		/////////////
		
		 // 1. Reset App
	    //    Clear application data and restart (Auto-generated)
	    GeneratedUtils.sleep(500);
	    driver.resetApp();

	    // 2. Is 'getStarted' visible?
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
	    driver.findElement(by).isDisplayed();

	    // 3. Click 'getStarted'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
	    driver.findElement(by).click();

	    // 4. Is 'continueButton' visible?
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("continueButton");
	    driver.findElement(by).isDisplayed();

	    // 5. Clear 'emailAddress' contents
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).clear();

	    // 6. Click 'emailAddress'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).click();

	    // 7. Type 'rahul.garg@sprinklr.com' in 'emailAddress'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).sendKeys("rahul.garg@sprinklr.com");

	    // 8. Click 'continueButton'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("continueButton");
	    driver.findElement(by).click();

	    // is visible:
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
	    driver.findElement(by).isDisplayed();
	    // 9. Click 'Sprinklr QA ENV - PROD'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
	    driver.findElement(by).click();
	    
//	    // 4. password field visible?
//	    GeneratedUtils.sleep(500);
//	    by = MobileBy.AccessibilityId("password");
//	    driver.findElement(by).isDisplayed();


	    // 10. Click 'Enter Password'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("password");
	    driver.findElement(by).click();

	    // 11. Type 'Sprinklr@123' in 'Enter Password'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("password");
	    driver.findElement(by).sendKeys("Sprinklr@123");

	    // 12. Click 'signInButton'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("signInButton");
	    driver.findElement(by).click();

		driver.quit();

	}

	public static DesiredCapabilities getCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capabilities.setCapability(MobileCapabilityType.UDID, "2B940AF5-F9B5-4C0D-B6F3-0FE2E90D3F83");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
		capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.sprinklr.spaceapp");

		return capabilities;
	}

	private NewSprinklrtest() {
	};

}
