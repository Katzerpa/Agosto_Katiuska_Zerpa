package Test_Practico_14.Page;


import Test_Practico_14.DataSet.DataFactoryRegistrationSalesForce;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.Serializable;
import java.util.List;




public class SaleForceFreeTrialRegistrationPage  extends BasePage implements Serializable {
    // Elementos del formulario de registro
    @FindBy(name = "UserFirstName") public WebElement firtName;
    @FindBy(name = "UserLastName")  public WebElement lastName;
    @FindBy(name = "UserTitle")     public WebElement title;
    @FindBy(name="UserPhone")       public WebElement phone;
    @FindBy(name = "UserEmail")     public WebElement  email;
    @FindBy(name = "CompanyName")   public WebElement companyName;
    @FindBy(css= "#onetrust-accept-btn-handler")  public WebElement bntAcceptCookies;
    @FindBy(name = "CompanyEmployees")  public WebElement employees;
    @FindBy(name="CompanyCountry")   public WebElement contry;
    @FindBy(name="CompanyState")     public WebElement state;
    @FindBy(name="CompanyLanguage")   public WebElement language;
    @FindBy( name="Iniciar prueba gratuita") public WebElement bntSubmit;
    @FindBy(name = "SubscriptionAgreement")  public WebElement checkBoxSubscriptionAgreement;

    public boolean errorFirstname = false;
    public boolean errorLastname = false;
    public boolean errorTitle = false;
    public boolean errorPhone = false;
    public boolean errorEmail = false;
    public boolean errorCompany = false;
    public boolean errorEmployees = false;
    public boolean errorlanguage = false;
    public boolean errorSubscriptionAgreement = false;
    public boolean buscarEmployees;
    public boolean buscarPais;
    public boolean buscarEstado;
    public boolean buscarLanguage;

    DataFactoryRegistrationSalesForce datos = new DataFactoryRegistrationSalesForce();
    VariablesPage variables = new VariablesPage();

    public SaleForceFreeTrialRegistrationPage(WebDriver adriver) {
        this.driver = adriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);

    }

    public String validateCurrentUrl(){
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();

    }


    public void makeClipButtonAcceptCookiestFreeTrial(){
        bntAcceptCookies.sendKeys(Keys.ENTER);

    }

    public void fillFromFreeTrailRegistration(){
        firtName.sendKeys(datos.getFirstName());
        lastName.sendKeys(datos.getLastName());
        title.sendKeys(datos.getTitle());
        email.sendKeys(datos.getEmail());
        phone.sendKeys(datos.getPhone());
        companyName.sendKeys(datos.getCompanyName());
    }

    public void fillFistLastName(){
       firtName.sendKeys(datos.getFirstName());
       lastName.sendKeys(datos.getLastName());
    }
    public WebElement getFirtName(String firstName) {
        return firtName;
    }

    public void setFirtName(WebElement unFirtName) {
        this.firtName = unFirtName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(WebElement unLastName) {
        this.lastName = unLastName;
    }

    public WebElement getTitle() {
        return title;
    }

    public void setTitle(WebElement unTitle) {
        this.title = unTitle;
    }

    public WebElement getPhone() {
        return phone;
    }

    public void setPhone(WebElement unPhone) {
        this.phone = unPhone;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement unEmail) {
        this.email = unEmail;
    }

    public WebElement getCompanyName() {
        return companyName;
    }

    public void setCompanyName(WebElement unacompanyName) {
        this.companyName = unacompanyName;
    }

    public void printSelectComboEmployees(){
        Select comboEmployees = new Select(employees);
        List<WebElement> listEmployees = comboEmployees.getOptions();
        for (WebElement l:listEmployees) {
            System.out.println(l.getText());

        }
    }
    public  void selectComboEmpleyess(String qtyEmployess){
        Select comboEmployees = new Select(employees);
        comboEmployees.selectByVisibleText(qtyEmployess);
        List<WebElement> listEmployees = comboEmployees.getOptions();
        buscarEmployees = false;
        for (WebElement l:listEmployees) {
            if(l.getText().contentEquals(qtyEmployess)){
                buscarEmployees = true;
                break;
            }
        }
    }
    public  void selectComboContry(String unCountry ){
        System.out.println(unCountry);
        Select comboContry = new Select(contry);
        comboContry.selectByVisibleText(unCountry);
        List<WebElement> listContry = comboContry.getOptions();
        buscarPais = false;
        for (WebElement l:listContry) {
            System.out.println(unCountry + "  " +l.getText());
            if(l.getText().equalsIgnoreCase(unCountry)){
                buscarPais = true;
                break;
            }
        }

    }
    public void selectComboState(String unState){
        System.out.println(unState);
        Select comboState = new Select(state);
        comboState.selectByVisibleText(unState);
        List<WebElement> listContry = comboState.getOptions();
        buscarEstado = false;
        for (WebElement l:listContry) {
            System.out.println(unState + "  " +l.getText());
            if(l.getText().equalsIgnoreCase(unState)){
                buscarEstado = true;
                break;
            }
        }

    }


    public  void  selectComboLanguage(String idioma){
        Select comboLanguage = new Select(language);
        comboLanguage.selectByVisibleText(idioma);
        List<WebElement> listLanguage = comboLanguage.getOptions();
        buscarLanguage = false;
        for (WebElement l:listLanguage){
            if(l.getText().contentEquals(idioma)){
                buscarLanguage = true;
                break;
            }
        }

    }
    public void makeClipSubscriptionAgreement(){
        checkBoxSubscriptionAgreement.click();
    }

    public void makeClipButtonSubmit(){
        bntSubmit.sendKeys(Keys.ENTER);
    }

    public boolean errorMessagesSubscriptionAgreement(){
        List<WebElement> listaDeErrores = driver.findElements(By.className("error-msg-block"));
        variables.subscriptionAgreement = false;
        for (WebElement errores:listaDeErrores){
            System.out.println(errores.getText());
            if (errores.getText().equals(variables.MENSAJE_ERROR_ACEPTO_ACUERDO)) {
                variables.subscriptionAgreement = true;
                break;
            }
            }
        return variables.subscriptionAgreement;
        }




    public void listOfErrorMessage(){

        List<WebElement> listaDeErrores = driver.findElements(By.className("error-msg"));
        for (WebElement errores:listaDeErrores){
            System.out.println(errores.getText());
            if (errores.getText().equals(variables.MENSAJE_ERROR_FIRTS)){
                errorFirstname = true;
            }else if(errores.getText().equals(variables.MENSAJE_ERROR_LASTNAME)){
                errorLastname =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_TITLE)){
                errorTitle =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_EMAIL)){
                errorEmail =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_PHONE)){
                errorPhone =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_COMPANY)){
                errorCompany =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_EMPLOYESS)){
                errorEmployees =true;

            }else if(errores.getText().equals(variables.MENSAJE_ERROR_LANGUAGE)) {
                errorlanguage = true;

            }


        }

    }


}



