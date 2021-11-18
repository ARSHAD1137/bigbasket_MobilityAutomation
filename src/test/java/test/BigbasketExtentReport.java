package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BigbasketExtentReport {

    public ExtentHtmlReporter htmlBigbsktReporter;
    public ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        htmlBigbsktReporter = new ExtentHtmlReporter("C:\\Users\\Arshad\\IdeaProjects\\bigbasket_MobilityAutomation\\extentReport\\extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlBigbsktReporter);
    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }
}
