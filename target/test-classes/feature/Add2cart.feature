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
@tag
Feature: Testing add to cart feature

  Background: 
    Given User must be logged in on "https://www.demoblaze.com/" and on "#nameofuser" page

  @tag1
  Scenario: User should Add items to cart
    When User click on Categories option
    And Add one Phone, one Laptop and a Monitor to Cart
    Then User should see a propmt message "Product added." and click ok.

  Scenario: User should place order successfully.
    When User click on cart option
    And User click on Place order button
    Then Dialog box should open to enter details to place order
    And after clicking on purchase. User must see successful message saying "Thank you for your purchase!"
