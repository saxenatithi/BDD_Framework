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
Feature: Testing Sign-up button feature for E-commerce website

  Background: User must be on homepage of the E-commerce website
    Given User must be on homepage of the E-commerce website by clicking "https://www.demoblaze.com/"
    When User should click on signup button.

  @Unit
  Scenario: Clicking on Sign-up button on homepage.
    Then Sign-up dialog box should be displayed.

  @Smoke
  Scenario: User should be able to sign up with valid username and password.
    And Enter valid username and password
    And Click on signup
    Then A successful pop-up should be displayed saying "Sign up successful"
    And User should click on ok button.
