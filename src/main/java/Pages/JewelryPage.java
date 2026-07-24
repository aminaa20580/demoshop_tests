package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JewelryPage extends BasePage{
    public JewelryPage(WebDriver driver) {
        super(driver);
    }
    By jewelryBut = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a");
    By product = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a");
    By addWishListBut = By.id("add-to-wishlist-button-14");
    By productAdd = By.xpath("//*[@id=\"bar-notification\"]/p");


    public void verifyJewelryPage () {
        click(jewelryBut);
        click(product);
        click(addWishListBut);
        verifyVisible(productAdd , "Product Not added");
    }
}
