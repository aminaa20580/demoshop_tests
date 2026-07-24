package TestListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;
import utils.ScreenShots;


public class TestNGListeners implements ITestListener {

    private static final Logger log = LoggerFactory.getLogger(TestNGListeners.class);
    ExtentReports extent =  ExtentManager.getInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        test.info("Start Case Start");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed..");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        WebDriver driver1 = ((BaseTest) result.getInstance()).getDriver();
        String screenShotPath =ScreenShots.capture(driver1 ,result.getName());

        try {
            test.addScreenCaptureFromPath(screenShotPath);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+ " Skipped");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution Started");

    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Execution Ended");

    }
}
