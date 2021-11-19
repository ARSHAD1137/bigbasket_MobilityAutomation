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

public class LoginPage extends BigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/text_login")
    private AndroidElement loginBtn;

    @AndroidFindBy(id = "com.truecaller:id/confirm")
    private AndroidElement confirmationBtn;

    public void loginToBigbasket(){
        loginBtn.click();
    }

    public void confirm() throws InterruptedException {
        confirmationBtn.click();
        
        Thread.sleep(5000);
        WebElement userIcon = driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon"));
        Assert.assertEquals(true, userIcon.isDisplayed());
    }
}
