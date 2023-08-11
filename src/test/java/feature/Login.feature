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
Feature: Testing Login feature for a website

  @Regression
  Scenario Outline: Checking functionality for login page
    Given user must be on login page of url "https://demo.applitools.com/"
    When User must enter valid <username> and <password>
    And User should click on sign in button
    Then User must navigate to there account page "https://demo.applitools.com/app.html"

    Examples: 
      | username | password |
      | jsh      | sdfw1%   |
      | jamie1!  | Fidbw    |
      | divy12   | tiheew   |
