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

public class SearchPage extends BigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/searchView")
    private AndroidElement searchBox;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[3]")
    private AndroidElement searchIcon;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/unreadChatIcon")
    private AndroidElement userIcon;

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/txtTerm")
    private AndroidElement productName;

    public void search() throws InterruptedException {
        userIcon.click();
        Thread.sleep(3000);
        searchIcon.click();
        Thread.sleep(3000);
        searchBox.sendKeys("egg");
        Thread.sleep(3000);
        productName.click();

        Thread.sleep(3000);
        WebElement addToBasketButton = driver.findElement(By.id("com.bigbasket.mobileapp:id/btnAddToBasket"));
        Assert.assertEquals(true, addToBasketButton.isDisplayed());
    }
}
