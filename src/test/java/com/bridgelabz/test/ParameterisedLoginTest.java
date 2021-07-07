package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedLoginTest extends Base {

    @Parameters({"userName", "passWord"})
    @Test
    public void loginToApplication(String userName, String passWord) throws InterruptedException {
        Login login = new Login(driver);
        login.getUserName(userName,passWord);
    }
}
