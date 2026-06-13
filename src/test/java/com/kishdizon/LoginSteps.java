package com.kishdizon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    WebDriver driver;

    @Given("the user is on the Sauce Demo Login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");
    }

    @When("the user enters username {string} and password {string}")
    public void userEntersCredentials(String username, String password) {
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("the user clicks the login button")
    public void userClicksLoginButton() {
        driver.findElement(By.name("login-button")).click();
    }

    @Then("the user should be redirected to the products page")
    public void userIsOnProductsPage() {
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Then("an error message should be displayed")
    public void errorMessageIsDisplayed() {
        WebElement error = driver.findElement(By.cssSelector("[data-test='error']"));
        assertTrue(error.isDisplayed());
    }

    @After
    public void tearDown() {
        if (driver != null){
            driver.quit();
        }
    }
}
