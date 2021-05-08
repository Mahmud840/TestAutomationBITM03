package com.WebdriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//launch Browser

public class LaunchFirefox {
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
        driver.close(); //Active tab shut down
       // driver.quit(); //Shut down full Browser
    }
}
