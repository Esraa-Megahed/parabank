package testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BillPayPage;
import pages.CreateAccountPage2;
import pages.HomePage;
import pages.RegisterPage;

public class BillPayTest extends BaseTest{
    String PayeeNameField="esraa";

    String addressField="Mansoura";
    String cityField ="Mansoura";
    String StateField="Mansoura ";
    String ZipcodeField="9" ;
    String PhoneField="01068529912" ;
    String AccountField="1234498";
    String VerifyAccountField="1234498";
    String AmountField="5000";
    String FromAccountField="18561";
    String FirstNameField=("esraa");
    String LastNameField=("reda");
    String AddressField=("mansoura");
    String cityField2=("mansoura");
    String StateField2=("egipt");
    String ZipCodeField=("23567");
    String PhoneField2=("1068529912");
    String SSNField= ("9");
    String UserNameField=("soeoi00saa");
    String PassWordField=("Vois_999999");
    String ConfirmField=("Vois_999999");


    @Test
    public void ValidateBillPay() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();
        registerPage.createUser(FirstNameField, LastNameField, AddressField, cityField2, StateField2, ZipCodeField, PhoneField2, SSNField, UserNameField, PassWordField, ConfirmField);
        HomePage homePage = new HomePage(driver);
        homePage.billBay();
        BillPayPage billPayPage = new BillPayPage(driver);
        billPayPage.createBillPayment(PayeeNameField = "esraa", addressField = "Mansoura", cityField = "Mansoura", StateField = "Mansoura ", ZipcodeField = "9", PhoneField = "01068529912", AccountField = "1234498", VerifyAccountField = "1234498", AmountField = "5000", FromAccountField = "18561");
        boolean isPaymentCompleted = driver.findElement(BillPayPage.PaymentComplete()).isDisplayed();
        Assert.assertTrue(isPaymentCompleted);


    }
   }

