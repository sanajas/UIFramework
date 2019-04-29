package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ProductListingPage {
    WebDriver driver;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;

    }

    public  ShoppingCartPage addproductstocart(String category, final String products)
    {
        driver.findElement(By.linkText(category)).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + products + "')]")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        return new ShoppingCartPage(driver);

    }
}



