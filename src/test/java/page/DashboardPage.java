package page;

import base.bigbasketBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

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
    }

}
