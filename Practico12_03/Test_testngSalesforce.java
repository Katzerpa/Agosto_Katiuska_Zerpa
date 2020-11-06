package Test_Practico_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class Test_testngSalesforce {
    private WebDriver driver;
    private static String SALESFORCE_URL = "https://login.salesforce.com/";
    @BeforeMethod
    public void setUp(){
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver" , chromeURL);
        driver = new ChromeDriver();
        driver.get(SALESFORCE_URL);
    }
    @Test(priority =0, enabled = false)
    public void validateTiTle(){
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Iniciar sesión | Salesforce");
    }
    @Test(priority = 1)
    public void validateSalesforceLogoTest(){
        WebElement logo = driver.findElement(By.id("logo"));
        System.out.println(logo.getTagName());
        System.out.println(logo.getAttribute("alt"));
    }
    @Test(priority = 4, enabled = false)
    public void RememberMeIsSelected(){
        WebElement rememberMe = driver.findElement(By.id("rememberUn"));
        rememberMe.click();
        Assert.assertTrue(rememberMe.isSelected());

    }
    @Test(priority = 2)
    public void FooterIsValid(){
        WebElement footer = driver.findElement(By.id("footer"));
        Assert.assertTrue(footer.getText().contains("Reservados todos los derechos."));

    }
    @Test(priority = 3)
    public void LoginFailureTest() throws InterruptedException {
        WebElement logo = driver.findElement(By.id("logo"));
        Assert.assertTrue(logo.isDisplayed());
        System.out.println(logo.isDisplayed());
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("test@test.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");
        WebElement bntLogin = driver.findElement(By.id("Login"));
        bntLogin.click();
        Thread.sleep(3000);
        WebElement msjError = driver.findElement(By.cssSelector("#error"));
        System.out.println(msjError.getText());
        String errorEsperado = "El administrador del sistema ha desactivado su acceso a salesforce.com."+
                " Póngase en contacto con su administrador si desea obtener más información.";
        Assert.assertEquals(msjError.getText(),errorEsperado);


    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

}
