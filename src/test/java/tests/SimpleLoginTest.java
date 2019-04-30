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

        Assert.assertEquals("Spree Demo Site", driver.getTitle());


    }


}







