package testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage2;
import pages.HomePage;
import pages.RegisterPage;
import pages.RequestLoanPage;

public class RequestLoanTest extends BaseTest {

        String FirstNameField=("esraa");
        String LastNameField=("reda");
        String AddressField=("mansoura");
        String cityField=("mansoura");
        String StateField=("egipt");
        String ZipCodeField=("23567");
        String PhoneField=("1068529912");
        String SSNField= ("9");
        String UserNameField=("soeo5o0saa");
        String PassWordField=("Vois_999999");
        String ConfirmField=("Vois_999999");
        @Test
        public  void ValidateRequestLoan (){

            RegisterPage registerPage= new RegisterPage(driver);
            registerPage.register();
            registerPage.createUser(FirstNameField,LastNameField,AddressField,cityField,StateField,ZipCodeField,PhoneField,SSNField,UserNameField,PassWordField,ConfirmField);
             HomePage homePage =new HomePage(driver);
             homePage.requestLoan();
            RequestLoanPage requestLoanPage=new RequestLoanPage(driver);
            requestLoanPage.requestLoan("5000","4545");
            boolean isLoanRequested =driver.findElement(RequestLoanPage.ConfirmationMessage()).isDisplayed();
            Assert.assertTrue(isLoanRequested);


    }
}
