Feature: Calculator
    Scenario: Add two numbers
      Given i have a calculator
      When i add 9 and 10
      Then the result should be 19


    Scenario: Subtract two numbers
      Given i have a calculator
      When i subtract 10 and 1
      Then the result should be 9

    Scenario: Divide two numbers
      Given i have a calculator
      When i divide 10 by 2
      Then the result should be 5

