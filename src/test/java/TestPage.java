import Pages.JewelryPage;
import Pages.LoginPage;
import Pages.WishList;
import TestListeners.TestNGListeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListeners.class)

public class TestPage extends BaseTest {
    @Test
    public void testCase1() {
        driver.get("https://demowebshop.tricentis.com");
        LoginPage page = new LoginPage(driver);
       page.userLogIn();
        page.logOutButVisible();
        JewelryPage page1 = new JewelryPage(driver);
        page1.verifyJewelryPage();
        WishList wishList = new WishList(driver);
        wishList.verifyWishListPage();
    }
}
