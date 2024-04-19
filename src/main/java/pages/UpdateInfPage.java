package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateInfPage {
    private final WebDriver driver;

    public UpdateInfPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By firstNameField = By.id("customer.firstName");
    private final By lastNameField = By.id("customer.lastName");
    private final By addressField = By.id("customer.address.street");
    private final By cityField = By.id("customer.address.city");
    private final By stateField = By.id("customer.address.state");
    private final By zipCodeField = By.id("customer.address.zipCode");
    private final By phoneField = By.id("customer.phoneNumber");
    private final By updateProfileButton = By.xpath("//input[@value=\"Update Profile\"]");
    private final By confirmationMessage = By.xpath("//h1[text()=\"Profile Updated\"]");

    public static By ConfirmationMessage() {
        return By.xpath("//h1[text()=\"Profile Updated\"]");
    }

    public void newUpdate(By fieldLocator, String newValue) throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(fieldLocator).clear();
        driver.findElement(fieldLocator).sendKeys(newValue);
        driver.findElement(updateProfileButton).click();
    }

    public void updateInf(String firstName, String lastName, String address, String city, String state, String zipCode, String phone) {
        driver.findElement(getFirstNameField()).sendKeys(firstName);
        driver.findElement(getLastNameField()).sendKeys(lastName);
        driver.findElement(getAddressField()).sendKeys(address);
        driver.findElement(getCityField()).sendKeys(city);
        driver.findElement(getStateField()).sendKeys(state);
        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public void updateInf(String lastName, String address, String city, String state, String zipCode, String phone) {

        driver.findElement(getLastNameField()).sendKeys(lastName);
        driver.findElement(getAddressField()).sendKeys(address);
        driver.findElement(getCityField()).sendKeys(city);
        driver.findElement(getStateField()).sendKeys(state);
        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public void updateInf(String address, String city, String state, String zipCode, String phone) {

        driver.findElement(getAddressField()).sendKeys(address);
        driver.findElement(getCityField()).sendKeys(city);
        driver.findElement(getStateField()).sendKeys(state);
        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public void updateInf(String city, String state, String zipCode, String phone) {

        driver.findElement(getCityField()).sendKeys(city);
        driver.findElement(getStateField()).sendKeys(state);
        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();


    }

    public void updateInf(String state, String zipCode, String phone) {


        driver.findElement(getStateField()).sendKeys(state);
        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public void updateInf(String zipCode, String phone) {


        driver.findElement(getZipCodeField()).sendKeys(zipCode);
        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public void updateInf(String phone) {


        driver.findElement(getPhoneField()).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

    }

    public By getFirstNameField() {
        return firstNameField;
    }

    public By getLastNameField() {
        return lastNameField;
    }

    public By getAddressField() {
        return addressField;
    }

    public By getCityField() {
        return cityField;
    }

    public By getStateField() {
        return stateField;
    }

    public By getZipCodeField() {
        return zipCodeField;
    }

    public By getPhoneField() {
        return phoneField;
    }
}
