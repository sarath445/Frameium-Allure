package com.frameium.stepdef.Ufs;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.UFS.T24homepage;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.Then;

public class EnvironmentCheckupTest {
    private GenericFunctions genericFunctions;

    Hooks hooks = new Hooks();
    TestSetUp setUp;
    public EnvironmentCheckupTest(TestSetUp setUp) {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
    }
    @Then("check whether the date is in Sync")
    public void checkWhetherTheDateIsInSync() {
        T24homepage TH=new T24homepage();
        TH.cobDateCheck();
        //hooks.takeScreenshot(hooks.scenario);
      //  setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        hooks.screenNew(hooks.scenario);
        TH.cobDateCheckk();
    }


}
