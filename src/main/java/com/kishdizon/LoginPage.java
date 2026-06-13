package com.kishdizon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo() {
        driver.get("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.name("login-button")).click();
    }

    public void loginAs(String username, String password) {
        navigateTo();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
