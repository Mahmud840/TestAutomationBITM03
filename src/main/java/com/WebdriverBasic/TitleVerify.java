package com.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerify {
    public static void main(String[] args) {
        //Implement WebDriver
        WebDriver driver; //WebDriver=Selenium Interface, driver=Reference variable

        //Set browser Driver Path
        System.setProperty("webdriver.gecko.driver","E:\\QA Training\\Files\\geckodriver.exe");

        //launch Real Browser
        driver=new FirefoxDriver();
        //Window Maximize for chrome
        // driver.manage().window().maximize();
        // Open Test URL/Site
        driver.get("https://google.com");
        String expectedTitle="Bangladesh ";
        String actualTitle= driver.getTitle();
        //System.out.println(actualTitle);
        // Verify
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Matched ");
        }
        else{
            System.out.print("Title not match. Actual Title is "+actualTitle+" Expected Title is "+expectedTitle);
            driver.quit();
        }
    }
}
