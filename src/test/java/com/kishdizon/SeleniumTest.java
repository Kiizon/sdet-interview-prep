package com.kishdizon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Note: test methods are not public since JUnit calls from within same package
// Note: with cucumber, methods need to be public since cucucumber calls from outside the class

public class SeleniumTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void testGoogleTitle() {
        driver.get("https://google.com");
        assertEquals("Google", driver.getTitle());
    }

    @Disabled
    @Test
    // test case fails because google detects automated browser and throws a captcha
    void testGoogleSearch() {
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium docs");
        searchBox.submit();

        String title = driver.getTitle();
        assertTrue(title.contains("The Selenium Browser Automation Project"));
    }

    @Test
    void testSearch() {
        driver.get("https://www.saucedemo.com");

        WebElement username = driver.findElement(By.name("user-name"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        loginButton.click();

        String title = driver.getTitle();
        assertTrue(title.contains("Swag Labs"));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }


}
