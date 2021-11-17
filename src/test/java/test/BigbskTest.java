package test;

import base.bigbasketBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import page.ReviewDashboardPage;
import page.SearchPage;

public class BigbskTest extends bigbasketBase {

    @Test(priority = 1)
    public void loginOperation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        ExtentTest test1 = extent.createTest("Login to bigbasket");
        test1.log(Status.INFO, "Tap on login button");

        Thread.sleep(8000);
        logpage.login();

        test1.log(Status.PASS, "Successfully login");
    }

    @Test(priority = 2)
    public void confirmation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        ExtentTest test2 = extent.createTest("Mobile number confirmation");
        test2.log(Status.INFO, "Tap on confirmation button");

        Thread.sleep(8000);
        logpage.confirm();

        test2.log(Status.PASS, "Successfully confirmation");
    }

    @Test(priority = 3)
    public void searchOperation() throws InterruptedException {
        SearchPage srch = new SearchPage(driver);
        ExtentTest test3 = extent.createTest("Search product in search box");
        test3.log(Status.INFO, "Enter product name in search box");

        Thread.sleep(8000);
        srch.search();

        test3.log(Status.PASS, "Get Product in bigbasket");
    }

    @Test(priority = 4)
    public void addbasket() throws InterruptedException {
        DashboardPage addbskt = new DashboardPage(driver);
        ExtentTest test4 = extent.createTest("Add product in basket");
        test4.log(Status.INFO, "Tap on add button");

        Thread.sleep(8000);
        addbskt.add();

        test4.log(Status.PASS, "Successfully add to basket");
    }

    @Test(priority = 5)
    public void checkoutBasket() throws InterruptedException {
        ReviewDashboardPage check = new ReviewDashboardPage(driver);
        ExtentTest test5 = extent.createTest("Checkout in basket");
        test5.log(Status.INFO, "Tap on checkout button");

        Thread.sleep(8000);
        check.checkout();

        test5.log(Status.PASS, "Successfully checkout from basket");
    }
}