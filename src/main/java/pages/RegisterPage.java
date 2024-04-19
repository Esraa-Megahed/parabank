package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    public RegisterPage (WebDriver driver){
        this.driver=driver;

    }
    String FirstNameField=("esraa");
    String LastNameField=("reda");
    String AddressField=("mansoura");
    String cityField=("mansoura");
    String StateField=("egipt");
    String ZipCodeField=("23567");
    String PhoneField=("1068529912");
    String SSNField= ("9");
    String UserNameField=("rosita");
    String PassWordField=("Vois_999999");
    String ConfirmField =("Vois_999999");
    private By registerButton= By.linkText("Register");
    private  By assertOnRegister= By.xpath("//h1[text()=\"Signing up is easy!\"]");
    private By FirstName = By.id("customer.firstName");
    private By LastName= By.id("customer.lastName");
    private By Address= By.id("customer.address.street");
    private By City= By.id("customer.address.city");
    private By State= By.id("customer.address.state");
    private By ZipCode=By.id("customer.address.zipCode");
    private By Phone= By.id("customer.phoneNumber");
    private By SSN= By.id("customer.ssn");
    private By UserName= By.id("customer.username");
    private By PassWord= By.id("customer.password");
    private By Confirm=By.id("repeatedPassword");
    private By submit=By.xpath("(//input[@type=\"submit\"])[2]");
    private By assertErrorRegister= By.id("customer.address.state.errors");


   private By InvalidLogin=By.xpath("//span[text()=\"Passwords did not match.\"]");

    public  static By Invalid(){
        return By.xpath("//span[text()=\"Passwords did not match.\"]");
    }


public void register(){
        driver.findElement(registerButton).click();

}

//Set Assertion FOR Register
    public boolean verifyrRedirectiontoRegister(){
        return driver.findElement(assertOnRegister).isDisplayed();
    }

    public boolean verifyCreateUser(){
        HomePage homePage=new HomePage(driver);
        return driver.findElement(homePage.confirmationmessage()).isDisplayed();
     }
     public boolean verifyUserNotCreated(String targetElement){

        return driver.findElement(By.id("customer."+ targetElement +".errors")).isDisplayed();
//        return driver.findElement(assertErrorRegister).isDisplayed();
     }

//    boolean isHeaderAreaDisplayed=driver.findElement(HomePage.confirmationmessage()).isDisplayed();
    public void createUser(String FirstNameField,String LastNameField,String AddressField,String cityField, String StateField,String ZipCodeField, String PhoneField,String SSNField,String UserNameField,String PassWordField,String ConfirmField){

        driver.findElement(FirstName).sendKeys(FirstNameField);
        driver.findElement(LastName).sendKeys(LastNameField);
        driver.findElement(Address).sendKeys(AddressField);
        driver.findElement(City).sendKeys(cityField);
        driver.findElement(State).sendKeys(StateField);
        driver.findElement(ZipCode).sendKeys(ZipCodeField);
        driver.findElement(Phone).sendKeys(PhoneField);
        driver.findElement(SSN).sendKeys(SSNField);
        driver.findElement(UserName).sendKeys(UserNameField);
        driver.findElement(PassWord).sendKeys(PassWordField);
        driver.findElement(Confirm).sendKeys(ConfirmField);
        driver.findElement(submit).click();



    }
}
