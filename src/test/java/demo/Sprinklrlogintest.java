
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


public class Sprinklrlogintest {


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
	    // 1. Reset App
	    //    Clear application data and restart (Auto-generated)
	    GeneratedUtils.sleep(500);
	    driver.resetApp();
		// 1. Is 'getStarted' visible?
		GeneratedUtils.sleep(500);
		by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
		driver.findElement(by).isDisplayed();

		// 2. Click 'getStarted'
		GeneratedUtils.sleep(500);
		by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
		driver.findElement(by).click();
          Thread.sleep(500);
		// 3. Make a Swipe gesture from ('590','2025') to ('580','2315')
		GeneratedUtils.sleep(500);
		(new TouchAction(driver)).press(PointOption.point(590, 2025))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(580, 2315))
				.release().perform();

//		// 4. Make a Swipe gesture from ('604','2008') to ('593','2301')
//		GeneratedUtils.sleep(500);
//		(new TouchAction(driver)).press(PointOption.point(604, 2008))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(593, 2301))
//				.release().perform();
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("envSwitcher");
//		driver.findElement(by).isDisplayed();
//		// 5. Click 'envSwitcher'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("envSwitcher");
//		driver.findElement(by).click();
//
//		// 6. Type 'Prod' in 'envSwitcher'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("envSwitcher");
//		driver.findElement(by).sendKeys("Prod");

		// 7. Clear 'emailAddress' contents
		GeneratedUtils.sleep(500);
		by = MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
		driver.findElement(by).clear();

		// 8. Click 'emailAddress'
		GeneratedUtils.sleep(500);
		by = MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
		driver.findElement(by).click();

		// 9. Type 'rahul.garg@sprinklr.com' in 'emailAddress'
		GeneratedUtils.sleep(500);
		by = MobileBy.iOSNsPredicateString(
				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
		driver.findElement(by).sendKeys("rahul.garg@sprinklr.com");

		// 10. Click 'continueButton'
		GeneratedUtils.sleep(500);
		by = MobileBy.AccessibilityId("continueButton");
		driver.findElement(by).click();

		// 11. Click 'Sprinklr QA ENV - PROD'
		GeneratedUtils.sleep(500);
		by = By.xpath(
				"//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		driver.findElement(by).click();

		// 12. Is 'Enter Password' visible?
		GeneratedUtils.sleep(500);
		by = MobileBy.AccessibilityId("Enter Password");
		driver.findElement(by).isDisplayed();

		// 13. Click 'Enter Password'
		GeneratedUtils.sleep(500);
		by = MobileBy.AccessibilityId("Enter Password");
		driver.findElement(by).click();

		// 14. Type 'Sprinklr@1234' in 'Enter Password'
		GeneratedUtils.sleep(500);
		by = MobileBy.AccessibilityId("Enter Password");
		driver.findElement(by).sendKeys("Sprinklr@1234");

		// 15. Click 'Log in'
		GeneratedUtils.sleep(500);
		by = MobileBy.AccessibilityId("Log in");
		driver.findElement(by).click();
//		by = MobileBy.AccessibilityId("(555) 564-8583");
//		boolean passed = driver.findElement(by).getText().contains("(555) 564-8583");
//		if (passed) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test Failed");
//		}

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

	private Sprinklrlogintest() {
	};

}
