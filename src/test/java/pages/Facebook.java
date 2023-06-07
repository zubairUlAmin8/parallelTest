package pages;


import element.facebookElements;
import org.openqa.selenium.WebDriver;

public class Facebook {
    facebookElements facebookElement;
    WebDriver driver;
    public Facebook(WebDriver driver) {
        this.driver = driver;
        facebookElement = new facebookElements(driver);

    }
    public void nevigateandSendkey() {
        System.out.println(Thread.currentThread());
        driver.navigate().to("https://www.facebook.com/");
        facebookElement.input.sendKeys("my name");

    }
}
