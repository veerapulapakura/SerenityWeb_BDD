package starter.pageobjects;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Pattern;

@DefaultUrl("https://risk.lexisnexis.co.uk/")
public class Homepage extends PageObject{
    public static final By CHOOSE_YOUR_INDUSTRY = By.xpath("//a[contains(text(),'Choose Your Industry')]");
    public static final By COOKIES = By.id("onetrust-accept-btn-handler");
    public static final By FINANCIAL_SERVICES = By.xpath("//a[contains(text(),'Financial Services')]");
    public static final By INSURANCE = By.xpath("//a[contains(text(),'Insurance')]");
    public static final By LIFE_AND_PENSIONS = By.xpath("//a[contains(text(),'Life and Pensions')]");
    public static final By CORPORATIONS_AND_NONPROFITS = By.xpath("//a[contains(text(),'Corporations and Non-Profits')]");

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }

    @After
    public void tearDown() {
        getDriver().quit();
    }

}

