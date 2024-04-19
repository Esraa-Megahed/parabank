package testes;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {



String FirstNameField=("esraa");
String LastNameField=("reda");
String AddressField=("mansoura");
String cityField=("mansoura");
String State=("egipt");
String ZipCode=("23567");
String Phone=("1068529912");
String SSN= ("9");
String UserName=("rositaaaoaaa");
String PassWord=("Vois_999999");
String Confirm=("Vois_999999");

@DataProvider(name="testData")

public  Object[][]mdata(){
   return new Object[][]{
           {FirstNameField,LastNameField,AddressField,cityField,State,ZipCode,Phone,SSN,UserName,PassWord,Confirm,"",true},
           {"",LastNameField,AddressField,cityField,State,ZipCode,Phone,SSN,UserName,PassWord,Confirm,"firstName",false},
           {FirstNameField,"",AddressField,cityField,State,ZipCode,Phone,SSN,UserName,PassWord,Confirm,"lastName",false},
           {FirstNameField,LastNameField,"",cityField,State,ZipCode,Phone,SSN,UserName,PassWord,Confirm,"address.street",false}

   };
}

@Test(dataProvider ="testData" )
    public void  validRegister(String FirstNameField,String LastNameField,String AddressField,String cityField, String StateField,String ZipCodeField, String PhoneField,String SSNField,String UserNameField,String PassWordField,String ConfirmField,String targetName,boolean expectedResult){
        RegisterPage registerPage= new RegisterPage(driver);
       registerPage.register();
        registerPage.createUser(FirstNameField,LastNameField,AddressField,cityField,StateField,ZipCodeField,PhoneField,SSNField,UserNameField,PassWordField,ConfirmField);
    if (expectedResult) {
        Assert.assertTrue (registerPage.verifyCreateUser());

    }
    else {
        Assert.assertTrue (registerPage.verifyUserNotCreated(targetName));
    }



    }

@Test
    public void testRedirectionToRegisterPage(){
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.register();
        Assert.assertTrue(registerPage.verifyrRedirectiontoRegister());
}



}
