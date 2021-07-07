package com.bridgelabz.test;


import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.Logout;
import com.bridgelabz.utils.ReadExcelFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadExcelTest extends Base {
    @Test(dataProvider = "data-provider", dataProviderClass = ReadExcelFile.class)
    public static void getLogin(String userName, String password) throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName(userName, password);
        Thread.sleep(2000);
        Logout logout = new Logout(driver);
        logout.logout();
        Thread.sleep(2000);
        Assert.assertNotNull(login.getLogin(), "After Logout Login button should not be null");
    }

}


