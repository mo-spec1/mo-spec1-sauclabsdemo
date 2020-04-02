package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BasePage
{
    public OverviewPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "subheader")
    private WebElement overviewHeader;

    public void isOverviewPageVisible()
    {
        Assert.assertTrue(overviewHeader.isDisplayed());
    }

    @FindBy (css = ".btn_action.cart_button")
    private WebElement finishButton;

    public ThankYouPage clickOnTheFinishButton()
    {
       finishButton.click();
       return new ThankYouPage(driver);
    }
}
