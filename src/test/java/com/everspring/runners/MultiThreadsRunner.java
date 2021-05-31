package com.everspring.runners;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( glue = "com/everspring/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@LSF",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        })
public class MultiThreadsRunner extends AbstractTestNGCucumberTests {


        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}
