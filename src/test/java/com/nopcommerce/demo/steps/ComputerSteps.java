package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on the COMPUTER tab")
    public void iClickOnTheCOMPUTERTab() {
        new HomePage().clickOnMenuTab("COMPUTERS");
    }

    @Then("I should see the text Computers")
    public void iShouldSeeTheTextComputers() {
        Assert.assertEquals(new ComputerPage().getPageTitleText(),"Computers","Computers text is not displayed");
    }

    @And("I click on the Desktops link")
    public void iClickOnTheDesktopsLink() {
        new ComputerPage().clickOnSubMenu("Desktops");

    }


    @Then("I should see the text Desktops")
    public void iShouldSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopsPage().getPageTitleText(),"Desktops","Desktops text is not displayed");
    }

    @And("I click on the product name {string}")
    public void iClickOnTheProductName(String productName) {
        new DesktopsPage().selectProduct("Build your own computer");

    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processorName) {
        new BuildYourOwnComputerPage().selectProcessor(processorName);

    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ramGB) {
        new BuildYourOwnComputerPage().selectRam(ramGB);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hDdGB) {
        new BuildYourOwnComputerPage().selectHDD(hDdGB);
    }

    @And("I select OS {string}")
    public void iSelectOS(String oSName) {
        new BuildYourOwnComputerPage().selectOS(oSName);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String softwareName) {
        new BuildYourOwnComputerPage().selectSoftware(softwareName);
    }

    @And("I click on the Add to Cart button")
    public void iClickOnTheAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should see the message The product has been added to your shopping cart")
    public void iShouldSeeTheMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(),"The product has been added to your shopping cart","The product has been added to your shopping cart is not displayed");
    }
}
