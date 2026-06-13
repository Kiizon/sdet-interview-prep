Feature: Calculator
    Scenario: Add two numbers
      Given I have a calculator
      When I add 9 and 10
      Then The result should be 19


    Scenario: Subtract two numbers
      Given I have a calculator
      When I subtract 10 and 1
      Then The result should be 9

    Scenario: Divide two numbers
      Given I have a calculator
      When I divide 10 by 2
      Then The result should be 5

