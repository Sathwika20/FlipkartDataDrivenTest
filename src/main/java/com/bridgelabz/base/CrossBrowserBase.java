package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserBase {
    public static WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws InterruptedException {
        if(browser.equalsIgnoreCase("firefox")){
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
           driver.manage().window().maximize();
           driver.get("https://www.flipkart.com/");

        }
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");

        }
        if(browser.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
        }
    }
    //After execution
    @AfterTest
    public void tearDown() {
        //used to close the current window
        driver.close();
    }
}
