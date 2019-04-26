package tests;

import org.testng.annotations.*;

import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class TestingTestNgTest
{

  @BeforeSuite
  public void beforesuite()
  {
      System.out.println("I am executing before suite");
  }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("I am executing before test");
    }


    @AfterTest
    public void aftertest()
    {
        System.out.println("I am executing after test");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am executing before Method");
    }

    @AfterMethod
    public void aftermethod()
    {
        System.out.println("I am executing after Method");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("I am executing after suite");
    }

    @Test
    public void test1()
    {
        System.out.println("I am executing test1");
        assertTrue(false);


    }


    @Test(groups = "smoke")
    public void test2()
    {
        System.out.println("I am executing test2 belong to group smoke");

    }

    @Test(groups = "smoke")
    public void test3()
    {
        System.out.println("I am executing test2  belong to group smoke");

    }


}
