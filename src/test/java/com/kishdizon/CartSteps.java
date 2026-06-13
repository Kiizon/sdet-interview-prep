package com.kishdizon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartSteps {

    WebDriver driver;
    ProductsPage productsPage;
    CartPage cartPage;

    @Given("the user is logged into Sauce Demo")
    public void userIsLoggedIn() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // login only used once so not declared as a class level
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("standard_user", "secret_sauce");

        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @When("the user adds the first item to the cart")
    public void userAddsItemToCart() {
        productsPage.addFirstItemToCart();
    }

    @When("the user navigates to the cart")
    public void userNavigatesToCart() {
        productsPage.goToCart();
    }

    @Then("the cart should contain an item")
    public void cartContainsItem() {
        assertTrue(cartPage.isItemInCart());
    }

}
