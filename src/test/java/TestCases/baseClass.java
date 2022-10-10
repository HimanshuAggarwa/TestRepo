package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pageTest.loginPage;

public class baseClass {

    static WebDriver wb;
    loginPage loginPage;
//    logIn logIn;
//    productsOnCart productsOnCart;
//    assertion assertion;
//    wishList addingToWishlist;


    @BeforeSuite
    public void initBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--start-maximized");
        wb= new ChromeDriver(options);
        wb.get("WEB_URL");
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        System.out.println("tear down");
        Thread.sleep(5000);
        wb.quit();
    }

    @BeforeClass
    public void callingObject(){
        loginPage= new loginPage(wb);
//        logIn= new logIn(wb);
//        productsOnCart= new productsOnCart(wb);
//        assertion= new assertion(wb);
//        addingToWishlist= new wishList(wb);
    }
}
