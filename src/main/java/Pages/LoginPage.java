package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By loginBut = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By logOutBut = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a");
    By loginButton = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");


    public void userLogIn () {
        click(loginBut);
        type(emailField , "145");
        type(passwordField , "Pa$w0rd!");
        click(loginButton);
    }
    public void logOutButVisible () {
        verifyVisible(logOutBut , "LogOut Button Not Visible");
    }
}
