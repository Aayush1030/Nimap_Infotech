package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Page {
    WebDriver driver;

    @FindBy(xpath="//button[contains(text(),'Punch In')]")
    WebElement punchInBtn;

    @FindBy(css=".Toastify__toast-body")
    WebElement toastMsg;

    public Dashboard_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickPunchIn() {
        punchInBtn.click();
    }

    public String getToastMessage() {
        return toastMsg.getText();
    }

}
