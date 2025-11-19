package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Add_Customer {


    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    @FindBy(xpath = "//span[text()='My Customers']")
    WebElement customerMenu;

    @FindBy(xpath="//button[contains(@class,'mat-raised-button') and contains(text(),'Add Customer')]")
    WebElement addCustomerBtn;

    @FindBy(xpath = "//mat-label[contains(text(),'Lead/Customer Name')]/ancestor::mat-form-field//input")
    WebElement custName;

    @FindBy(xpath="//div[@class='col-lg-12']//button[contains(@class,'mat-raised-button') and contains(text(),'Save')]")
    WebElement saveBtn;

    @FindBy(xpath = "//div[contains(@class,'toast-message')]")
    WebElement toastMsg;

    // 👉 Correct Constructor
    public Add_Customer(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // Correct initialization
        this.js = (JavascriptExecutor) driver;                          // Correct initialization
        PageFactory.initElements(driver, this);
    }

    public void openCustomerMenu(){
        wait.until(ExpectedConditions.visibilityOf(customerMenu));
        customerMenu.click();
    }

    public void clickAddCustomer(){
        wait.until(ExpectedConditions.elementToBeClickable(addCustomerBtn));
        js.executeScript("arguments[0].click();", addCustomerBtn);
    }

    public void setCustName(String name){
        wait.until(ExpectedConditions.visibilityOf(custName));
        js.executeScript("arguments[0].value='" + name + "'; arguments[0].dispatchEvent(new Event('input'));", custName);
    }

    public void clickSave(){
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveBtn.click();
    }



    public String getToastMessage() {
        return toastMsg.getText();
    }

}
