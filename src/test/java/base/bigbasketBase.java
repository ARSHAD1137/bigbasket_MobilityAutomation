package base;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import test.BigbasketExtentReport;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bigbasketBase extends BigbasketExtentReport {

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

    @AfterTest
    public void take_screenshot() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();

        File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Arshad\\IdeaProjects\\bigbasket_MobilityAutomation\\screenshots\\"+dateFormat.format(date)+"screenshot.png"));
    }

}
