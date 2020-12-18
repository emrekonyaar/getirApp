package Method;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractTest {


    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public void initializeTest2() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 3 XL API 30");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("appPackage", "com.getir.casestudy.dev");
        cap.setCapability("appActivity", "com.getir.casestudy.modules.splash.ui.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver, 20);
    }


    protected void sendKeys(By by, String text) throws InterruptedException {
        WebElement element = null;
        try {
            WebElement we = driver.findElement(by);
            we.clear();
            we.sendKeys(text);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

    protected void untilElementAppear(By by) {

        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy (by));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected void click(By by, int... index) throws InterruptedException {
        MobileElement element;
        try {
            element = driver.findElement(by);
            element.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected List<MobileElement> findElements(By by) {
        List<MobileElement> list = null;
        try {
            list = driver.findElements(by);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    protected MobileElement findElement(By by) {
        MobileElement list = null;
        try {
            list = driver.findElement(by);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    protected boolean isElementExist(By by, int timeSeconds) {

        driver.manage().timeouts().implicitlyWait(timeSeconds, TimeUnit.SECONDS);
        boolean isExist = driver.findElements(by).size() > 0;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return isExist;
    }

}
