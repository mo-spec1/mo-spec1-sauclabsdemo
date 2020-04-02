package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends BasePage
{
    public ThankYouPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "complete-header")
    private WebElement thankYouHeader;

    public void isThankYouHeaderVisible()
    {
        Assert.assertTrue(thankYouHeader.isDisplayed());
    }
}
