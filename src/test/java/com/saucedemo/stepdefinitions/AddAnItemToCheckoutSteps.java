package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AddAnItemToCheckoutSteps extends BasePage
{
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
    CartPage cartpage = PageFactory.initElements(driver, CartPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
    OverviewPage overviewPage = PageFactory.initElements(driver,OverviewPage.class);
    ThankYouPage thankYouPage = PageFactory.initElements(driver,ThankYouPage.class);

    @Then("I should be taken to the product page")
    public void iShouldBeTakenToTheProductPage()
    {
        productsPage = loginPage.LoginButton();
        productsPage.isProductTitleDisplayed();
    }

    @When("I add items to the basket")
    public void I_add_items_to_the_basket()
    {
        productsPage.clickBlackShirtItem();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickBackButton();
        productsPage.clickBikeLightItem();
        productDetailsPage.clickAddToCart();
    }

    @Then("it should be added successfully")
    public void it_should_be_added_successfully()
    {
        cartpage = productDetailsPage.clickCartIcon();
        cartpage.isCartHeaderVisible();
        cartpage.isFirstItemVisible();
        cartpage.isSecondItemVisible();
    }

    @Given("I have items in my basket")
    public void i_have_items_in_my_basket()
    {
        productsPage.clickBlackShirtItem();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickBackButton();
        productsPage.clickBikeLightItem();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickCartIcon();
        cartpage.isCartItemsVisible();
    }
    @When("I click on the checkout button")
    public void i_click_on_the_checkout_button()
    {
        cartpage.clickOnCheckoutButton();
    }

    @When("I enter my name {string} {string}")
    public void iEnterMyName(String Moses, String Test)
    {
        checkoutPage.enterFirstNameForCheckout(Moses);
        checkoutPage.enterLastNameForCheckout(Test);
    }

    @And("I enter my postal code {string} and continue")
    public void iEnterMyPostalCodeAndContinue(String M11FT)
    {
        checkoutPage.enterPostcodeForCheckout(M11FT);
        checkoutPage.clickOnTheContinueButton();
    }

    @When("I click on the Finish button")
    public void iClickOnTheFinishButton()
    {
        overviewPage.clickOnTheFinishButton();
    }

    @Then("I should be taken to a Overview page")
    public void iShouldBeTakenToAOverviewPage()
    {
        overviewPage.isOverviewPageVisible();
    }

    @Given("I am on the Checkout page")
    public CheckoutPage iAmOnTheCheckoutPage ()
    {
        productsPage.clickBlackShirtItem();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickBackButton();
        productsPage.clickBikeLightItem();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickCartIcon();
        cartpage.clickOnCheckoutButton();
        return new CheckoutPage(driver);
    }

    @Then("I should be taken to a Thank You page")
    public void iShouldBeTakenToAThankYouPage()
    {
        thankYouPage.isThankYouHeaderVisible();
    }
}
