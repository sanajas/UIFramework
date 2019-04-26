package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SimpleLoginTest extends CommonClassTest {

    //ChromeDriver driver;


    //@Test
    public void testLogin() {

        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        //   driver.findElement(By.id("spree_user_password")).sendKeys(assertEquals(driver.findElement(By.name("nav-link text-white")).getText(),
        //Assert.assertEquals("Spree Demo Site", driver.getTitle());


    }

    @Test
    public void testLogin2() {
        System.out.println("testing if @before and after is executed");
    }
}







