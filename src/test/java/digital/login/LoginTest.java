package digital.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import digital.LoginPage;
import digital.MainPage;
import digital.data.User;
import digital.framework.DriverManager;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Walter Mercado on 2/1/2017.
 */

public class LoginTest {
    private LoginPage login;
    private List<User> users =  new ArrayList<User>();
    private MainPage mainPage;

    @Given("^I open the Home page$")
    public void I_open_the_Home_page() throws Throwable {
        login = new LoginPage();
    }

    @When("I introduce the credentials")
    public void I_introduce_the_credentials(DataTable dataTable) throws Throwable {

        users = dataTable.asList(User.class);

        for (int i = 0; i < users.size(); i++) {
            mainPage = login.loginAs(users.get(i).username,users.get(i).username);
        }
    }

    @Then("I have access to Management page")
    public void I_have_access_to_Management_page() throws Throwable {
        Assert.assertTrue(mainPage.validateTittle());

        DriverManager driverManager = DriverManager.getInstance();
        driverManager.quit();
    }
}
