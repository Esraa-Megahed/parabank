package testes;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.TransferPage;

public class TransferTest extends BaseTest {

    String FirstNameField = ("esraa");
    String LastNameField = ("reda");
    String AddressField = ("mansoura");
    String cityField = ("mansoura");
    String StateField = ("egipt");
    String ZipCodeField = ("23567");
    String PhoneField = ("1068529912");
    String SSNField = ("9");
    String UserNameField = ("soeupjoi");
    String PassWordField = ("Vois_999999");
    String ConfirmField = ("Vois_999999");

    @Test
    public void ValidateRequestLoan() throws InterruptedException {

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();
        registerPage.createUser(FirstNameField, LastNameField, AddressField, cityField, StateField, ZipCodeField, PhoneField, SSNField, UserNameField, PassWordField, ConfirmField);
        HomePage homePage = new HomePage(driver);
        homePage.transfer();
        TransferPage transferPage = new TransferPage(driver);
        transferPage.transferFunds("500");

    }
}
