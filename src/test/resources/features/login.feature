@regression
Feature: Login Functionality
  In Order to perform successful login
  As a User
  I have to enter correct username and password
  @smoke @author_nidhi
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
  @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                            |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect |
      | xyz123@gmail.com   | abc1234   | Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  Scenario: User should log out successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "nn24@gmail.com"
    And I enter password "8$Meqe!d!eGpf"
    And I click on login button
    And I click on logout link
    Then I should  see the login link displayed



