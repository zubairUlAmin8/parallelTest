

package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.TRUE;

public enum BrowserFactory {

    CHROME {
        @Override
        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

            return new ChromeDriver(getOptions());
        }

        @Override
        public ChromeOptions getOptions() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            return options;
        }
    };


    public abstract WebDriver createDriver();

    public abstract MutableCapabilities getOptions();
}
