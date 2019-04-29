package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShoppingCartPage

{
    WebDriver driver;
    boolean sucess;

    public ShoppingCartPage(WebDriver driver)
    {
        this.driver = driver;

    }
    public boolean isDisplayed() {

        if (driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Tote")).isDisplayed()) {
            sucess= true;
        }
        else
        {
            sucess= false;
        }
        return sucess;

    }
}
