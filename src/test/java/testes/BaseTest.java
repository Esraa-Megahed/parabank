package testes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    @Test

    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");

    }

//    @AfterMethod
//
//    public void quit(){
//        driver.quit();
//    }


}
