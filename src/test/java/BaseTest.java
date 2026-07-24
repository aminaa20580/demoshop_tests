import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ExtentManager;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void startReport () {
        extent =ExtentManager.getInstance();
    }

    @BeforeMethod
    public void setUp (Method method) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String testName = method.getDeclaringClass().getSimpleName();
        test = ExtentManager.createTest(testName);
    }
    @AfterMethod
    public void generateResult(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        } else if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        }
        else {
            test.skip("Test Skipped");
        }
//        driver.quit();
    }
    @AfterSuite
    public void endReport() throws IOException {
        // Flush the ExtentReports instance to generate the report
        ExtentManager.flushReport();
    }

}

