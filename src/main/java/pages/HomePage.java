package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By ValidLogin = By.xpath("//p[text()=\"Your account was created successfully. You are now logged in.\"]");

    private By TestElement = By.xpath("//h2[text()=\"Account Services\"]");
    private By Headerpanel = By.xpath("(//div[@id='headerPanel'])");
    private By OpenNewAccount = By.xpath("(//a[text()='Open New Account'])");
    private By TransferFunds = By.xpath("(//a[text()='Transfer Funds'])");
    private By requestLoanButton = By.xpath("//a[text()='Request Loan']");
    private By billPayButton = By.xpath("//a[text()=\"Bill Pay\"]");
    private By transferButton = By.linkText("Transfer Funds");
    private By UpdateButton = By.linkText("Update Contact Info");

    public By confirmationmessage() {
        return TestElement;
    }

    public static By validlogin() {
        return By.xpath("\"//p[text()=\\\"Your account was created successfully. You are now logged in.\\\"]\"");
    }

    public static By headerpanel() {
        return By.xpath("(//div[@id='headerPanel'])");
    }

    public CreateAccountPage2 newAccount() {

        driver.findElement(OpenNewAccount).click();

        return new CreateAccountPage2(driver);

    }

    public RequestLoanPage requestLoan() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(requestLoanButton).click();
        return new RequestLoanPage(driver);
    }

    public BillPayPage billBay() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(billPayButton).click();
        return new BillPayPage(driver);

    }

    public TransferPage transfer() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(transferButton).click();
        return new TransferPage(driver);
    }

    public UpdateInfPage updateInf() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(UpdateButton).click();
        return new UpdateInfPage(driver);
    }
}