package com.kishdizon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {
    Calculator calc;
    int result;

    @Given("i have a calculator")
    public void iHaveACalculator() {
        calc = new Calculator("Test Cucumber Calculator", new Logger());
    }

    @When("i add {int} and {int}")
    public void iAdd(int a, int b) {
        result = calc.add(a, b);
    }

    @When("i subtract {int} and {int}")
    public void iSubtract(int a, int b) {
        result = calc.subtract(a, b);
    }

    @When("i divide {int} by {int}")
    public void iDivide(int a, int b) {
        try {
            result = calc.divide(a, b);
        } catch (ArithmeticException e) {
            result = -1;
        }
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertEquals(expected, result);
    }

    @Then("an arithmetic exception should be thrown")
    public void exceptionShouldBeThrown() {
        assertEquals(-1, result);
    }
}
