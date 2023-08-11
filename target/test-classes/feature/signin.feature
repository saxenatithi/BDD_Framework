#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Testing Signin feature

  Background: 
    Given User should be on e-com website url "https://www.demoblaze.com/"
    When User to click on login button

  @Unit
  Scenario: Testing signing feature for E-commerce website
    Then login dialog box should be displayed.

  @Smoke
  Scenario Outline: 
    And User to enter valid <user_name> and <passwrd>
    And Click on Login
    Then User must be on "#nameofuser"

    Examples: 
      | user_name | passwrd  |
      | jamie1    | jam      |
      | tithi980  | Tithi980 |
      | Te&2231   | 4235ar!  |
