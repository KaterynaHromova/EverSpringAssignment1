package com.everspring.pages;
import com.everspring.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class ThankYouPage {

    public ThankYouPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(how = How.CLASS_NAME, using = "RichTextModuleA-title")
    private WebElement title;

    //Getters


    public WebElement getTitle() {
        return title;
    }
}
