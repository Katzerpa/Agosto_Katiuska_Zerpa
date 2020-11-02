package Test_Practico_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.GetProperties;
import java.util.List;

public class Ejercicio_Spotify_Test_07 {
    private WebDriver driver;
    private static String SPOTIFY_URL = "https://www.spotify.com/uy/signup/";
    //Metodo InicializarPagina
    public WebDriver InicializarPagina(String url) {
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver" , chromeURL);
        driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
    @Test //Ejercicio 7
    public void spotifyByPlaceHolder(){
        InicializarPagina(SPOTIFY_URL);
        Assert.assertEquals(driver.getTitle(),"Registrarte - Spotify", "No es el titulo esperado");
        System.out.println(driver.getTitle());
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']"));
        email.sendKeys("Katz33@mailinator.com");
        WebElement confirmEmail = driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']"));
        confirmEmail.sendKeys("Katz33@mailinator.com");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']"));
        password.sendKeys("12345678");
        WebElement name = driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']"));
        name.sendKeys("Katzerpa45");
        WebElement day = driver.findElement(By.cssSelector("input[placeholder='DD']"));
        day.sendKeys("07");
        Assert.assertNotEquals(0,day);
        WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
        Select comboMes = new Select(month);
        List<WebElement> listMes = comboMes.getOptions();
        Assert.assertNotEquals(0,listMes.size());
        comboMes.selectByVisibleText("Enero");
        WebElement year = driver.findElement(By.cssSelector("input[placeholder='AAAA']"));
        year.sendKeys("1977");
        WebElement sexo = driver.findElement(By.cssSelector("#__next > main > div.signuppage__Signup-sof6g5-0.cnXhNZ > form > div:nth-child(7) > div.GenderSelect__FlexRow-v1a8zn-0.eHAjfo > label:nth-child(2) > span.Indicator-sc-16vj7o8-0.kSKYRE"));
        sexo.click();
        WebElement termino = driver.findElement(By.cssSelector("#__next > main > div.signuppage__Signup-sof6g5-0.cnXhNZ > form > div:nth-child(8) > label > span.Indicator-sc-11vkltc-0.dA-dPKg"));
        termino.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#v2-container > div > div > iframe")));
        WebElement robot = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")));
        robot.click();
        driver.manage().window().fullscreen();



    }
}
