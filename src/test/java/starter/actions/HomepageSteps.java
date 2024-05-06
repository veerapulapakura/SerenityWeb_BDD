package starter.actions;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import starter.pageobjects.Homepage;
import java.time.Duration;
import static junit.framework.Assert.assertTrue;

public class HomepageSteps extends UIInteractionSteps {
    Homepage homepage;
    @Step("The user launches the mail URL")
    public void opensTheHomePage() {
        homepage.open();
        withTimeoutOf(Duration.ofSeconds(10));
        find(Homepage.COOKIES).click();
    }

    @Step("The  user chooses choose your industry {string}")
    public void the_user_choose(String string_to_find) {
        find(Homepage.CHOOSE_YOUR_INDUSTRY).click();
    }

    @Step("Verification of all the tabs")
    public void genericSearch(String string_to_find) {
        if(string_to_find.equals("Financial Services")) {
            assertTrue(find(Homepage.FINANCIAL_SERVICES).isPresent());
            //assertTrue(find(Homepage.FINANCIAL_SERVICES).isClickable());
        }
        if(string_to_find.equals("Insurance")){
            assertTrue(find(Homepage.INSURANCE).isPresent());
            //assertTrue(find(Homepage.INSURANCE).isClickable());
        }
        if(string_to_find.equals("Life and Pensions")) {
            assertTrue(find(Homepage.LIFE_AND_PENSIONS).isPresent());
            //assertTrue(find(Homepage.LIFE_AND_PENSIONS).isClickable());
        }

        if(string_to_find.equals("Corporations and Non-Profits")) {
            assertTrue(find(Homepage.CORPORATIONS_AND_NONPROFITS).isPresent());
            //assertTrue(find(Homepage.CORPORATIONS_AND_NONPROFITS).isClickable());
        }
    }
}
