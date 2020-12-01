package Test_Practico_14.Tests;
import Test_Practico_14.Page.SaleForceFreeTrialRegistrationPage;
import Test_Practico_14.Page.SaleForceHomePageLoandingPage;
import Test_Practico_14.Utilidades.Constantes;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class SaleForceFreeTrialRegistrationTest extends BaseTest {

   @Test()
   public void testingErrorMessages(){
       driver.get(Constantes.SALESFORCE_URL);
       SaleForceHomePageLoandingPage saleForceHomePageLoandingPage = new SaleForceHomePageLoandingPage(driver);
       System.out.println(saleForceHomePageLoandingPage.ValidateTitle());
       Assert.assertEquals(saleForceHomePageLoandingPage.ValidateTitle(),"Iniciar sesión | Salesforce");
       SaleForceFreeTrialRegistrationPage trialRegistrationPage = saleForceHomePageLoandingPage.clipButtonTrial();
       assertTrue(trialRegistrationPage.validateCurrentUrl().contains("freetrial-sales"));
       trialRegistrationPage.makeClipButtonAcceptCookiestFreeTrial();
       trialRegistrationPage.fillFistLastName();
       trialRegistrationPage.makeClipButtonSubmit();
       trialRegistrationPage.listOfErrorMessage();
       Assert.assertFalse(trialRegistrationPage.errorFirstname);
       Assert.assertFalse(trialRegistrationPage.errorLastname);
       Assert.assertTrue(trialRegistrationPage.errorTitle);
       Assert.assertTrue(trialRegistrationPage.errorEmail);
       Assert.assertTrue(trialRegistrationPage.errorPhone);
       Assert.assertTrue(trialRegistrationPage.errorCompany);
       Assert.assertTrue(trialRegistrationPage.errorEmployees);
       Assert.assertTrue(trialRegistrationPage.errorlanguage);
       trialRegistrationPage.errorMessagesSubscriptionAgreement();

   }



  @Test()
    public void fillFormWithFakersTest() {
        driver.get(Constantes.SALESFORCE_URL);
        SaleForceHomePageLoandingPage saleForceHomePageLoandingPage = new SaleForceHomePageLoandingPage(driver);
        System.out.println(saleForceHomePageLoandingPage.ValidateTitle());
        Assert.assertEquals(saleForceHomePageLoandingPage.ValidateTitle(),"Iniciar sesión | Salesforce");
        SaleForceFreeTrialRegistrationPage trialRegistrationPage = saleForceHomePageLoandingPage.clipButtonTrial();
        assertTrue(trialRegistrationPage.validateCurrentUrl().contains("freetrial-sales"));
        trialRegistrationPage.makeClipButtonAcceptCookiestFreeTrial();
        trialRegistrationPage.fillFromFreeTrailRegistration();
        trialRegistrationPage.printSelectComboEmployees();
        trialRegistrationPage.selectComboEmpleyess("21 - 99 empleados");
        assertTrue(trialRegistrationPage.buscarEmployees);
        trialRegistrationPage.selectComboContry("Estados Unidos");
        assertTrue(trialRegistrationPage.buscarPais);
        trialRegistrationPage.state.isDisplayed();
        trialRegistrationPage.selectComboState("Connecticut");
        assertTrue(trialRegistrationPage.buscarEstado);
        trialRegistrationPage.selectComboLanguage("Inglés");
        assertTrue(trialRegistrationPage.buscarLanguage);
        trialRegistrationPage.makeClipButtonSubmit();
        assertTrue(trialRegistrationPage.errorMessagesSubscriptionAgreement());


    }
}
