package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pr.facebookPR;
import pr.googlePR;

public class googleElements {
    @FindBy(css = googlePR.input)
    public WebElement input;


    WebDriver driver;

    public googleElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
