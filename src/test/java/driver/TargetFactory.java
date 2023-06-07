/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package driver;


import org.example.Target;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class TargetFactory {



    public WebDriver createInstance(String browser) {
        Target target = Target.valueOf("LOCAL");
        WebDriver webdriver;

        switch (target) {
            case LOCAL:
                //Create new driver from Enum setup in BrowserFactory class
                webdriver = BrowserFactory.valueOf("CHROME").createDriver();
                break;
            default:
                throw new RuntimeException(target.toString());
        }
        return webdriver;
    }

}