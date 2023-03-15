package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;


public class FizzBuzzStepDef {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultWasFizz(String resultString) {
        Assertions.assertEquals(result, resultString);
    }

}

