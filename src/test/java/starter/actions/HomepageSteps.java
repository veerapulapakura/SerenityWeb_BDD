package starter.actions;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import starter.pageobjects.Homepage;
import starter.pageobjects.SearchForm;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomepageSteps extends UIInteractionSteps {
    Homepage homepage;
    @Step("The user launches the mail URL")
    public void opensTheHomePage() {
        homepage.open();
        getDriver().manage().window().maximize();
        withTimeoutOf(Duration.ofSeconds(10));
        find(Homepage.COOKIES).click();
    }

    @Step("The  user chooses {string}")
    public void the_user_choose(String string) {
        withTimeoutOf(Duration.ofSeconds(10));
        find(Homepage.CHOOSE_YOUR_INDUSTRY).click();
        }
}
