package testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage2;
import pages.HomePage;
import pages.RegisterPage;

public class CreateAccountTest2 extends BaseTest {
    String FirstNameField=("esraa");
    String LastNameField=("reda");
    String AddressField=("mansoura");
    String cityField=("mansoura");
    String StateField=("egipt");
    String ZipCodeField=("23567");
    String PhoneField=("1068529912");
    String SSNField= ("9");
    String UserNameField=("soe o0saa");
    String PassWordField=("Vois_999999");
    String ConfirmField=("Vois_999999");
    @Test
    public void validateCreateAccount(){
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.register();

        registerPage.createUser(FirstNameField,LastNameField,AddressField,cityField,StateField,ZipCodeField,PhoneField,SSNField,UserNameField,PassWordField,ConfirmField);

        HomePage homePage =new HomePage(driver);
        homePage.newAccount();
        CreateAccountPage2 createAccountPage2= new CreateAccountPage2(driver);
        createAccountPage2.SetSelect();

     boolean isAccountCreated=driver.findElement(CreateAccountPage2.accountOpened()).isDisplayed();
      Assert.assertTrue(isAccountCreated);
}
}
