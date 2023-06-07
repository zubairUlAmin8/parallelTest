package pages;


import element.googleElements;
import org.openqa.selenium.WebDriver;

public class Google {
    googleElements googleElement;
    public static WebDriver driver;
    public Google(WebDriver driver) {
        this.driver = driver;
        googleElement = new googleElements(driver);

    }
    public void nevigateandSendkey() {
        System.out.println(Thread.currentThread());
        driver.navigate().to("https://www.google.com/");
        googleElement.input.sendKeys("my name");
    }
}
