package com.bridgelabz.test;

import com.bridgelabz.base.CrossBrowserBase;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTest extends CrossBrowserBase{
    @Parameters({"userName", "passWord"})
    @Test
    public static void loginToFlipkart(String userName, String passWord) throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName(userName,passWord);
        Thread.sleep(2000);
    }
}
