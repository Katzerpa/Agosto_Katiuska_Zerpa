package Tests_Practico_10;

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

public class Practico10_E09 {
    private WebDriver driver;

    //Metodo InicializarPagina
    public WebDriver InicializarPagina(String url) {
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver" , chromeURL);
        driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
    @Test
    public void  fullRegistrationTest(){
        InicializarPagina("https://www.facebook.com/");
        Assert.assertEquals(driver.getTitle(),"Facebook - Entrar o registrarse","No es el título esperado");
        driver.findElement(By.id("u_0_2")).click();
        WebDriverWait myWaitVar = new WebDriverWait(driver, 20);
        myWaitVar.until(ExpectedConditions. elementToBeClickable(By.id("u_1_5")));
        WebElement nombre =   driver.findElement(By.name("firstname"));
        nombre.sendKeys("John");
        WebElement apellido=  driver.findElement(By.name("lastname"));
        apellido.sendKeys("Smith");
        WebElement telefono = driver.findElement(By.name("reg_email__"));
        telefono.sendKeys("5555555");
        WebElement clave = driver.findElement(By.name("reg_passwd__"));
        clave.sendKeys("123456789");
        setBirthdate(driver,"26","jun","1980");
        WebElement sexo = driver.findElement(By.id("u_1_5"));
        sexo.click();

    }
    public void setBirthdate(WebDriver driver, String day , String month , String year){
        WebElement dia = driver.findElement(By.name("birthday_day"));
        Select comboDia;
        comboDia = new Select(dia);
        comboDia.selectByValue(day);
        WebElement mes =  driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(mes);
        comboMes.selectByVisibleText(month);
        WebElement año = driver.findElement(By.name("birthday_year"));
        Select comboAño = new Select(año);
        comboAño.selectByVisibleText(year);
    }

}
