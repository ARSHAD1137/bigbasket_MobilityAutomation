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

public class SearchPage extends bigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/searchView")
    private AndroidElement srchBox;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[3]")
    private AndroidElement srchimg;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/txtMsg")
    private AndroidElement txt;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/unreadChatIcon")
    private AndroidElement usrlog;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/txtTerm")
    private AndroidElement text1;

    public void search() throws InterruptedException {
        usrlog.click();
        Thread.sleep(3000);
        srchimg.click();
        Thread.sleep(3000);
        srchBox.sendKeys("egg");
        Thread.sleep(3000);
        text1.click();

        Thread.sleep(3000);
        WebElement addButton = driver.findElement(By.id("com.bigbasket.mobileapp:id/btnAddToBasket"));
        Thread.sleep(2000);
        Assert.assertEquals(true, addButton.isDisplayed());
    }
}
