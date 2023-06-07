package org.example;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class facebook extends BaseTest{



    // To log in flipkart
//    @Test
    public void login() {
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#email")).sendKeys("my name");
    }
   @Test
    public void Testlogin() {
        facebook.nevigateandSendkey();
    }


}