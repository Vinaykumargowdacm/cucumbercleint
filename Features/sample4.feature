Feature: Testmeapp trace
 #@login
  Scenario: login
    Given  user do login
  
    
   # @search
    Scenario: Search
    When search product
    And Add to cart
    
   # @payment
    Scenario: Payment
    When Select payment option
    And Make payment
    
   # @success
    Scenario: Success
    When Close Test me application
    