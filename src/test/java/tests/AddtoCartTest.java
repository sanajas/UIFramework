package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddtoCartTest extends CommonClassTest {

    @Test(groups = "smoke")
    public void  Addproduct()

    {


        addproductstocart("Bags", "Ruby on Rails Tote");

        driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Tote")).isDisplayed();
        String Prodtext = driver.findElement(By.linkText("Ruby on Rails Tote")).getText();
        Assert.assertEquals("Ruby on Rails Tote",Prodtext);
        int count = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item")).size();
        System.out.println("line items in shopping cart"+" "+count);
        Assert.assertEquals(count , 1);

    }

    private void addproductstocart(String category, final String products) {
        driver.findElement(By.linkText(category)).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + products + "')]")).click();

        driver.findElement(By.id("add-to-cart-button")).click();
    }

}
