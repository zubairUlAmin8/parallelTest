package org.example;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class google extends BaseTest{

    // To log in flipkart
//    @Test
    public void login() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("my name");

    }
    @Test
    public void Testlogin() {
        google.nevigateandSendkey();
    }
}

