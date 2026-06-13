package com.kishdizon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isItemInCart() {
        System.out.println("Cart items found: " + driver.findElements(By.className("cart_item")).size());
        return !driver.findElements(By.className("cart_item")).isEmpty();
    }

}
