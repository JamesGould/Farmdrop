package techtest.farmdrop.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import techtest.farmdrop.constants.Constants;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AppiumUtil extends Constants {

    public static AppiumDriver driver;
    public final static int IMPLICIT_TIME_SECONDS = 30;
    
    public void init()
    {
    	DesiredCapabilities caps = DesiredCapabilities.iphone();
    }
    
	public static void startApp() throws MalformedURLException {
		driver=new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), getDesiredCapabilitiesForIOS());
	}

	private static Capabilities getDesiredCapabilitiesForIOS() {
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("deviceName", DEVICE_NAME);
		caps.setCapability("platformVersion", PLATFORM_VERSION);
		caps.setCapability("browserName", BROWSER_NAME);
		caps.setCapability("platformName", PLATFORM_NAME);
		caps.setCapability("app", APP_PATH);
//		caps.setCapability("bundleId", BUNDLE_ID);
//		caps.setCapability("processArguments", "-testing");
//		caps.setCapability("udid", UDID_ID);
		caps.setCapability("fullReset", true);
//		caps.setCapability("automationName", "XCUITest");
		
		return caps;
	}
	
	public static Boolean checkElementDisplayed(IOSElement element)
    {
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try 
        {
        	Boolean b = element.isDisplayed();
        	driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME_SECONDS, TimeUnit.SECONDS);
        	return b;
        } 
        catch (Exception e) 
        {
        	driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME_SECONDS, TimeUnit.SECONDS);
        	return false;
        }        
    }
	
	public static IOSElement waitUntillTappable(IOSElement element)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 return element;
	}	
	
}