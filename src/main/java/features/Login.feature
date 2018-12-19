@Login
Feature: Login on eMAG

  Scenario: Login with valid credentials
    Given user is on eMAG page
    When user wants to access his account
    And user enters his email
    And user enters the password
    And user click on Login button
    Then a new page with a welcome message is displayed
