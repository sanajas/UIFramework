package tests;

import Pages.LoginPage;
import org.testng.Assert;

public class EndtoEndTest1 extends CommonClassTest
{


    public void testLogin() {

        LoginPage login = new LoginPage(driver);
        login.login("sanajas.siddiqui@gmail.com", "insha@17");
        Assert.assertEquals("Spree Demo Site", driver.getTitle());


    }



}
