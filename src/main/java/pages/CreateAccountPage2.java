package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateAccountPage2 {
    private WebDriver driver;
    public CreateAccountPage2(WebDriver driver){
        this.driver=driver;
    }
    private By TypeAccount= By.id("type");
    private By Deposite= By.id("fromAccountId");

    private  By openNewAccount = By.xpath("//a[text()=\"Open New Account\"]");
    private By OpenAcoountButton= By.xpath("(//input[@type=\"submit\"])[1]");
     private By AccountOpened= By.xpath("//h1[text()=\"Account Opened!\"]");

    public static By accountOpened (){
        return  By.xpath("//h1[text()=\"Account Opened!\"]");
    }


    public CreateAccountPage2 SetSelect(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select select=new Select(driver.findElement(TypeAccount));
        select.selectByIndex(0);
        Select select2=new Select(driver.findElement(Deposite));
        select2.selectByIndex(0);
        driver.findElement(OpenAcoountButton).click();
        driver.findElement(OpenAcoountButton).click();

        return this;
    }


}
