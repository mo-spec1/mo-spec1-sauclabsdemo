package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage

{
    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (className = "subheader")
    private WebElement infoHeader;

    public void checkoutInfoHeaderIsDisplayed ()
    {
        Assert.assertTrue(infoHeader.isDisplayed());
    }

    @FindBy (id = "first-name")
    private  WebElement checkoutFirstName;

    public void enterFirstNameForCheckout(String Moses)
    {
        waitForElementToBeDisplayed(checkoutFirstName);
        checkoutFirstName.sendKeys(Moses);
    }

    @FindBy (id = "last-name")
    private  WebElement checkoutLastName;

    public void enterLastNameForCheckout(String Test)
    {
        checkoutLastName.sendKeys(Test);
    }

    @FindBy (id = "postal-code")
    private  WebElement checkoutPostcode;

    public void enterPostcodeForCheckout(String M11FT)
    {
        checkoutPostcode.sendKeys(M11FT);
    }

    @FindBy (css = ".btn_primary.cart_button")
    private  WebElement continueButton;

    public OverviewPage clickOnTheContinueButton()
    {
        continueButton.click();
        return new OverviewPage(driver);
    }


}
