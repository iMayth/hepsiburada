package hepsiburada.step_definitions;

import hepsiburada.pages.KitapPage;
import hepsiburada.utilities.BrowserUtils;
import hepsiburada.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class kitapStepDefs {
    @Given("the user is on the main page of the website")
    public void the_user_is_on_the_main_page_of_the_website() {

    }


    @When("the user hovers over kitap menu")
    public void the_user_hovers_over_kitap_menu() {
        Actions act = new Actions(Driver.get());
        BrowserUtils.waitForVisibility(new KitapPage().kitapMuzikFilm,10);
        act.moveToElement(new KitapPage().kitapMuzikFilm).perform();



    }
    @Then("the user should be able to click on roman")
    public void the_user_should_be_able_to_click_on_roman() {
        BrowserUtils.waitForVisibility(new KitapPage().roman,10);
        new KitapPage().roman.click();
    }
    @When("the user clicks on any book")
    public void the_user_clicks_on_any_book() {
        new KitapPage().kitap.click();

    }

    @Then("the user should see add to cart")
    public void the_user_should_see_add_to_cart() {
        BrowserUtils.waitForVisibility(new KitapPage().addToCart,10);

        Assert.assertTrue(new KitapPage().addToCart.isDisplayed());
    }
}
