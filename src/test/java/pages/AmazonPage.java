package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement  aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
    ////*[contains(text(), 'Authentication information not correct.')] kaybolan webeleemani bulma
    ////contains text() olayı tum web elementleri icinde, icerisinde text olarak 'şu'  text i iceren locateleri bul diyor.
    // bunu baska bir text icerigi ile aranan metni değistirerek te kullanabiliriz
    ////*[not(contains(text(), 'Authentication information not correct.'))]
}
