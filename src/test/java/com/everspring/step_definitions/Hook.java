package com.everspring.step_definitions;


import com.everspring.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    Logger log = Logger.getLogger(Hook.class);

    @Before
    public void setUp(Scenario scenario){
        log.debug(scenario.getName());
    }

    @After()
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png", scenario.getName());
        }


        Driver.closeDriver();


    }




}
