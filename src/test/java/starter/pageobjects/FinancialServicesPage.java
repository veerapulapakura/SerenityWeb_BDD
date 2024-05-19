package starter.pageobjects;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FinancialServicesPage extends PageObject {
    public By commonxpath(WebDriver driver, String xpathvalue){
        By elementvalue= By.xpath("//a[@href='/financial-services/"+xpathvalue+"']//div[@class='subpage-title'][normalize-space()='"+xpathvalue+"']");
        withTimeoutOf(Duration.ofSeconds(10));
        return elementvalue;
    }
}
