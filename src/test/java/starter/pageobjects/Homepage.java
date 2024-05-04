package starter.pageobjects;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://risk.lexisnexis.co.uk/")
public class Homepage extends PageObject{

    private String variable;
    public static final By CHOOSE_YOUR_INDUSTRY = By.xpath("//a[contains(text(),'Choose Your Industry')]");
    //public static final By CHOOSE_YOUR_INDUSTRY = By.xpath("//a[contains(text(),'Choose Your Industry')]");

    public static final By COOKIES = By.id("onetrust-accept-btn-handler");

    //public static final By COOKIES = By.id("onetrust-accept-btn-handler");
    //public static final By COOKIES = By.id("onetrust-accept-btn-handler");
    //public static final By COOKIES = By.id("onetrust-accept-btn-handler");
    //public static final By COOKIES = By.id("onetrust-accept-btn-handler");

    public void setVariable(String x){
        this.variable=x;
    }

    public String getVariable(){
        return variable;
    }
}

