package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver=driver;

    }
    private By UserNameField = By.xpath("//input[@name=\"username\"]");
    private By PasswordField=By.xpath("//input[@name=\"password\"]");
     private By LoginButton=By.xpath("//input[@class=\"button\"]");
    public static By ErrorLogin (){
        return By.xpath("//input[@class=\"button\"]");
    }

    //Actions
    public HomePage login(String username, String password){
        driver.findElement(UserNameField).sendKeys(username);
        driver.findElement(PasswordField).sendKeys(password);
        driver.findElement(LoginButton).click();


        return new HomePage(driver);

    }

}

