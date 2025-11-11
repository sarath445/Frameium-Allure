package com.frameium.runner;

import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = {
                    "src/test/resources/Features/UFS/new.feature"
            },
            glue = {"com.frameium.stepdef"}
    )
    public class newrunner {
}
