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

public class LoginPage extends bigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/text_login")
    private AndroidElement loginbtn;

    @AndroidFindBy(id = "com.truecaller:id/confirm")
    private AndroidElement cmfbt;

    public void login(){
        loginbtn.click();
    }

    public void confirm() throws InterruptedException {
        cmfbt.click();
        
        Thread.sleep(5000);
        WebElement usericon = driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon"));
        Thread.sleep(2000);
        Assert.assertEquals(true, usericon.isDisplayed());
    }
}
