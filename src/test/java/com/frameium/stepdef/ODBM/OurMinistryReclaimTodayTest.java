package com.frameium.stepdef.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.ODBM.ODBMReclaimConnect;
import com.frameium.pageobject.ODBM.ODBMReclaimShopping;
import com.frameium.pageobject.ODBM.OurMinistryReclaimToday;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OurMinistryReclaimTodayTest {
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    GenericFunctions genericFunctions;
    WebDriver driver;
    OurMinistryReclaimToday reclaim;
    ODBMReclaimShopping shop;
    ODBMReclaimConnect connect;

    public OurMinistryReclaimTodayTest(TestSetUp setUp){
           this.setUp = setUp;
           this.driver = setUp.baseTest.driver;
           genericFunctions = new GenericFunctions(setUp.baseTest.getDriver());
           reclaim = new OurMinistryReclaimToday(setUp.baseTest.driver);
           shop = new ODBMReclaimShopping(setUp.baseTest.driver);
           connect = new ODBMReclaimConnect(setUp.baseTest.driver);
    }


    @Given("user hovering to Our Ministry title and click {string} option")
    public void userHoveringToOurMinistryTitleAndClickOption(String ministry) {
        reclaim.selectOurministry(ministry);

    }

    @When("user entering the feelings {string} and hit enterkeys")
    public void userEnteringTheFeelingsAndHitEnterkeys(String search) throws Exception {
        reclaim.passingInputEnters(search);
    }

    @And("user click on the Advanced search toggle button and verify")
    public void userClickOnTheAdvancedSearchToggleButtonAndVerify() throws Exception {
        reclaim.setToggle(true);
    }

    @Then("user select the author name {string} in the dropdown")
    public void userSelectTheAuthorNameInTheDropdown(String authorName) throws Exception {
        reclaim.authorSelection(authorName);
    }

    @When("user click on the more option and verify whether it is enabled or disabled")
    public void userClickOnTheMoreOptionAndVerifyWhetherItIsEnabledOrDisabled() throws Exception {
        boolean more = reclaim.moreOptions();
        Assert.assertTrue(more, "toggle was disabled");
    }

    @Then("user need to verify the more words based on the feelings")
    public void userNeedToVerifyTheMoreWordsBasedOnTheFeelings() throws Exception {
        reclaim.moreWords();
    }

    @When("user mouse hovering to Shop and click the {string} option from the dropdown")
    public void userMousehoveringToShopAndClickTheOptipnFromTheDropdown(String category) throws Exception {
        shop.reclaimShopping(category);
    }

    @Then("user should select the size of the costumes {string} in the dropdown")
    public void userShouldSelectTheSizeOfTheCostumesInTheDropdown(String size) throws Exception {
        Thread.sleep(2500);
        shop.shirtSizeselection(size);
    }

    @And("user adding some quantity of items to the cart")
    public void userAddingSomeQuantityOfItemsToTheCart() throws Exception {
        Thread.sleep(2000);
        shop.addQuantity();
    }

    @And("user is able to add to cart and view the added items")
    public void userIsAbleToAddToCartAndViewTheAddedItems() throws Exception {
        shop.addView();
    }

    @When("user mouse hovering to the Connect with God and click the {string} option from the dropdown")
    public void userMouseHoveringToTheConnectWithGodAndClickTheOptionFromTheDropdown(String category) throws Exception {
        connect.connectWithGodReclaim(category);
        Thread.sleep(2000);
        String expectedText = "Prayers";
        String expectedPara = "Building a Christian prayer life can be difficult—perhaps you don’t know how to pray, or maybe you don’t feel like praying. We hope our simple prayers written for practical, everyday life situations can provide some guidance and help you connect with God, wherever you are, and in whatever you’re doing!";
        Assert.assertTrue(connect.vfyPrayermessage(expectedText,expectedPara), "text and paragraph are don't match");
    }



}
