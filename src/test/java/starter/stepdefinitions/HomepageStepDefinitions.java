package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.HomepageSteps;
import starter.actions.SearchSteps;
import starter.pageobjects.Homepage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class HomepageStepDefinitions {

    @Steps
    HomepageSteps homepageSteps;
    SearchSteps search;
    @Given("^(?:.*) is researching things on the internet")
    public void researchingThings()
    {
        homepageSteps.opensTheHomePage();
    }

    @When("^(?:.*) looks up \"(.*)\"")
    public void searchesFor(String term) {
        search.searchForTerm(term);
    }

    @Then("^(?:.*) should see information about \"(.*)\"")
    public void should_see_information_about(String term) {
        assertThat(search.getSearchResults()).anyMatch(title -> title.toLowerCase().contains(term));

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

    }
    @Then("The user should be able to see the below {string}")
    public void the_user_should_be_able_to_see_the_below(String string) {

    }
}
