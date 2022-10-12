package TestCases;

import org.testng.annotations.Test;

public class testCase1 extends baseClass {
    @Test
    public void login() throws InterruptedException{
        loginPage.login();
    }
}
