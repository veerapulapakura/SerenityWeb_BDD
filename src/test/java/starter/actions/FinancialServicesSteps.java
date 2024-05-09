package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.pageobjects.FinancialServicesPage;
import starter.pageobjects.Homepage;

public class FinancialServicesSteps extends UIInteractionSteps {
    WebDriver driver;

    public void verify_financial_srvices_titles() {
        WebElement element = find(Homepage.FINANCIAL_SERVICES);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        /*if(find(Homepage.FINANCIAL_SERVICES).isEnabled())
        find(Homepage.FINANCIAL_SERVICES).click();*/
        }
    }

