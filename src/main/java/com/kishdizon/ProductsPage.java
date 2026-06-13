package com.kishdizon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.findElement(By.className("title")).getText();
    }

    public void addFirstItemToCart() {
        driver.findElements(By.className("btn_inventory")).get(0).click();
    }

    public void goToCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
