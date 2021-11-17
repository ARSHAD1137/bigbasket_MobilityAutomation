package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class bigbasketBase {

    public static AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "SM G570F");
        cap.setCapability("udid","42000995e440a3d9");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("app","C:\\Users\\Arshad\\IdeaProjects\\bigbasket_MobilityAutomation\\src\\main\\resources\\bigbasket-6-3-1.apk");
        cap.setCapability("appPackage","com.bigbasket.mobileapp");

        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
    }
}
