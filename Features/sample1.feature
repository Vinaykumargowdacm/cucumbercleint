
Feature: Login to Testmeapp successfully

 
  Scenario: Testmeapp login procedure
    Given Users opens Testmeapp
    When Enter usernamre "lalitha"
    And enter password "password123"
    When Click login button
    Then Close application

 