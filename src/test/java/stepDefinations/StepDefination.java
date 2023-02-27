package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
        System.out.println("Navigated to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("Login successfully");
    }

    @Then("^Home page is open$")
    public void home_page_is_open() {
        System.out.println("Validated homepage");

    }

    @And("^Card are displayed$")
    public void card_are_displayed() {
        System.out.println("Validated cards");
    }

}
