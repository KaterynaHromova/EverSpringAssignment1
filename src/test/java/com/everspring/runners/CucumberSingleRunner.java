package com.everspring.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions( glue = "com/everspring/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@LSF",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        })
public class CucumberSingleRunner extends AbstractTestNGCucumberTests {


        @Override
        @DataProvider(parallel = false)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}
