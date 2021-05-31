package com.everspring.pages;

import com.everspring.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadSubmissionPage {

    public LeadSubmissionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(how = How.ID, using = "https://lead.universityadmissions.info/lead/seattle/business/mba/general")
    private WebElement mbaRadioBtn;

    @FindBy(how = How.ID, using = "https://lead.universityadmissions.info/lead/seattle/business/msba/general")
    private WebElement msbaRadioBtn;

    @FindBy(how = How.XPATH, using = "//div[@role='progressbar']")
    private WebElement progressBar;

    @FindBy(how = How.CLASS_NAME, using = "FormA-title")
    private WebElement title;

    @FindBy(how = How.CSS, using = ".FormA-buttons-next>button")
    private WebElement nextBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@name='fullname']")
    private WebElement fullNameInput;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@name='fullname']/..//*[@class='icon-warning']")
    private WebElement fullNameIconWarning;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@type='email']")
    private WebElement emailInput;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@type='email']/..//*[@class='icon-warning']")
    private WebElement emailIconWarning;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@name='phone']")
    private WebElement phoneNumberInput;

    @FindBy(how = How.XPATH, using = "//div[@class='Fieldset-items-item']//input[@name='phone']/..//*[@class='icon-warning']")
    private WebElement phoneNumberIconWarning;

    @FindBy(how = How.CSS, using = "div.FormA-buttons-submit>button")
    private WebElement submitBtn;

    @FindBy(how = How.CLASS_NAME, using = "FormA-disclaimer")
    private WebElement disclaimer;


    //Getters


    public WebElement getMbaRadioBtn() {
        return mbaRadioBtn;
    }

    public WebElement getMsbaRadioBtn() {
        return msbaRadioBtn;
    }

    public WebElement getProgressBar() {
        return progressBar;
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public WebElement getFullNameInput() {
        return fullNameInput;
    }

    public WebElement getFullNameIconWarning() {
        return fullNameIconWarning;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getEmailIconWarning() {
        return emailIconWarning;
    }

    public WebElement getPhoneNumberInput() {
        return phoneNumberInput;
    }

    public WebElement getPhoneNumberIconWarning() {
        return phoneNumberIconWarning;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getDisclaimer() {
        return disclaimer;
    }
}
