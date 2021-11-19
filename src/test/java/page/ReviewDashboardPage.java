package page;

import base.BigbasketBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ReviewDashboardPage extends BigbasketBase {

    private AndroidDriver<AndroidElement> driver;

    public ReviewDashboardPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.bigbasket.mobileapp:id/txtTitle")
    private AndroidElement checkoutBtn;

    public void checkout_Selected_Product(){
        checkoutBtn.click();
    }
}
