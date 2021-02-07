package hepsiburada.pages;

import hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYapBtn;

    @FindBy(xpath = "//span[contains(text(),'Kitap, Müzik, Film, Hobi')]")
    public WebElement kitapMuzikFilm;
}
