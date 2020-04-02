package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends BasePage
{
    public CartPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (className = "subheader")
    private WebElement yourCartHeader;

    public void isCartHeaderVisible()
    {
        Assert.assertTrue(yourCartHeader.isDisplayed());
    }

    @FindBy (id = "item_1_title_link")
    private WebElement firstItem;

    public void isFirstItemVisible()
    {
        Assert.assertTrue(firstItem.isDisplayed());
    }

    @FindBy (id = "item_0_title_link")
    private WebElement secondItem;

    public void isSecondItemVisible()
    {
        Assert.assertTrue(firstItem.isDisplayed());
    }

    @FindBy (className = "cart_list")
    private List<WebElement> cartList;

    public void isCartItemsVisible()
    {
        Assert.assertTrue(cartList.size()>0);
    }

    @FindBy (css = ".btn_action.checkout_button")
    private WebElement checkoutButton;

    public CheckoutPage clickOnCheckoutButton()
    {
        checkoutButton.click();
        return new CheckoutPage(driver);
    }
}
