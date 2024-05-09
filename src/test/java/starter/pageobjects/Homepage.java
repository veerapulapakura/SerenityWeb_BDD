package starter.pageobjects;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

@DefaultUrl("https://risk.lexisnexis.co.uk/")
public class Homepage extends PageObject{
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver,10); // 10-second explicit wait
    public static final By CHOOSE_YOUR_INDUSTRY = By.xpath("//a[contains(text(),'Choose Your Industry')]");
    public static final By COOKIES = By.id("onetrust-accept-btn-handler");
    public static final By FINANCIAL_SERVICES = By.xpath("//*[@class='nav nav-pills nav-stacked']/li[3]//a[@data-industryid='{4D5E7A25-6576-4637-9149-6AB8E198E48D}']");

    public static final By INSURANCE = By.xpath("//a[contains(text(),'Insurance')]");
    public static final By LIFE_AND_PENSIONS = By.xpath("//a[contains(text(),'Life and Pensions')]");
    public static final By CORPORATIONS_AND_NONPROFITS = By.xpath("//a[contains(text(),'Corporations and Non-Profits')]");
    public static final By ALL_UNDER_INDUSTRY = By.xpath("//a[contains(text(),'Corporations and Non-Profits')]");

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }

    public void maximizeBrowserWindow() {
        WebDriverFacade facade = (WebDriverFacade) getDriver();
        getDriver().manage().window().maximize();
    }
    @After
    public void tearDown() {
        getDriver().quit();
    }


}

