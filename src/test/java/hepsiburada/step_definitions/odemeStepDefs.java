package hepsiburada.step_definitions;

import hepsiburada.pages.OdemePage;
import hepsiburada.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class odemeStepDefs {
    @Given("the user is on odeme page")
    public void the_user_is_on_odeme_page() {

    }


    @When("the user clicks on aninda havale and select an option")
    public void the_user_clicks_on_aninda_havale_and_select_an_option() {

        BrowserUtils.waitForVisibility(new OdemePage().anindaHavale,10);
        new OdemePage().anindaHavale.click();
        BrowserUtils.waitForVisibility(new OdemePage().bankOption,10);
        new OdemePage().bankOption.click();
        BrowserUtils.waitForVisibility(new OdemePage().bankOptionNext,10);
        new OdemePage().bankOptionNext.click();


    }
    @Then("the user should click on devam et")
    public void the_user_should_click_on_devam_et() {

        new OdemePage().devamEt.click();

    }
    @When("the user clicks on siparisi onayla")
    public void the_user_clicks_on_siparisi_onayla() {

        BrowserUtils.waitForVisibility(new OdemePage().siparisiOnayla,10);
        new OdemePage().siparisiOnayla.click();
    }
    @Then("the user should be able to see bank option page and cancel by clicking on cancel button")
    public void the_user_should_be_able_to_see_bank_option_page_and_cancel_by_clicking_on_cancel_button() {

        BrowserUtils.waitForVisibility(new OdemePage().iptal,10);
        new OdemePage().iptal.click();

        BrowserUtils.waitForVisibility(new OdemePage().evetOnay,10);
        new OdemePage().evetOnay.click();


    }
}
