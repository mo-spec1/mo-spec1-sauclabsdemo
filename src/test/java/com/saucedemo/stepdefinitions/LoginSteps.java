package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class LoginSteps extends BasePage
{
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);


    @Given("I navigate to the Sauce Labs Homepage")
    public void i_navigate_to_the_Sauce_Labs_Homepage()
    {
        loginPage.launchURL();
    }
    @When("I enter the credentials {string} and {string}")
    public void i_enter_the_credentials(String Username, String Password)
    {
        loginPage.EnterUsername(Username);
        loginPage.EnterPassword(Password);
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        productsPage = loginPage.LoginButton();
    }
    @When("I enter the Username {string}")
    public void i_enter_the_Username(String problem_user)
    {
        loginPage.EnterThisUsername(problem_user);
    }
    @When("I enter the Password {string}")
    public void i_enter_the_Password(String secret_ketchup)
    {
        loginPage.EnterWrongPassword(secret_ketchup);
    }
    @Then("When I login I should get an error message")
    public void i_login_I_should_get_an_error_message()
    {
        loginPage.LoginButton();
        loginPage.isErrorMessageDisplayed();
    }
}
