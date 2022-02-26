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

Feature: ECommerce Application

@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank test

@RegressionTest
Scenario: UnSuccessful Login
Given This is a blank test

@SmokeTest 
Scenario: Add a product to bag
Given This is a blank test

Scenario: Add multiple product to bag
Given This is a blank test

@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given This is a blank test

@RegressionTest
Scenario: Remove all products from bag
Given This is a blank test

@SmokeTest
Scenario: product quantity from bag page
Given This is a blank test

Scenario: Decrease product quantity from bag page
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank test

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank test

@End2End
Scenario Outline: Payment declined
Given This is a blank test
Examples:
|PaymentMethod|
|CC Card|
|DD Card|
|Bank Transfer|
|PayPal|
|Cash|