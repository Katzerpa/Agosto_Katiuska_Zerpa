package Test_Practico_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GetProperties;
import java.util.List;

public class Test_spotifyTestWithParameters {
    private WebDriver driver;
    private static String SPOTIFY_URL = "https://www.spotify.com/uy/signup/";

    @BeforeMethod
    public void setUp() {
        GetProperties properties = new GetProperties();
        String chromeURL = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver" , chromeURL);
        driver = new ChromeDriver();
        driver.get(SPOTIFY_URL);
    }

    @Test
    @Parameters({"specificTag"})
    public void spotifyTags(@Optional("h2") String specificTagName) {
        List<WebElement> listH = driver.findElements(By.tagName(specificTagName));

        if (listH.isEmpty() == false) {
            if (specificTagName.equals("h1")) {
                System.out.println("La cantidad de H1 es de " + listH.size() + " son las siguientes:");
            } else if (specificTagName.equals("h2")) {
                System.out.println("La cantidad de H2 es de " + listH.size() + " son las siguientes:");
            } else if (specificTagName.equals("h3")) {
                System.out.println("La cantidad de H3 es de " + listH.size() + " son las siguientes:");
            } else if (specificTagName.equals("h4")) {
                System.out.println("La cantidad de H4 es de " + listH.size() + " son las siguientes:");
            } else if (specificTagName.equals("h5")) {
                System.out.println("La cantidad de H5 es de " + listH.size() + " son las siguientes:");
            } else if (specificTagName.equals("h6")) {
                System.out.println("La cantidad de H6 es de " + listH.size() + " son las siguientes:");
            }

        } else {
            System.out.println("No hay elemento " + specificTagName);
        }

        for (WebElement listadoH : listH) {
            System.out.println("---> " + listadoH.getText());
        }
    }

    @BeforeMethod
    public void closedBrowser() {
        driver.close();
    }

}

