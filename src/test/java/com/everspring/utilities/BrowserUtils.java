package com.everspring.utilities;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    //Wait for page to complete load
    public static void waitForPageToLoad() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.parseLong(ConfigurationReader.getProperty("waitTime")));
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    //Wait until element becomes clickable

    public static WebElement waitUntilElementIsClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.parseLong(ConfigurationReader.getProperty("waitTime")));

        return  wait.ignoring(StaleElementReferenceException.class).ignoring(ElementClickInterceptedException.class).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    //Wait until element becomes visible
    public static WebElement waitUntilElementIsVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Long.parseLong(ConfigurationReader.getProperty("waitTime")));

        return  wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(webElement));
    }
}
