package tests;



import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleLoginTest extends CommonClassTest {

    //ChromeDriver driver;


    @Test(groups = "smoke")
    public void testLogin()
    {

        LoginPage login = new LoginPage(driver);
        login.login("sanajas.siddiqui@gmail.com", "insha@17");

        //  driver.findElement(By.id("spree_user_password")).sendKeys(assertEquals(driver.findElement(By.name("nav-link text-white")).getText(),
        Assert.assertEquals("Spree Demo Site", driver.getTitle());


    }

    /*private void login()
    {
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("sanajas.siddiqui@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("insha@17");
        driver.findElement(By.name("commit")).click();
    }*/

    /*@Test(groups = "smoke")
    public void testLogin2() {
        System.out.println("testing if @before and after is executed");
    }*/
}







