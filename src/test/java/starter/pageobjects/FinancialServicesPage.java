package starter.pageobjects;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FinancialServicesPage extends PageObject {
    public static final By FINANCIAL_CRIME_COMPLIANCE = By.className("Financial Crime Compliance");
    public static final By FRAUD_AND_IDENTITY_MANAGEMENT = By.className("Fraud and Identity Management");
    public static final By CUSTOMER_DATA_MANAGEMENT = By.className("Customer Data Management");
    public static final By CREDIT_RISK_MANAGEMENT = By.className("Credit Risk Assessment");
    public static final By COLLECTIONS_AND_RECOVERY = By.className("Collections and Recovery");
    public static final By INVESTIGATIONS_AND_DUEDELIGENCE = By.className("Investigations and Due Diligence");
    public static final By RISK_ORCHESTRATION = By.className("Risk Orchestration");
}
