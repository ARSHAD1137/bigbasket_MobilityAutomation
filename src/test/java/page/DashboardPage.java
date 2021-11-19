package page;

import base.BigbasketBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends BigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public DashboardPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/btnAddToBasket")
    private AndroidElement addBtn;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/cartcountView")
    private AndroidElement basketBtn;

    public void addSelectedProduct() throws InterruptedException {
        addBtn.click();
        Thread.sleep(5000);
        basketBtn.click();

        Thread.sleep(3000);
        WebElement moreOption = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        Assert.assertEquals(true, moreOption.isDisplayed());
    }

}
