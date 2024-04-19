package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class BillPayPage {
    private WebDriver driver;
    public BillPayPage(WebDriver driver){
        this.driver=driver;
    }

  private By PayeeName= By.xpath("//input[@name=\"payee.name\"]");
    private  By Address=By.xpath("//input[@name=\"payee.address.street\"]");
    private  By City =By.xpath("//input[@name=\"payee.address.city\"]");
    private  By State =By.xpath("//input[@name=\"payee.address.state\"]");
    private  By Zipcode=By.xpath("//input[@name=\"payee.address.zipCode\"]");
    private  By Phone =By.xpath("//input[@name=\"payee.phoneNumber\"]");
    private  By Account =By.xpath("//input[@name=\"payee.accountNumber\"]");
    private  By VerifyAccount =By.xpath("//input[@name=\"verifyAccount\"]");
    private  By Amount =By.xpath("//input[@name=\"amount\"]");
    private  By FromAmount=By.xpath("//select[@name=\"fromAccountId\"]");
    private By SendButton=By.xpath("(//input[@type=\"submit\"])[1]");

    public By errormessage= (By.xpath("//p[text()=\"See Account Activity for more details.\"]"));

    public static By PaymentComplete(){
        return By.xpath("(//input[@type=\"submit\"])[1]");
    }

    public static By ErrorMsg(){
        return By.className("error");
    }

public void createBillPayment(String PayeeNameField,String addressField, String cityField ,String StateField,String ZipcodeField,String PhoneField, String AccountField,String VerifyAccountField,String AmountField,String FromAccountField){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.findElement(PayeeName).sendKeys(PayeeNameField);
    driver.findElement(Address).sendKeys(addressField);
     driver.findElement(City).sendKeys(cityField);
     driver.findElement(State).sendKeys(StateField);
     driver.findElement(Zipcode).sendKeys(ZipcodeField);
     driver.findElement(Phone).sendKeys(PhoneField);
     driver.findElement(Account).sendKeys(AccountField);
     driver.findElement(VerifyAccount).sendKeys(VerifyAccountField);
     driver.findElement(Amount).sendKeys(AmountField);

    Select select = new Select(driver.findElement(FromAmount));
    select.selectByIndex(0);
     driver.findElement(SendButton).click();

}
}
