package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;

    @FindBy(id = "mat-input-0")
    WebElement userId;

    @FindBy(id = "mat-input-1")
    WebElement password;

    @FindBy(id = "kt_login_signin_submit")
    WebElement loginBtn;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String uid, String pwd) {
        userId.sendKeys(uid);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}
