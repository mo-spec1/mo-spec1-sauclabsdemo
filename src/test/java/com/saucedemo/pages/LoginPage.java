package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "user-name")
    private WebElement EnterUsername;

    public void EnterUsername(String Username)
    {
        EnterUsername.sendKeys(Username);
    }

    @FindBy (id = "password")
    private WebElement EnterPassword;

    public void  EnterPassword (String Password)
    {
        EnterPassword.sendKeys(Password);
    }

    @FindBy (className = "btn_action")
    private WebElement LoginButton;

    public ProductsPage LoginButton ()
    {
        LoginButton.click();
        return new ProductsPage(driver);
    }

    @FindBy (id = "user-name")
    private WebElement EnterThisUsername;

    public void EnterThisUsername (String problem_user)
    {
        EnterThisUsername.sendKeys("problem_user");
    }

    @FindBy (id = "password")
    private WebElement EnterWrongPassword;

    public void  EnterWrongPassword (String secret_ketchup)
    {
        EnterPassword.sendKeys("secret_ketchup");
    }

    @FindBy (tagName = "h3")
    private WebElement errorMessage;

    public void isErrorMessageDisplayed()
    {
        waitForElementToBeDisplayed(errorMessage);
        Assert.assertTrue(errorMessage.isDisplayed());
    }

}
