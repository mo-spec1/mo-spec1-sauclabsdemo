package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage
{
    public ProductDetailsPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn_primary.btn_inventory")
    private WebElement addToCartButton;

    public void clickAddToCart()
    {
        addToCartButton.click();
    }

    @FindBy (className = "inventory_details_back_button")
    private WebElement navBackButton;

    public void clickBackButton()
    {
        navBackButton.click();
    }

    @FindBy (css = ".svg-inline--fa.fa-shopping-cart.fa-w-18.fa-3x ")
    private WebElement cartIcon;

    public CartPage clickCartIcon()
    {
        cartIcon.click();
        return new CartPage(driver);
    }
}
