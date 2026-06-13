Feature: Shopping Cart
    Scenario: Add item to cart
      Given the user is logged into Sauce Demo
      When the user adds the first item to the cart
      And the user navigates to the cart
      Then the cart should contain an item