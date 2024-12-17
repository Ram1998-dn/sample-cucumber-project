package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

    }

    @When("I click on the register link")
    public void iClickOnTheRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the register text heading")
    public void iShouldSeeTheRegisterTextHeading() {
        Assert.assertEquals(new RegisterPage().getRegisterText(), "Register");
    }


    @When("I select the gender {string}")
    public void iSelectTheGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }


    @And("I enter email a {string}")
    public void iEnterEmailA(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password a {string}")
    public void iEnterPasswordA(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I confirm the password {string}")
    public void iConfirmThePassword(String confPassword) {
        new RegisterPage().enterConfirmPassword(confPassword);

    }

    @And("I click on the register button")
    public void iClickOnTheRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the message Your registration completed")
    public void iShouldSeeTheMessageYourRegistrationCompleted() {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(), "Your registration completed");
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        new RegisterPage().clickOnContinueButton();

    }



    @Then("I should see the error message First name is required.")
    public void iShouldSeeTheErrorMessageFirstNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("FirstName"),"First name is required.","First name is required");
    }

    @And("I should see the error message Last name is required.")
    public void iShouldSeeTheErrorMessageLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("LastName"),"Last name is required.","Last name is required");
    }

    @And("I should see the error message Email is required.")
    public void iShouldSeeTheErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"),"Email is required.","Email is required");
    }

    @And("I should see the error message password is required.")
    public void iShouldSeeTheErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Password"),"Password is required.","Password is required");
    }

    @And("I should see the error message confirm password is required.")
    public void iShouldSeeTheErrorMessageConfirmPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm password"),"Password is required.","Confirm password is required");
    }
}
