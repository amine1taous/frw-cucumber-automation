package com.e2etests.automation.page_objects;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private ConfigFileReader configFileReader;

    /* @FindBy */
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='REGISTER']")
    private WebElement btnRegister;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement firstName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement lastName;

    @FindBy(how = How.NAME, using = "phone")
    private WebElement phone;

    @FindBy(how = How.ID, using = "userName")
    private WebElement email;

    @FindBy(how = How.NAME, using = "address1")
    private WebElement adresse;

    @FindBy(how = How.NAME, using = "city")
    private WebElement city;

    @FindBy(how = How.NAME, using = "state")
    private WebElement state;

    @FindBy(how = How.NAME, using = "postalCode")
    private WebElement codePostale;

    @FindBy(how = How.NAME, using = "country")
    private WebElement country;

    @FindBy(how = How.ID, using = "email")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "confirmPassword")
    private WebElement confirmpassword;

    @FindBy(how = How.NAME, using = "submit")
    private WebElement btnEnvoyer;

    @FindBy(how = How.XPATH, using = "//font[contains(text(),'Thank you for registering.')]")
    private WebElement confirmationMessage;

    public RegisterPage() {
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
    }

    /* Create Methods */

    public void goToURL() {
        Setup.getDriver().get(configFileReader.getProperties("home.url"));
    }

    public void clickOnRegisterButton() {
        btnRegister.click();
    }

    public void fillFirstName(String prenom) {
        firstName.sendKeys(prenom);
    }

    public void fillLastName(String nom) {
        lastName.sendKeys(nom);
    }

    public void fillPhone(String tel) {
        phone.sendKeys(tel);
    }

    public void fillEmail(String mail) {
        email.sendKeys(mail);
    }

    public void fillAdresse(String adress) {
        adresse.sendKeys(adress);
    }

    public void fillCity(String cityy) {
        city.sendKeys(cityy);
    }

    public void fillState(String province) {
        state.sendKeys(province);
    }

    public void fillCodePostale(String code) {
        codePostale.sendKeys(code);
    }

    public void fillCountry(String pays) {
        //country.sendKeys(pays);
    	Select dropDownList = new Select(country);
    	
    	dropDownList.selectByValue(pays);
    }

    public void fillUserName(String username) {
        userName.sendKeys(username);
    }

    public void fillPassword(String pass) {
        password.sendKeys(pass);
    }

    public void fillConfirmationPassword(String confirmpass) {
        confirmpassword.sendKeys(confirmpass);
    }

    public void clickOnEnvoyerButton() {
        btnEnvoyer.click();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
