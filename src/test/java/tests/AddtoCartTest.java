package tests;



import Pages.LoginPage;
import Pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.ProductListingPage;

public class AddtoCartTest extends CommonClassTest {

    @Test
    public void addPoducttoCartTest()
    {

        LoginPage login = new LoginPage(driver);

        //login.login("sanajas.siddiqui@gmail.com", "insha@17");
        String username = "sanajas.siddiqui@gmail.com";
        String password = "insha@17";

        Assert.assertEquals("Spree Demo Site", driver.getTitle());

        String aProduct = "Ruby on Rails Tote";
        String cCategory = "Bags";

        ProductListingPage page = new ProductListingPage(driver);
        page.addproductstocart(cCategory, aProduct);

        ProductDesPage proddescription = new ProductDesPage(driver);

        Assert.assertTrue(proddescription.isDisplayed());
        System.out.println("product is added"+aProduct);

        ShoppingCartPage ShoppingCartPage = login.login(username,password).addproductstocart(cCategory,aProduct);

        Assert.assertTrue(ShoppingCartPage.isDisplayed());
    }





}
