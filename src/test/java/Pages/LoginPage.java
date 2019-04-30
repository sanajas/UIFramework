package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;//variable type

    @FindBy(id="link-to-login")
    private WebElement login;

    @FindBy(id="spree_user_email")
    private WebElement email;

    @FindBy(id="spree_user_password")
    private WebElement passwrd;

    @FindBy(name="commit")
    private WebElement submit;


    public LoginPage(WebDriver driver) {
        this.driver = driver; //need variable type --instance variable
        PageFactory.initElements(driver, this);
    }


    public ProductListingPage login(String username, String password)
    {
        login.click();
        email.sendKeys(username);
        passwrd.sendKeys(password);
        submit.click();
        return new ProductListingPage(driver);


    }
}