package starter.actions;

import junit.framework.Assert;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.pageobjects.FinancialServicesPage;
import starter.pageobjects.Homepage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

public class FinancialServicesSteps extends UIInteractionSteps {
    FinancialServicesPage financialServicesPage;
    WebDriver driver;
    public void verify_financial_srvices_titles() {
        String listofvalues = find(Homepage.LIST_UNDER_FINANCIALSERVICES).getText();
        List<String> arrayList = new ArrayList<String>(Arrays.asList(listofvalues.split("\n")));

        for (int i=0;i<arrayList.size();i++) {
                 String value = arrayList.get(i);
                 By elementvalue = (By) financialServicesPage.commonxpath(driver,value );
                 assertEquals(true,find(elementvalue).isPresent());
                 assertEquals(true,find(elementvalue).isClickable());
             }
        }
    }

