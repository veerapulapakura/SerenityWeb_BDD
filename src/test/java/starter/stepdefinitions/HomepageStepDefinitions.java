package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import starter.actions.FinancialServicesSteps;
import starter.actions.HomepageSteps;

public class HomepageStepDefinitions {


    @Steps
    HomepageSteps homepageSteps;
    FinancialServicesSteps financialServicesSteps;

    @Given("^(?:.*) is researching things on the internet")
    public void researchingThings()
    {
        homepageSteps.opensTheHomePage();
    }

    @Given("The user is on Lexisnexis homepage")
    public void the_user_is_on_lexisnexis_homepage() {
        homepageSteps.opensTheHomePage();
    }

    @When("The  user chooses {string}")
    public void the_user_chooses(String string) {
        homepageSteps.the_user_choose(string);
    }
    @When("The  user chooses Financial Services")
    public void the_user_chooses_financial_services() {
        homepageSteps.the_user_chooses_financial_srvices();
        //financialServicesSteps.verify_financial_srvices_titles();
    }
    @Then("The user should be able to see the below {string}")
    public void the_user_should_be_able_to_see_the_below(String title) {
        homepageSteps.genericSearch(title);
        homepageSteps.getDriver().close();
    }

    //
    @Then("The user should be able to verify all the titles")
    public void the_user_verifies_all_the_titles() {
        homepageSteps.userVerifyTtiles();
        homepageSteps.getDriver().close();
    }
}
