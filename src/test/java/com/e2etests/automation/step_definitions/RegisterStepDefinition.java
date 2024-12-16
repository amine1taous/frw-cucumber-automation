package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

    private RegisterPage registerPage;

    public RegisterStepDefinition() {
        this.registerPage = new RegisterPage();
    }

    @Given("Je me connecte sur l application Mercury1")
    public void jeMeConnecteSurLApplicationMercury1() {
        registerPage.goToURL();
    }

    @Given("Je clique sur le bouton register")
    public void jeCliqueSurLeBoutonRegister() {
        registerPage.clickOnRegisterButton();
    }

    @When("Je saisis le first name {string}")
    public void jeSaisisLeFirstName(String firstName) {
        registerPage.fillFirstName(firstName);
    }

    @When("Je saisis le last name {string}")
    public void jeSaisisLeLastName(String lastName) {
        registerPage.fillLastName(lastName);
    }

    @When("Je saisis le phone {string}")
    public void jeSaisisLePhone(String phone) {
        registerPage.fillPhone(phone);
    }

    @When("Je saisis le email {string}")
    public void jeSaisisLeEmail(String email) {
        registerPage.fillEmail(email);
    }

    @When("Je saisis le adresse {string}")
    public void jeSaisisLeAdresse(String adresse) {
        registerPage.fillAdresse(adresse);
    }

    @When("Je saisis le city {string}")
    public void jeSaisisLeCity(String city) {
        registerPage.fillCity(city);
    }

    @When("Je saisis le state {string}")
    public void jeSaisisLeState(String state) {
        registerPage.fillState(state);
    }

    @When("Je saisis le code postale {string}")
    public void jeSaisisLeCodePostale(String codePostale) {
        registerPage.fillCodePostale(codePostale);
    }

    @When("Je saisis le country {string}")
    public void jeSaisisLeCountry(String country) {
        registerPage.fillCountry(country);
    }

    @When("Je saisis le user name pour enregistrement {string}")
    public void jeSaisisLeUsernamePourEnregistrement(String username) {
        registerPage.fillUserName(username);
    }

    @When("Je saisis le password {string}")
    public void jeSaisisLePassword(String password) {
        registerPage.fillPassword(password);
    }

    @When("Je saisis le confirmpassword {string}")
    public void jeSaisisLeConfirmationPassword(String confirmPassword) {
        registerPage.fillConfirmationPassword(confirmPassword);
    }

    @When("Je clique sur le bouton envoyer")
    public void jeCliqueSurLeBoutonEnvoyer() {
        registerPage.clickOnEnvoyerButton();
    }

    @Then("Je me redirige vers la page du register {string}")
    public void jeMeRedirigeVersLaPageDuRegister(String expectedMessage) {
        String confirmationMessage = registerPage.getConfirmationMessage();
        Assert.assertEquals("Le message de confirmation est incorrect.", expectedMessage, confirmationMessage);
    }
    
    
    /* with table filled with data */
    
    
    @When("Je saisi un data dans le champs firstname {string}")
    public void jeSaisiUnDataDansLeChampsFirstname(String firstname) {
    	registerPage.fillFirstName(firstname);
    }
    @When("je saisi un data dans le champs lastname {string}")
    public void jeSaisiUnDataDansLeChampsLastname(String lastname) {
    	registerPage.fillLastName(lastname);
    }
    @When("Je saisi un data dans le champs phone {string}")
    public void jeSaisiUnDataDansLeChampsPhone(String phonenumber) {
    	registerPage.fillPhone(phonenumber);
    }
    @When("Je saisi un data dans le champs mail {string}")
    public void jeSaisiUnDataDansLeChampsMail(String email) {
    	registerPage.fillEmail(email);
    }
    @When("Je saisi un data dans le champs adresse {string}")
    public void jeSaisiUnDataDansLeChampsAdresse(String adresse) {
    	registerPage.fillAdresse(adresse);
    }
    @When("Je saisi un data dans le champs city {string}")
    public void jeSaisiUnDataDansLeChampsCity(String city) {
    	registerPage.fillCity(city);
    }
    @When("Je saisi un data dans le champs state {string}")
    public void jeSaisiUnDataDansLeChampsState(String state) {
    	registerPage.fillState(state);
    }
    @When("Je saisi un data dans le champs code postale {string}")
    public void jeSaisiUnDataDansLeChampsCodePostale(String code) {
    	registerPage.fillCodePostale(code);
    }
    @When("Je saisi un data dans le champs country {string}")
    public void jeSaisiUnDataDansLeChampsCountry(String country) {
    	registerPage.fillCountry(country);
    }
    @When("Je saisi un data dans le champs username pour registerTC {string}")
    public void jeSaisiUnDataDansLeChampsUsernamePourRegisterTC(String username) {
    	registerPage.fillUserName(username);
    }
    @When("Je saisi un data dans le champs password pour registerTC {string}")
    public void jeSaisiUnDataDansLeChampsPasswordPourRegisterTC(String password) {
    	registerPage.fillPassword(password);
    }
    @When("Je saisi un data dans le champs confirmpassword pour registerTC {string}")
    public void jeSaisiUnDataDansLeChampsConfirmpasswordPourRegisterTC(String password) {
    	registerPage.fillConfirmationPassword(password);
    }
    @Then("Je me redirige vers la page du register du registerTC {string}")
    public void jeMeRedirigeVersLaPageDuRegisterDuRegisterTC(String string) {
    	String confirmationMessage = registerPage.getConfirmationMessage();
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", confirmationMessage);
    }

}
