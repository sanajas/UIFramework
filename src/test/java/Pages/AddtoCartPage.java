package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddtoCartPage {
    WebDriver driver;//variable type

    public AddtoCartPage(WebDriver driver)
    {
        this.driver = driver; //need variable type --instance variable

    }




   /* private void ShoppingCartPage() {
        int count = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item")).size();
        System.out.println("line items in shopping cart"+" "+count);
        Assert.assertEquals(count , 1);
    }*/

    private void addproductstocart(String category, final String products) {
        driver.findElement(By.linkText(category)).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + products + "')]")).click();

        driver.findElement(By.id("add-to-cart-button")).click();
    }
}