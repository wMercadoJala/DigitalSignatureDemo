package digital;

import digital.framework.DriverManager;
import digital.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Walter Mercado on 2/1/2017.
 */
public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "login-username-input")
    WebElement userNameField;

    @FindBy(id = "login-password-input")
    WebElement passwordField;

    @FindBy(id = "login-ok-button")
    WebElement loginBtn;

    public LoginPage(){
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(this.driver,this);

        this.wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(this.driver,this);
    }

    public MainPage loginAs(String userName,String password){
        this.setUserName(userName);
        this.setPassword(password);
        this.clickLoginBtn();

        return new MainPage(this.driver);
    }

    public void setUserName(String userName){
        try{
            this.wait.until(ExpectedConditions.visibilityOf(userNameField));
            userNameField.clear();
            userNameField.sendKeys(userName);
        }
        catch(WebDriverException e){
            throw new  WebDriverException(e);
        }
    }

    public void setPassword(String password){
        try{
            wait.until(ExpectedConditions.visibilityOf(passwordField));
            passwordField.clear();
            passwordField.sendKeys(password);
        }
        catch(WebDriverException e){
            throw new  WebDriverException(e);
        }
    }

    public void clickLoginBtn(){
        try{
            wait.until(ExpectedConditions.visibilityOf(passwordField));
            this.loginBtn.click();
        }
        catch(WebDriverException e){
            throw new  WebDriverException(e);
        }
    }
}
