package test;

import base.bigbasketBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import page.ReviewDashboardPage;
import page.SearchPage;

public class BigbskTest extends bigbasketBase {

    public static final Logger LOG = LogManager.getLogger(BigbskTest.class);

    @Test(priority = 1)
    public void loginOperation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        ExtentTest test1 = extent.createTest("Login to bigbasket");
        test1.log(Status.INFO, "Tap on login button");
        LOG.info("Login to bigbasket");

        Thread.sleep(8000);
        logpage.login();

        test1.log(Status.PASS, "Successfully login");
    }

    @Test(priority = 2)
    public void confirmation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        ExtentTest test2 = extent.createTest("Mobile number confirmation");
        test2.log(Status.INFO, "Tap on confirmation button");
        LOG.info("Confirmation of login");

        Thread.sleep(8000);
        logpage.confirm();

        test2.log(Status.PASS, "Successfully confirmation");

        Thread.sleep(5000);
        WebElement usericon = driver.findElement(By.id("com.bigbasket.mobileapp:id/unreadChatIcon"));
        Thread.sleep(2000);
        Assert.assertEquals(true, usericon.isDisplayed());
    }

    @Test(priority = 3)
    public void searchOperation() throws InterruptedException {
        SearchPage srch = new SearchPage(driver);
        ExtentTest test3 = extent.createTest("Search product in search box");
        test3.log(Status.INFO, "Enter product name in search box");
        LOG.info("Search product in bigbasket");

        Thread.sleep(8000);
        srch.search();

        test3.log(Status.PASS, "Get Product in bigbasket");

        Thread.sleep(3000);
        WebElement addButton = driver.findElement(By.id("com.bigbasket.mobileapp:id/btnAddToBasket"));
        Thread.sleep(2000);
        Assert.assertEquals(true, addButton.isDisplayed());

    }

    @Test(priority = 4)
    public void addbasket() throws InterruptedException {
        DashboardPage addbskt = new DashboardPage(driver);
        ExtentTest test4 = extent.createTest("Add product in basket");
        test4.log(Status.INFO, "Tap on add button");
        LOG.info("Add product to basket");

        Thread.sleep(8000);
        addbskt.add();

        test4.log(Status.PASS, "Successfully add to basket");

        WebElement moreOption = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        Thread.sleep(2000);
        Assert.assertEquals(true, moreOption.isDisplayed());
    }

    @Test(priority = 5)
    public void checkoutBasket() throws InterruptedException {
        ReviewDashboardPage check = new ReviewDashboardPage(driver);
        ExtentTest test5 = extent.createTest("Checkout in basket");
        test5.log(Status.INFO, "Tap on checkout button");
        LOG.info("Checkout the product");

        Thread.sleep(8000);
        check.checkout();

        test5.log(Status.PASS, "Successfully checkout from basket");
    }
}
