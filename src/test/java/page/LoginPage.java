package page;

import base.bigbasketBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

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

    public void confirm(){
        cmfbt.click();
    }
}
