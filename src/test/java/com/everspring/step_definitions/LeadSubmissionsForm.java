package com.everspring.step_definitions;

import com.everspring.constants.PageConstants;
import com.everspring.pages.LeadSubmissionPage;
import com.everspring.pages.ThankYouPage;
import com.everspring.utilities.ConfigurationReader;
import com.everspring.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


import static com.everspring.utilities.BrowserUtils.*;


public class LeadSubmissionsForm  implements PageConstants {

    LeadSubmissionPage leadSubmissionPage = new LeadSubmissionPage();
    ThankYouPage thankYouPage = new ThankYouPage();

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homePageUrl"));
        waitForPageToLoad();
    }

    @Then("user verifies progress bar value is {string}")
    public void userVerifiesProgressBarValueIs(String value) {

        String expected = waitUntilElementIsVisible(leadSubmissionPage.getProgressBar()).getAttribute("aria-valuenow");

        Assert.assertEquals(expected,value);

    }

    @And("user verifies title is displayed on the submission form")
    public void userVerifiesTitleIsDisplayedOnTheSubmissionForm() {

        Assert.assertTrue(waitUntilElementIsVisible(leadSubmissionPage.getTitle()).isDisplayed());
    }

    @When("user selects MBA option")
    public void userSelectsMBAOption() {
        waitUntilElementIsClickable(leadSubmissionPage.getMbaRadioBtn()).click();
    }

    @And("user clicks next button")
    public void userClicksNextButton() {
        waitUntilElementIsClickable(leadSubmissionPage.getNextBtn()).click();
    }

    @And("user clicks Get Brochure button")
    public void userClicksGetBrochureButton() {

        waitUntilElementIsClickable(leadSubmissionPage.getSubmitBtn()).click();
    }

    @Then("user verifies Full Name icon warning is displayed")
    public void userVerifiesFullNameIconWarningIsDisplayed() {

        Assert.assertTrue(waitUntilElementIsVisible(leadSubmissionPage.getFullNameIconWarning()).isDisplayed());
    }

    @And("user verifies Email icon warning is displayed")
    public void userVerifiesEmailIconWarningIsDisplayed() {
        Assert.assertTrue(waitUntilElementIsVisible(leadSubmissionPage.getEmailIconWarning()).isDisplayed());

    }

    @And("user verifies Phone Number icon warning is displayed")
    public void userVerifiesPhoneNumberIconWarningIsDisplayed() {
        Assert.assertTrue(waitUntilElementIsVisible(leadSubmissionPage.getPhoneNumberIconWarning()).isDisplayed());

    }

    @And("user inputs wrong email format")
    public void userInputsWrongEmailFormat() {

        String wrongEmail = new Faker().name().firstName();

        waitUntilElementIsClickable(leadSubmissionPage.getEmailInput()).sendKeys(wrongEmail);
    }


    @Then("user inputs valid data set {string}")
    public void userInputsValidDataSetFrom(String setNumber) {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName + " " + lastName;
        String phoneNumber = faker.phoneNumber().phoneNumber();

        String email = firstName + "." + lastName + ConfigurationReader.getProperty("testDomain");


        waitUntilElementIsClickable(leadSubmissionPage.getFullNameInput()).sendKeys(fullName);
        waitUntilElementIsClickable(leadSubmissionPage.getEmailInput()).sendKeys(email);
        waitUntilElementIsClickable(leadSubmissionPage.getPhoneNumberInput()).sendKeys(phoneNumber);
    }

    @Then("user verifies thank you page title is displayed")
    public void userVerifiesThankYouPageTitleIsDisplayed() {
        Assert.assertTrue(waitUntilElementIsVisible(thankYouPage.getTitle()).isDisplayed());
        Assert.assertEquals( waitUntilElementIsVisible(thankYouPage.getTitle()).getText(),THANK_YOU_PAGE_TITLE);
    }

    @And("user inputs wrong name format")
    public void userInputsWrongNameFormat() {
        String wrongName = new Faker().phoneNumber().phoneNumber();

        waitUntilElementIsClickable(leadSubmissionPage.getFullNameInput()).sendKeys(wrongName);
    }

    @And("user inputs wrong phone number")
    public void userInputsWrongPhoneNumber() {
        String wrongPhone = new Faker().lorem().word();

        waitUntilElementIsClickable(leadSubmissionPage.getPhoneNumberInput()).sendKeys(wrongPhone);
    }

    @When("user selects MSBA option")
    public void userSelectsMSBAOption() {
        waitUntilElementIsClickable(leadSubmissionPage.getMsbaRadioBtn()).click();
    }
}
