package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class Ejercicio15 {
    private WebDriver driver;
    int[] cantElemntos = new int[7];
    String[] nombreElemento = new String[7];
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
    public void buscarElementosEnPaginaInicioNetflix(){
        InicializarPagina("https://www.netflix.com/uy/");
        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));
        List<WebElement> listH3 = driver.findElements(By.tagName("h3"));
        System.out.println("La cantidad de H1 es: " + listH1.size());
        cantElemntos[0] = listH1.size();
        nombreElemento[0]= "H1";
        System.out.println("La cantidad de H2 es: " + listH2.size());
        cantElemntos[1] = listH2.size();
        nombreElemento[1]= "H2";
        System.out.println("La cantidad de H3 es: " + listH3.size());
        cantElemntos[2] = listH3.size();
        nombreElemento[2]= "H3";
        driver.navigate().refresh();
        System.out.println("Los texto de los botones son:");
        List<WebElement> listButton = driver.findElements(By.tagName("button"));
        for(WebElement btn : listButton){
            if(!!listButton.isEmpty()){
                continue;
            }
            System.out.println("---" + btn.getText());
        }
        System.out.println("La cantidad de botones es : " + listButton.size());
        cantElemntos[3] = listButton.size();
        nombreElemento[3]= "Button";
        driver.manage().window().maximize();
        List<WebElement> listDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantida de Div es " + listDiv.size());
        cantElemntos[4] = listDiv.size();
        nombreElemento[4]= "Div";
        String titulo = driver.getTitle();
        System.out.println(" El titulo de la pagina es " + titulo);
        List<WebElement> listInput = driver.findElements(By.tagName("input"));
        System.out.println("La cantidad de Input es " + listInput.size());
        cantElemntos[5] = listInput.size();
        nombreElemento[5]= "Input";
        List<WebElement> listlink = driver.findElements(By.tagName("link"));
        System.out.println("La cantidad de links es " + listlink.size());
        cantElemntos[6] = listlink.size();
        nombreElemento[6]= "Link";

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
