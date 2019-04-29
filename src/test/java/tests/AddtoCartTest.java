package tests;



import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddtoCartTest extends CommonClassTest {

    @Test
    public void addPoducttoCartTest()
    {

        LoginPage login = new LoginPage(driver);
        login.login("sanajas.siddiqui@gmail.com", "insha@17");
        Assert.assertEquals("Spree Demo Site", driver.getTitle());
        addproductstocart("Bags", "Ruby on Rails Tote");
        driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Tote")).isDisplayed();
        String Prodtext = driver.findElement(By.linkText("Ruby on Rails Tote")).getText();
        Assert.assertEquals("Ruby on Rails Tote",Prodtext);
        System.out.println("product is added"+Prodtext);



    }



    private void addproductstocart(String category, final String products)
    {
        driver.findElement(By.linkText(category)).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + products + "')]")).click();

        driver.findElement(By.id("add-to-cart-button")).click();
    }

}
