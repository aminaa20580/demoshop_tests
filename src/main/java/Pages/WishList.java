package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishList extends BasePage{
    public WishList(WebDriver driver) {
        super(driver);
    }
    By wishListBut = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a");
    By removeBut = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[1]/input");
    By updateBut = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]");
    By removeText = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div");


    public void verifyWishListPage() {
        click(wishListBut);
        click(removeBut);
        click(updateBut);
        verifyVisible(removeText , "Wishlist Not Empty");
    }
}
