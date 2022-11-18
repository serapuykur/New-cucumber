package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQAPage {
    DemoQAPage demoqa=new DemoQAPage();

    public DemoQAPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath="visibleAfter")
    public WebElement visible;
}
