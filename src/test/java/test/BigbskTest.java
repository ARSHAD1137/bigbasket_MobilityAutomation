package test;

import base.bigbasketBase;
import org.testng.annotations.Test;
import page.LoginPage;
import page.SearchPage;
import page.bigbasketPage;

public class BigbskTest extends bigbasketBase {

    @Test(priority = 1)
    public void loginOperation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        Thread.sleep(8000);
        logpage.login();
    }

    @Test(priority = 2)
    public void confirmation() throws InterruptedException {
        LoginPage logpage = new LoginPage(driver);
        Thread.sleep(8000);
        logpage.confirm();
    }

    @Test(priority = 3)
    public void searchOperation() throws InterruptedException {
        SearchPage srch = new SearchPage(driver);
        Thread.sleep(8000);
        srch.search();
    }

    @Test(priority = 4)
    public void addbasket() throws InterruptedException {
        bigbasketPage addbskt = new bigbasketPage(driver);
        Thread.sleep(8000);
        addbskt.add();
    }
}
