package hepsiburada.pages;

import hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitapPage extends BasePage{
    public KitapPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[3]/li[1]/a[2]/span[1]")
    public WebElement roman;

    @FindBy(xpath = "//body/div[3]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/section[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/figure[1]/div[1]/img[1]")
    public WebElement kitap;

    @FindBy(xpath = "//button[@id='addToCart']")
    public WebElement addToCart;

    @FindBy(xpath = "//div[contains(text(),'Ürün sepetinizde')]")
    public WebElement message;

    @FindBy(xpath = "//a[contains(text(),'Sepete git')]")
    public WebElement sepeteGit;

    @FindBy(xpath = "//button[@id='continue_step_btn']")
    public WebElement tamamla;

    @FindBy(xpath = "//*[@id=\"continue_step_btn\"]")
    public WebElement devamEt;


}

