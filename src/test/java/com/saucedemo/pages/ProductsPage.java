package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage
{
    public ProductsPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "product_label")
    private WebElement productTitle;

    public void isProductTitleDisplayed()
    {
        waitForElementToBeDisplayed(productTitle);
        Assert.assertTrue(productTitle.isDisplayed());
    }

    @FindBy (id = "item_1_img_link")
    private WebElement blackShirtItem;

    public void clickBlackShirtItem()
    {
        blackShirtItem.click();
    }

    @FindBy (id = "item_0_img_link")
    private WebElement bikeLightItem;

    public void clickBikeLightItem()
    {
        bikeLightItem.click();
    }
}
