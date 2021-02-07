package hepsiburada.step_definitions;

import hepsiburada.pages.LoginPage;
import hepsiburada.utilities.BrowserUtils;
import hepsiburada.utilities.ConfigurationReader;
import hepsiburada.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;


public class loginStepDefs {
    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user clicks on giris yap")
    public void the_user_clicks_on_giris_yap() {

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(new LoginPage().girisYapBtn).perform();

        BrowserUtils.waitForVisibility(new LoginPage().girisYap,10);
        new LoginPage().girisYap.click();


    }
    @When("the user enters valid credentials and click giris yap button")
    public void the_user_enters_valid_credentials_and_click_giris_yap_button() {

        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");

        BrowserUtils.waitForVisibility(new LoginPage().email,10);
        new LoginPage().email.sendKeys(email);
        new LoginPage().password.sendKeys(password);
        new LoginPage().giris.click();

    }
    @Then("the user should be able to logged in")
    public void the_user_should_be_able_to_logged_in() {

    }
}
