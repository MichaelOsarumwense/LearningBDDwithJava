Feature: Login Action

  Scenario : Successful Login with valid credentials
    Given user is on home page
    When user navigates to login page
    And user enters username and password
    When the user clicks on login button
    Then message displays login successful

