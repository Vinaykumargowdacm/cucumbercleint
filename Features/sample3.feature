
Feature: multiple data in testmeapp
  


 
  Scenario Outline: Search different items
    Given User performs login 
    When Search for different "<Items>" 
    Then do nothing
   

    Examples: 
      | Items |
      |Headphones|
      |Travel Kit|
      |Laptop|
