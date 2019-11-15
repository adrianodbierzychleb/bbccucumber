package com.spartaglobal.stepdefs;

import com.spartaglobal.bbcSeleniumExample.BbcSite.BbcSite;
import com.spartaglobal.bbcSeleniumExample.seleniumconfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BbcLoginStepDefs {

    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
    private BbcSite bbcSite = new BbcSite(seleniumConfig.getDriver());


    // Scenario: I receive a valid error when using an incorrect password

    @Given("I am on the sign in page")
    public void i_am_on_the_sign_in_page() {
        bbcSite.bbcSignInPage().goToSignInPage();
    }

    @When("I input a valid email")
    public void i_input_a_valid_email() {
        bbcSite.bbcSignInPage().inputUserName("hwdp@gmail.com");
    }

    @And("an invalid password")
    public void an_invalid_password() {
        bbcSite.bbcSignInPage().inputPassword("1234test");
    }

    @Then("I receive a valid error")
    public void i_receive_a_valid_error() {
        bbcSite.bbcSignInPage().clickSubmitButton();
        System.out.println(bbcSite.bbcSignInPage().passwordError());
    }

}
