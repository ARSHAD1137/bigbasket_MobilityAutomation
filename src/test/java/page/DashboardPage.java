package page;

import base.bigbasketBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends bigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public DashboardPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/btnAddToBasket")
    private AndroidElement addbtn;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/cartcountView")
    private AndroidElement bskbtn;

    public void add() throws InterruptedException {
        addbtn.click();
        Thread.sleep(5000);
        bskbtn.click();

        Thread.sleep(3000);
        WebElement moreOption = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        Thread.sleep(2000);
        Assert.assertEquals(true, moreOption.isDisplayed());
    }

}
