package com.frameium.stepdef.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import com.frameium.pageobject.ODBM.ODBMVolunteer;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class VolunteerBreadTest {
    private Logger log = LoggerHelper.getLogger(GenericFunctions.class);
    WebDriver driver;
    TestSetUp setUp;
    GenericFunctions genericFunctions;
    ODBMVolunteer volunteer;

    public VolunteerBreadTest(TestSetUp setUp){
        this.driver = setUp.baseTest.driver;
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        volunteer = new ODBMVolunteer(setUp.baseTest.driver);
    }

    @When("User click on the volunteer and it get navigated to next tab")
    public void userClickOnTheVolunteerAndItGetNavigatedToNextTab() throws Exception {
        volunteer.volunteerOdbm();
        volunteer.redirectedTab();
    }

}
