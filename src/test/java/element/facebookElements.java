package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pr.facebookPR;

public class facebookElements {
    @FindBy(css = facebookPR.input)
    public WebElement input;


    WebDriver driver;

    public facebookElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
