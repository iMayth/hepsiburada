package hepsiburada.step_definitions;

import hepsiburada.pages.KitapPage;
import hepsiburada.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class sepetStepDefs {
    @Given("the user is on the kitap page")
    public void the_user_is_on_the_kitap_page() {

    }


    @When("the user clicks on sepete ekle")
    public void the_user_clicks_on_sepete_ekle() {

        BrowserUtils.waitForVisibility(new KitapPage().addToCart,10);
        new KitapPage().addToCart.click();

    }
    @Then("the user should be able to see urun sepetinizde message")
    public void the_user_should_be_able_to_see_urun_sepetinizde_message() {

        BrowserUtils.waitForVisibility(new KitapPage().message,10);

        Assert.assertTrue(new KitapPage().message.isDisplayed());

    }
    @When("the user clicks on sepete git")
    public void the_user_clicks_on_sepete_git() {

        new KitapPage().sepeteGit.click();

    }
    @Then("the user should be able to click alisverisi tamamla")
    public void the_user_should_be_able_to_click_alisverisi_tamamla() {

        BrowserUtils.waitForVisibility(new KitapPage().tamamla,10);
        new KitapPage().tamamla.click();

    }

    @Then("the user should be able to click devam et")
    public void the_user_should_be_able_to_click_devam_et() {
        BrowserUtils.waitForVisibility(new KitapPage().devamEt,10);
        new KitapPage().devamEt.click();

    }
}
