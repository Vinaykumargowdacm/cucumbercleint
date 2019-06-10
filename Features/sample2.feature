
Feature: Product search
 
  Scenario: Search for Headphones
    Given User should login
    When user search "Headphones"
    Then User should logout

 
  Scenario: Search for Laptop
  Given User should login
  When user Search "Laptop"
  Then User should logout
