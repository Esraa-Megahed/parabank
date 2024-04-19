package testes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    private By ErrorLogin=By.xpath("//p[text()=\"An internal error has occurred and has been logged.\"]");


        @Test
        public void  ValidLogin(){
            new LoginPage(driver).login("rosita","Vois_999999");
            boolean isHeaderAreaDisplayed=driver.findElement(HomePage.headerpanel()).isDisplayed();
            Assert.assertTrue (isHeaderAreaDisplayed);
        }
        @Test
        public void InvalidLogin(){
            new LoginPage(driver).login("rositaa","Vois_999999");

            boolean isErrorDisplayed=driver.findElement(LoginPage.ErrorLogin()).isDisplayed();
            Assert.assertTrue (isErrorDisplayed);

        }

}
