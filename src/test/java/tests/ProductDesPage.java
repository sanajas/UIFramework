package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDesPage {
    WebDriver driver;
    boolean sucess;


    public ProductDesPage(WebDriver driver) {
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

