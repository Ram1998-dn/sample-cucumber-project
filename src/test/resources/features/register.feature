@regression
  @Register
  Feature: Register page Functionality
    As a user, I want to register on the website so that I can create an account.

    @smoke @sanity
    Scenario: Verify the user can successfully navigate to the registration page
      Given I am on the homepage
      When I click on the register link
      Then I should see the register text heading

      Scenario:User can successfully register with valid details
        Given I am on the homepage
        When I click on the register link
        When I select the gender "Male"
        And I enter first name "Johne"
        And I enter last name "Doee"
        And I enter email a "johndoe1233@example.com"
        And I enter password a "Password1234"
        And I confirm the password "Password1234"
        And I click on the register button
        Then I should see the message Your registration completed
        And I click on the continue button


    @sanity
    Scenario: Verify that first name, last name, email, password, and confirm password fields are mandatory
      Given I am on the homepage
      When I click on the register link
      And I click on the register button
      Then I should see the error message First name is required.
      And I should see the error message Last name is required.
      And I should see the error message Email is required.
      And I should see the error message password is required.
      #And I should see the error message confirm password is required.




