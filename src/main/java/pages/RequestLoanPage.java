package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RequestLoanPage {
    private WebDriver driver;
    public RequestLoanPage(WebDriver driver){
        this.driver=driver;
    }
    private By LoadAmount= By.id("amount");
    private By DownPayment =By.id("downPayment");
    private  By FromAccount =By.id("fromAccountId");
     private By ApplynowButton =By.xpath("(//input[@type=\"submit\"])[1]");
     public static By ConfirmationMessage (){
         return By.xpath("//p[text()=\"Congratulations, your loan has been approved.\"]");

     }
     public RequestLoanPage requestLoan ( String LoadAmountField,String downPaymentField ) {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.findElement(LoadAmount).sendKeys(LoadAmountField);
         driver.findElement(DownPayment).sendKeys(downPaymentField);
         Select select = new Select(driver.findElement(FromAccount));
         select.selectByIndex(0);
         driver.findElement(ApplynowButton).click();
         return this;
     }

}
