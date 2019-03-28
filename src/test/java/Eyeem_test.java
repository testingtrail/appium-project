/*
Created by: Jorge Quiros
Last modified date: 03-27-2019
Description: Class with the test files to run
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Utils;

import java.net.MalformedURLException;
import java.net.URL;

public class Eyeem_test {

    //create appium driver
    AppiumDriver<WebElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        //to use another emulator run 'adb devices' and get the real name to put here
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, Utils.loadProperties().getProperty("deviceName"));

        // This package name of your app (you can get it from apk info app)
        cap.setCapability("appPackage", Utils.loadProperties().getProperty("Package"));

        // This is Launcher activity of your app (you can get it from apk info app)
        cap.setCapability("appActivity", Utils.loadProperties().getProperty("Activity"));

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, Utils.loadProperties().getProperty("androidVersion"));

        //If using AVD emulator, uncomment this and add the device name
        // cap.setCapability("avd","<yourdevicenamehere>");

        //Clear files after running
        cap.setCapability("clearSystemFiles", true);

        //Linking the capabilities to Appium
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }


    @Test(testName = "Swipe Screens", priority =  0)
    public void SimpleTest() throws InterruptedException {
        //assert if the driver loaded
        Assert.assertNotNull(driver.getContext());

        //Swipe different onboarding views
        Thread.sleep(2000);
        TouchAction ts = new TouchAction(driver);
        for(int i=1;i<=3;i++) {
            ts.press(PointOption.point(800, 800))
                    .moveTo(PointOption.point(200, 800))
                    .release().perform();
            Thread.sleep(2000);
        }

    }

    @Test(testName = "Check partner logos", priority =  1)
    public void SimpleTest2() throws InterruptedException {
        WebElement element;

        // Airbnb
        element = driver.findElementByAccessibilityId("brands onboarding view - first logo");
        assert element.isDisplayed():"Element is not displayed";

        // Gettyimages
        element = driver.findElementByAccessibilityId("brands onboarding view - second logo");
        assert element.isDisplayed():"Element is not displayed";

        // Spotify
        element = driver.findElementByAccessibilityId("brands onboarding view - third logo");
        assert element.isDisplayed():"Element is not displayed";
    }

    @AfterClass
    public void Flush(){
        driver.quit();
    }

}
