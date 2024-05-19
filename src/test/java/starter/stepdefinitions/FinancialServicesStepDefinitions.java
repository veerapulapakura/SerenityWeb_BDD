package starter.stepdefinitions;
import io.cucumber.java.en.Then;
import starter.actions.FinancialServicesSteps;

public class FinancialServicesStepDefinitions {


    FinancialServicesSteps financialServicesSteps;
    @Then("The user should be able to see all the tabs under Financial Services")
    public void the_user_should_be_able_to_see_all_the_tabs_under_financial_services() {
        financialServicesSteps.verify_financial_srvices_titles();;
    }
}
