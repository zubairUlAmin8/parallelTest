package org.example;

import driver.DriverManager;
import driver.TargetFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.*;
import pages.Facebook;
import pages.Google;

public class BaseTest {
    public  WebDriver driver;
    private ThreadLocal<String> testName = new ThreadLocal<>();
    public static Google google;
    public static Facebook facebook ;


    @BeforeClass
    public  void beforeSuite(@Optional("chrome") String browser) {
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.out.println("this is my BeforeSuite");
        driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
        System.out.println("Driver is created");
        google = new Google(driver);
        facebook = new Facebook(driver);
    }

    @AfterClass
    public void afterClass() {
//        driver.quit();
    }
}


