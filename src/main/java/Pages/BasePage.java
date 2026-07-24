package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    protected void click(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }
    protected void type (By by , String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);

    }
    protected void verifyVisible (By by , String message) {
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(by))
                .isDisplayed() , message );
    }
}
