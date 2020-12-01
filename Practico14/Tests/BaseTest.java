package Test_Practico_14.Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.GetProperties;
public class BaseTest {
    protected static WebDriver driver;
    @BeforeMethod
    public void setUp(){
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver" , chromeURL);
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void closePage() throws InterruptedException {
        Thread.sleep(30000);
       // driver.close();
    }
}
