package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {
    private final WebDriver driver;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By amountField = By.id("amount");
    private final By fromAccountField = By.id("fromAccountId");
    private final By toAccountField = By.id("toAccountId");
    private final By TransferButton = By.xpath("//input[@value=\"Transfer\"]");

    public void transferFunds(String amount) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountField)).sendKeys(amount);

        Select selectFromAccount = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(fromAccountField)));
        selectFromAccount.selectByIndex(0);

        Select selectToAccount = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(toAccountField)));
        selectToAccount.selectByIndex(0);
        new Actions(driver).click((driver.findElement(TransferButton))).build().perform();
//        wait.until(ExpectedConditions.elementToBeClickable(TransferButton)).click();


    }

}
