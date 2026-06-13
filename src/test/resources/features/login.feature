Feature: Sauce Demo Login
    Scenario: Successful login with valid credentials
      Given the user is on the Sauce Demo Login page
      When the user enters username "standard_user" and password "secret_sauce"
      And the user clicks the login button
      Then the user should be redirected to the products page

    Scenario: Failed login with invalid credentials
      Given the user is on the Sauce Demo Login page
      When the user enters username "invalid_user" and password "invalid_password"
      And the user clicks the login button
      Then an error message should be displayed

