package test;

import base.BigbasketBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import page.ReviewDashboardPage;
import page.SearchPage;

public class BigbskTest extends BigbasketBase {

    public static final Logger LOG = LogManager.getLogger(BigbskTest.class);

    @Test(priority = 1)
    public void loginOperation() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        ExtentTest test1 = extent.createTest("Login to bigbasket");
        test1.log(Status.INFO, "Tap on login button");
        LOG.info("Login to bigbasket");
        Thread.sleep(10000);
        login.loginToBigbasket();
        test1.log(Status.PASS, "Successfully login");
    }

    @Test(priority = 2)
    public void comfirmationPop() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        ExtentTest test2 = extent.createTest("Mobile number confirmation");
        test2.log(Status.INFO, "Tap on confirmation button");
        LOG.info("Confirmation of login");
        Thread.sleep(10000);
        login.confirm();
        test2.log(Status.PASS, "Successfully confirmation");
    }

    @Test(priority = 3)
    public void searchForProduct() throws InterruptedException {
        SearchPage searchProduct = new SearchPage(driver);
        ExtentTest test3 = extent.createTest("Search product in search box");
        test3.log(Status.INFO, "Enter product name in search box");
        LOG.info("Search product in bigbasket");
        Thread.sleep(10000);
        searchProduct.search();
        test3.log(Status.PASS, "Get Product in bigbasket");
    }

    @Test(priority = 4)
    public void addToBasket() throws InterruptedException {
        DashboardPage addBasket = new DashboardPage(driver);
        ExtentTest test4 = extent.createTest("Add product in basket");
        test4.log(Status.INFO, "Tap on add button");
        LOG.info("Add product to basket");
        Thread.sleep(10000);
        addBasket.addSelectedProduct();
        test4.log(Status.PASS, "Successfully add to basket");
    }

    @Test(priority = 5)
    public void checkoutFromBasket() throws InterruptedException {
        ReviewDashboardPage check = new ReviewDashboardPage(driver);
        ExtentTest test5 = extent.createTest("Checkout in basket");
        test5.log(Status.INFO, "Tap on checkout button");
        LOG.info("Checkout the product");
        Thread.sleep(10000);
        check.checkout_Selected_Product();
        test5.log(Status.PASS, "Successfully checkout from basket");
    }
}
