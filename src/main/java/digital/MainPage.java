package digital;

import digital.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Walter Mercado on 2/1/2017.
 */

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a/span[contains(.,'Digital Signage')]")
    WebElement tittle;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(this.driver,this);
    }

    public Boolean validateTittle() {
        this.wait.until(ExpectedConditions.visibilityOf(tittle));
        return tittle.getText().equals("Digital Signage");
    }

}


