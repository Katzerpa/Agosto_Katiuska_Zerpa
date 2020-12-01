package Test_Practico_14.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class SaleForceHomePageLoandingPage extends BasePage {

    @FindBy(id = "signup_link") public  WebElement bntTrail;

    public SaleForceHomePageLoandingPage(WebDriver adriver) {
        this.driver = adriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);

    }


    public String ValidateTitle(){
        return driver.getTitle();
    }

    public SaleForceFreeTrialRegistrationPage clipButtonTrial() {
        bntTrail.click();
        return  new  SaleForceFreeTrialRegistrationPage(driver);
    }
}
