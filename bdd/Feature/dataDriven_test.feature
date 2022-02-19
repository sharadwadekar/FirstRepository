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
Feature: Data Driven test for Zarodha
  
   Scenario Outline: Login test for zarodha

    Given User is on Login Page
    When User enters "<username>" and "<password>"
    And User enter "<pin>"

    When User LogOut from the Application
    Then Message displayed LogOut Successfully
    And user close the web browser
    
    Examples: 
      |username  |password   |pin     |
      |XA0634    |Sarika699! |691991  |
      |ED7019    |Snake$123  |123456  |
