package hepsiburada.pages;

import hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdemePage extends BasePage{
    public OdemePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Anında Havale')]")
    public WebElement anindaHavale;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    public WebElement bankOption;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]/label[1]/input[1]")
    public WebElement bankOptionNext;

    @FindBy(xpath = "//button[@id='continue_step_btn']")
    public WebElement devamEt;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]")
    public WebElement siparisiOnayla;

    @FindBy(xpath = "//div[contains(text(),'Alışveriş Sitesine Geri Dön')]")
    public WebElement iptal;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[2]/div/a[2]")
    public WebElement evetOnay;



}
