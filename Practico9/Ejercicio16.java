package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class Ejercicio16 {
    private WebDriver driver;
    int[] cantElemntos = new int[5];
    String[] nombreElemento = new String[5];
    int elementoMayor = 0;
    String nombreElementoMayor;
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
    public void buscarElemntosPaginaLoginYInicio(){
        InicializarPagina("https://www.netflix.com/uy/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de H1 es: " + listH1.size());
        cantElemntos[0] = listH1.size();
        nombreElemento[0]= "H1";
        for(WebElement lh1:listH1){
            System.out.println("---"+ lh1.getText());
        }
        System.out.println("La cantidad de H2 es: " + listH2.size());
        cantElemntos[1] = listH2.size();
        nombreElemento[1]= "H2";
        for(WebElement lh2:listH2){
            System.out.println("---"+ lh2.getText());
        }
        driver.navigate().back();
        driver.navigate().refresh();
        String titulo = driver.getTitle();
        System.out.println(" El titulo de la pagina es " + titulo);
        List<WebElement> listDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantida de Div es " + listDiv.size());
        cantElemntos[2] = listDiv.size();
        nombreElemento[2]= "Div";
        List<WebElement> listInput = driver.findElements(By.tagName("input"));
        System.out.println("La cantidad de Input es " + listInput.size());
        cantElemntos[3] = listInput.size();
        nombreElemento[3]= "Input";
        List<WebElement> listlink = driver.findElements(By.tagName("link"));
        System.out.println("La cantidad de links es " + listlink.size());
        cantElemntos[4] = listlink.size();
        nombreElemento[4]= "Link";

        for (int i = 0; i < cantElemntos.length ;i++){
            if(cantElemntos[i]> elementoMayor){
                elementoMayor = cantElemntos[i];
                nombreElementoMayor= nombreElemento[i];
            }
        }
        System.out.println("El elemento que mas se repite es: " + nombreElementoMayor + "  con la cantidad de: " + elementoMayor);
        driver.close();
    }

}
