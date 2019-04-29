package tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.ProductListingPage;

public class EndtoEndTest1 extends CommonClassTest
{

    @Test
    public void testLogin()
    {

        LoginPage login = new LoginPage(driver);
        login.login("sanajas.siddiqui@gmail.com", "insha@17");


        //Assert.assertEquals("Spree Demo Site", driver.getTitle());



    }





}
