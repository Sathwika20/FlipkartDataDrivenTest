package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends Base {

    @FindBy(xpath = "//div[@class = '_28p97w']")
    private WebElement sathwika;

    @FindBy(xpath = "//div[text() = 'Logout']")
    private WebElement logout;

    //Generate a constructor
    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Actions class is used to hover on to the element
    public void logout() throws InterruptedException {
        Actions actions = new Actions(this.driver);
        actions.moveToElement(this.sathwika).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(this.logout).click().perform();
        Thread.sleep(3000);
    }

}
